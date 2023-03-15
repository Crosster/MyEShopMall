package tw.com.eeit162.eshop.model.bean;

import java.io.Serializable;

public class Member implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int mID;
	private String email;
	private String password;
	private String name;
	private int age;
	private String address;
	private String authority;
	
	public Member() {
	}
	/**
	 * login
	 * @param email
	 * @param password
	 */
	public Member(String email,String password) {
		this.email = email;
		this.password = password;
	}
	/**
	 * update
	 * @param mID
	 * @param email
	 * @param password
	 * @param name
	 * @param address
	 */
	public Member(int mID,String email, String password, String name,String address) {
		this.mID = mID;
		this.email = email;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	/**
	 * regist
	 * @param email
	 * @param password
	 * @param name
	 * @param age
	 * @param address
	 */
	public Member(String email, String password, String name, int age, String address) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Member(int mID, String email, String password, String name, int age, String address, String authority) {
		this.mID = mID;
		this.email = email;
		this.password = password;
		this.name = name;
		this.age = age;
		this.address = address;
		this.authority = authority;
	}
	
	

	public int getmID() {
		return mID;
	}

	public void setmID(int mID) {
		this.mID = mID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Member [mID=" + mID + ", email=" + email + ", password=" + password + ", name=" + name + ", age=" + age
				+ ", address=" + address + ", authority=" + authority + "]";
	}
	
	
	
}
