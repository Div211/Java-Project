package edu.jasp.store.model;

public class Product {
private int id;
private String name;
private double price;
private int quantity;
private boolean availibility;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public boolean getAvailibility() {
	return availibility;
}
public void setAvailibility(boolean availibility) {
	this.availibility = availibility;
}
public Product(int id, String name,double price, int quantity, boolean availibility) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	this.availibility = availibility;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", availibility="
			+ availibility + "]";
}


}
