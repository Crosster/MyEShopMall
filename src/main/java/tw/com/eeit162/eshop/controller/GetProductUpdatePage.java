package tw.com.eeit162.eshop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.com.eeit162.eshop.conn.MyConnectionFactory;
import tw.com.eeit162.eshop.model.bean.Product;
import tw.com.eeit162.eshop.model.dao.ProductDAO;

import java.io.IOException;
import java.sql.Connection;
@WebServlet(urlPatterns = "/GetProductUpdatePage.do")
public class GetProductUpdatePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pID=Integer.valueOf(request.getParameter("pID"));
		
		try {
			Connection conn = MyConnectionFactory.getConnection();
			ProductDAO pDAO = new ProductDAO(conn);			
			Product p = pDAO.findProductByID(pID);
			conn.close();
			
			request.setAttribute("pData", p);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
