package tw.com.eeit162.eshop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.com.eeit162.eshop.conn.MyConnectionFactory;
import tw.com.eeit162.eshop.model.bean.Member;
import tw.com.eeit162.eshop.model.dao.MemberDAO;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.print.DocFlavor.STRING;

@WebServlet(urlPatterns = "/RegistMember.do")
public class RegistMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mEmail = request.getParameter("mEmail");
		String mPwd = request.getParameter("mPwd");
		String mName = request.getParameter("mName");
		int mAge =Integer.parseInt(request.getParameter("mAge"));
		String mAddress = request.getParameter("mAddress");
		byte[] mPic = request.getParameter("mPic").getBytes("ISO8859-1");
		String mAuthority = "user";
		
		try {
			Connection conn = MyConnectionFactory.getConnection();
			MemberDAO memberDAO = new MemberDAO(conn);
			
			Member m = new Member(mEmail, mPwd, mName, mAge, mAddress,mPic,mAuthority);
			System.out.println(m);
			memberDAO.createMember(m);
			
			conn.close();
			
			response.sendRedirect("login.jsp");
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
