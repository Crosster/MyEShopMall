package tw.com.eeit162.eshop.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tw.com.eeit162.eshop.model.bean.Member;
import tw.com.eeit162.eshop.model.bean.Product;
import tw.com.eeit162.eshop.model.bean.Product;


public class ProductDAO {
	private Connection conn;

	public ProductDAO(Connection conn) {
		this.conn = conn;
	}
	
	public List<Product> findProductByName(String name) {
		try {
			String SQL = "SELECT * FROM [MyEShopMall].[dbo].[Product] WHERE name LIKE ?";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setString(1,"%" + name + "%");
			ResultSet rs = preStmt.executeQuery();
			
			List<Product> pList = new ArrayList<Product>();
			while(rs.next()) {
				Product product = new Product();
				
				product.setpID(rs.getInt("pID"));
				product.setName(rs.getString("name"));
				product.setType(rs.getString("type"));
				product.setPrice(rs.getInt("price"));
				product.setNumber(rs.getInt("number"));
				product.setPhoto(rs.getBytes("photo"));
				product.setF_mID(rs.getInt("f_mID"));
				
				pList.add(product);
			}
			rs.close();
			preStmt.close();
			return pList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 請傳mID進來，用mID比對f_mID
	 * @param f_mID
	 * @return
	 */
	public List<Product> findProductByf_mID(int f_mID) {
		try {
			String SQL = "SELECT * FROM [MyEShopMall].[dbo].[Product] WHERE f_mID = ?";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setInt(1, f_mID);
			ResultSet rs = preStmt.executeQuery();
			
			List<Product> pList = new ArrayList<Product>();
			while(rs.next()) {
				Product product = new Product();
				
				product.setpID(rs.getInt("pID"));
				product.setName(rs.getString("name"));
				product.setType(rs.getString("type"));
				product.setPrice(rs.getInt("price"));
				product.setNumber(rs.getInt("number"));
				product.setPhoto(rs.getBytes("photo"));
				product.setF_mID(rs.getInt("f_mID"));

				pList.add(product);
			}
			rs.close();
			preStmt.close();
			return pList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Product> findAllProducts() {
		try {
			String SQL = "SELECT * FROM [MyEShopMall].[dbo].[Product]";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			ResultSet rs = preStmt.executeQuery();
			
			List<Product> pList = new ArrayList<Product>();
			
			while(rs.next()) {
				Product product = new Product();
				product.setpID(rs.getInt("pID"));
				product.setName(rs.getString("name"));
				product.setType(rs.getString("type"));
				product.setPrice(rs.getInt("price"));
				product.setNumber(rs.getInt("number"));
				product.setPhoto(rs.getBytes("photo"));
				product.setF_mID(rs.getInt("f_mID"));
				
				pList.add(product);
			}
			rs.close();
			preStmt.close();
			return pList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateProduct(Integer pID, Product product) {
		try {
			String SQL = "UPDATE [MyEShopMall].[dbo].[Product] "
					+ "SET  [name] = ?, [type] = ?, [price] = ?, [number] = ? WHERE pID = ?";

			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setString(1, product.getName());
			preStmt.setString(2, product.getType());
			preStmt.setInt(3, product.getPrice());
			preStmt.setInt(4, product.getNumber());
			preStmt.setInt(5, product.getpID());
			preStmt.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
		
	}

	public Product findProductByID(int pID) {
		try {
			String SQL = "SELECT * FROM [MyEShopMall].[dbo].[Product] WHERE pID = ?";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setInt(1, pID);
			ResultSet rs = preStmt.executeQuery();
			
			if(rs.next()) {
				Product product = new Product();
				product.setpID(rs.getInt("pID"));
				product.setName(rs.getString("name"));
				product.setType(rs.getString("type"));
				product.setPrice(rs.getInt("price"));
				product.setNumber(rs.getInt("number"));
				product.setPhoto(rs.getBytes("photo"));
				product.setF_mID(rs.getInt("f_mID"));
				
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
