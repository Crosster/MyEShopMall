package tw.com.eeit162.eshop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tw.com.eeit162.eshop.conn.MyConnectionFactory;
import tw.com.eeit162.eshop.model.bean.Member;
import tw.com.eeit162.eshop.model.dao.MemberDAO;

import java.io.IOException;
import java.sql.Connection;

@WebServlet(urlPatterns = "/UpdateMember.do")
public class UpdateMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer mID =Integer.valueOf(request.getParameter("mID"));
		String mEmail = request.getParameter("mEmail");
		String mPwd = request.getParameter("mPwd");
		String mName = request.getParameter("mName");
		String mAddress = request.getParameter("mAddress");
//		String mPic = request.getParameter("mPic");
		
		try {
			Connection conn = MyConnectionFactory.getConnection();
			MemberDAO memberDAO = new MemberDAO(conn);
			
			Member m = new Member(mID,mEmail, mPwd, mName, mAddress);
			memberDAO.updateMember(mID,m);
			
			conn.close();
			
			response.sendRedirect("index.jsp");
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
