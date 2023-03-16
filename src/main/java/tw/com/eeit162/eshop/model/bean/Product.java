package tw.com.eeit162.eshop.model.bean;

import java.util.Arrays;

public class Product {

	private int pID;
	private String name;
	private String type;
	private int price;
	private int number;
	private byte[] photo;
	private int f_mID;
	
	public Product(int pID, String name, String type, int price, int number) {
		this.pID = pID;
		this.name = name;
		this.type = type;
		this.price = price;
		this.number = number;
	}
	
	public Product() {
	}
	
	public Product(int pID, String name, String type, byte[] photo, int f_mID) {
		this.pID = pID;
		this.name = name;
		this.type = type;
		this.photo = photo;
		this.f_mID = f_mID;
	}
	
	public Product(int pID, String name, String type, int price, int number, byte[] photo, int f_mID) {
		super();
		this.pID = pID;
		this.name = name;
		this.type = type;
		this.price = price;
		this.number = number;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
		return "Product [pID=" + pID + ", name=" + name + ", type=" + type + ", price=" + price + ", number=" + number
				+ ", f_mID=" + f_mID + "]";
	}
	
}
