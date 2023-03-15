package tw.com.eeit162.eshop.model.bean;

import java.util.Arrays;

public class Product {
	private int pID;
	private String name;
	private String type;
	private byte[] photo;
	private int f_mID;
	
	public Product() {
	}
	
	public Product(int pID, String name, String type, byte[] photo, int f_mID) {
		this.pID = pID;
		this.name = name;
		this.type = type;
		this.photo = photo;
		this.f_mID = f_mID;
	}
	
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public int getF_mID() {
		return f_mID;
	}
	public void setF_mID(int f_mID) {
		this.f_mID = f_mID;
	}
	
	@Override
	public String toString() {
		return "Product [pID=" + pID + ", name=" + name + ", type=" + type + ", photo=" + Arrays.toString(photo)
				+ ", f_mID=" + f_mID + "]";
	}
}
