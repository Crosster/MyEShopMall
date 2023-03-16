package tw.com.eeit162.eshop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.com.eeit162.eshop.conn.MyConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(urlPatterns = "/GetPhoto.do")
public class GetPhoto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if (request.getParameter("mID") != null) {
			System.out.println("getMemberPhoto");
			Integer mID = Integer.valueOf(request.getParameter("mID"));
			try {
				Connection conn = MyConnectionFactory.getConnection();
				
				PreparedStatement preState = conn.prepareStatement("SELECT * FROM [MyEShopMall].[dbo].[Member] WHERE mID = ?");
				preState.setInt(1, mID);
				ResultSet rs = preState.executeQuery();
				byte[] bytes = null;
				
				if (rs.next()) {
					bytes = rs.getBytes("pic");
				}
				
				rs.close();
				preState.close();
				conn.close();
				
				response.setContentType("image/png");
				ServletOutputStream out = response.getOutputStream();
				
				out.write(bytes);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (request.getParameter("pID") != null) {
			System.out.println("getProductPhoto");
			Integer pID = Integer.valueOf(request.getParameter("pID"));
			try {
				Connection conn = MyConnectionFactory.getConnection();
				
				PreparedStatement preState = conn.prepareStatement("SELECT * FROM [MyEShopMall].[dbo].[Product] WHERE pID = ?");
				preState.setInt(1, pID);
				ResultSet rs = preState.executeQuery();
				byte[] bytes = null;
				
				if (rs.next()) {
					bytes = rs.getBytes("photo");
				}
				
				rs.close();
				preState.close();
				conn.close();
				
				response.setContentType("image/png");
				ServletOutputStream out = response.getOutputStream();
				
				out.write(bytes);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}
