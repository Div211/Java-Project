package edu.jasp.store.model;
import java.util.List;
import java.util.Scanner;

public class Store {
private int id;
private String name;
private String address;
private long contact;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private List<Product>products;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "store [name=" + name + ",address=" + address + ",contact=" + contact + "]";
}

}