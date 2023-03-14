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

@WebServlet(urlPatterns = "/GetUpdatePage.do")
public class GetUpdatePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer mID=Integer.valueOf(request.getParameter("mID"));
			
		try {
			Connection conn = MyConnectionFactory.getConnection();
			MemberDAO mDAO = new MemberDAO(conn);			
			Member m = mDAO.findMemberByID(mID);
			
			conn.close();
			
			request.setAttribute("mData", m);
			request.setAttribute("mIDkv", m.getmID());
			request.getRequestDispatcher("updatePage.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
