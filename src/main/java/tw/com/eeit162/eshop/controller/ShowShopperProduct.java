package tw.com.eeit162.eshop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tw.com.eeit162.eshop.conn.MyConnectionFactory;
import tw.com.eeit162.eshop.model.bean.Member;
import tw.com.eeit162.eshop.model.bean.Product;
import tw.com.eeit162.eshop.model.dao.ProductDAO;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(urlPatterns = "/ShowShopperProduct.do")
public class ShowShopperProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Member m = (Member)session.getAttribute("mData");
		try {
			Connection conn = MyConnectionFactory.getConnection();
			ProductDAO productDAO = new ProductDAO(conn);
			List<Product> productList = productDAO.findProductByf_mID(m.getmID());
			
			conn.close();
			
			request.setAttribute("pList", productList);
			request.getRequestDispatcher("userPage.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
