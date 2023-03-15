package tw.com.eeit162.eshop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.com.eeit162.eshop.conn.MyConnectionFactory;
import tw.com.eeit162.eshop.model.bean.Member;
import tw.com.eeit162.eshop.model.bean.Product;
import tw.com.eeit162.eshop.model.dao.MemberDAO;
import tw.com.eeit162.eshop.model.dao.ProductDAO;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(urlPatterns = "/ShowAllProduct.do")
public class ShowAllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection conn = MyConnectionFactory.getConnection();
			ProductDAO productDAO = new ProductDAO(conn);
			List<Product> productList = productDAO.findAllProducts();
			
			conn.close();
			
			request.setAttribute("pList", productList);
			request.getRequestDispatcher("main.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
