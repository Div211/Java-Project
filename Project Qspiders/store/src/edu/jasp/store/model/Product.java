package edu.jasp.store.model;

public class Product {
private int id;
private int name;
private int quantity;
private int availibility;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getName() {
	return name;
}
public void setName(int name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getAvailibility() {
	return availibility;
}
public void setAvailibility(int availibility) {
	this.availibility = availibility;
}
public Product(int id, int name, int quantity, int availibility) {
	super();
	this.id = id;
	this.name = name;
	this.quantity = quantity;
	this.availibility = availibility;
}
@Override
public String toString() {
	return "Product [id=" + id + ",\n name=" + name + ",\n quantity=" + quantity + ",\n availibility=" + availibility + "]";
}

}
