package tw.com.eeit162.eshop.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tw.com.eeit162.eshop.model.bean.Member;

public class MemberDAO {
	private Connection conn;

	public MemberDAO(Connection conn) {
		this.conn = conn;
	}
	
	public boolean createMember(Member member){		
		try {
			String SQL = "INSERT INTO [MyEShopMall].[dbo].[Member] (email, password, name, age, address) VALUES (?,?,?,?,?)";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setString(1, member.getEmail());
			preStmt.setString(2, member.getPassword());
			preStmt.setString(3, member.getName());
			preStmt.setInt(4, member.getAge());
			preStmt.setString(5, member.getAddress());	
			preStmt.executeUpdate();
			
			preStmt.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	/**
	 * 
	 * @param mID
	 * @return
	 */
	public Member findMemberByID(int mID) {
		try {
			String SQL = "SELECT * FROM [MyEShopMall].[dbo].[Member] WHERE mID = ?";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setInt(1, mID);
			ResultSet rs = preStmt.executeQuery();
			
			if(rs.next()) {
				Member member = new Member();
				member.setmID(rs.getInt("mID"));
				member.setEmail(rs.getString("email"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				member.setAddress(rs.getString("address"));
				
				rs.close();
				preStmt.close();
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Member> findAllMembers() {
		try {
			String SQL = "SELECT * FROM [MyEShopMall].[dbo].[Member]";
			PreparedStatement preStmt = conn.prepareStatement(SQL);
			ResultSet rs = preStmt.executeQuery();
			
			List<Member> mList = new ArrayList<Member>();
			
			while(rs.next()) {
				Member member = new Member();
				member.setmID(rs.getInt("mID"));
				member.setEmail(rs.getString("email"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				member.setAddress(rs.getString("address"));
				
				mList.add(member);
			}
			rs.close();
			preStmt.close();
			return mList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 
	 * @param mID
	 * @param member
	 * @return
	 */
	public boolean updateMember(int mID,Member member) {
		try {
			String SQL = "UPDATE [MyEShopMall].[dbo].[Member] "
					+ "SET [email] = ?, [password] = ?, [name] = ?, [address] = ? WHERE mID = ?";

			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setString(1, member.getEmail());
			preStmt.setString(2, member.getPassword());
			preStmt.setString(3, member.getName());
			preStmt.setString(4, member.getAddress());
//			preStmt.setString(5, member.getAuthority());
			preStmt.setInt(5, member.getmID());
			preStmt.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	public boolean deletedMemberbyID(int mID) {		
		try {
			String SQL = "DELETE FROM [MyEShopMall].[dbo].[Member] WHERE mID = ?";

			conn.setAutoCommit(false);

			PreparedStatement preStmt = conn.prepareStatement(SQL);
			preStmt.setInt(1, mID);
			preStmt.executeUpdate();

			conn.commit();
			conn.setAutoCommit(true);

			return true;
		} catch (SQLException e) {
			try {
				conn.rollback();
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return false;
	}
	

}
