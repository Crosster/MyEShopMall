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
@WebServlet(urlPatterns = "/UpdateProduct.do")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pID =Integer.valueOf(request.getParameter("pID"));
		String pName = request.getParameter("pName");
		String pType = request.getParameter("pType");
		int pPrice = Integer.valueOf(request.getParameter("pPrice"));
		int pNumber = Integer.valueOf(request.getParameter("pNumber"));
//		String pPhoto = request.getParameter("pPhoto");
		
		try {
			Connection conn = MyConnectionFactory.getConnection();
			ProductDAO productDAO = new ProductDAO(conn);
			
			Product p = new Product(pID,pName,pType,pPrice,pNumber);
			productDAO.updateProduct(pID,p);
			
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
