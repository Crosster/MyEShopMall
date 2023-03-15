package tw.com.eeit162.eshop.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tw.com.eeit162.eshop.model.bean.Member;
import tw.com.eeit162.eshop.model.bean.Product;


public class ProductDAO {
	private Connection conn;

	public ProductDAO(Connection conn) {
		this.conn = conn;
	}
	
	public Product findMemberByName(String name) {
		try {
			String SQL = "SELECT * FROM [MyEShopMall].[dbo].[product] WHERE name = ?";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setString(1, name);
			ResultSet rs = preStmt.executeQuery();
			
			if(rs.next()) {
				Product product = new Product();
				product.setpID(rs.getInt(""));
				product.setName(rs.getString(""));
				product.setType(rs.getString(""));
				product.setPhoto(rs.getBytes(""));

				
				rs.close();
				preStmt.close();
				return product;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
