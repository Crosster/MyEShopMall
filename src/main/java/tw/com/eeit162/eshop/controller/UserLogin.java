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
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet(urlPatterns = "/UserLogin.do")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        try {
			Connection conn = MyConnectionFactory.getConnection();
			MemberDAO memberDAO = new MemberDAO(conn);
			
			Member m = memberDAO.loginMember(email,password);
			System.out.println(m);
			conn.close();
			
			if(m.getName()!=null) {
				HttpSession session = request.getSession();
				session.setAttribute("mData", m);
				
				if(m.getAuthority().equals("admin")) {
//					request.getRequestDispatcher("index.jsp").forward(request, response);
					response.sendRedirect("modPage.jsp");
				}else
//					if(m.getAuthority().equals("shopper")) {
//					response.sendRedirect("shopperPage.jsp");
//				}else 
				{
					response.sendRedirect("userPage.jsp");
				}
			}else {
				request.setAttribute("logfailmsg", "登入失敗");
				request.getRequestDispatcher("main.jsp").forward(request, response);
			}
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
