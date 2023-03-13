package tw.com.eeit162.eshop.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tw.com.eeit162.eshop.model.bean.Member;

public class MemberDAO {
	private Connection conn;

	public MemberDAO(Connection conn) {
		this.conn = conn;
	}
	
	public boolean createMember(Member member){		
		try {
			String SQL = "INSERT INTO [dbo].[Member] (email, password, name, age, address) VALUES (?,?,?,?,?,?)";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setString(1, member.getEmail());
			preStmt.setString(2, member.getPassword());
			preStmt.setString(3, member.getName());
			preStmt.setInt(4, member.getAge());
			preStmt.setString(5, member.getAddress());	
			preStmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public Member findMemberByID(int mID) {
		try {
			String SQL = "SELECT * FROM [dbo].[Member] WHERE id = ?";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setInt(1, mID);
			ResultSet rs = preStmt.executeQuery();
			
			Member member = null;
			if(rs.next()) {
				member.setmID(rs.getInt("mID"));
				member.setEmail(rs.getString("email"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				member.setAddress(rs.getString("address"));
			}
			rs.getInt(mID);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	

}
