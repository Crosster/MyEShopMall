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
			
			conn.close();
			
			if(m!=null) {
				HttpSession session = request.getSession();
				session.setAttribute("username", m.getName());
				session.setAttribute("Authority", m.getAuthority());
				
				if(m.getAuthority()=="") {
//					request.getRequestDispatcher("index.jsp").forward(request, response);
					response.sendRedirect("modPage.jsp");
				}else {
					response.sendRedirect("userPage.jsp");
				}
			}else {
				response.sendRedirect("login.jsp");
	            PrintWriter out = response.getWriter();
				out.println("<font color=red>帳號或密碼錯誤，請重新登入。</font>");
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
