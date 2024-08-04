package edu.jasp.store.controller;
import java.util.ArrayList;
import java.util.List;
import edu.jasp.store.model.Product;
import edu.jasp.store.model.Store;

public class controller {
	public static Store store = null;
	
	public Store getStore() {
		
		return store = new Store();
	}
	public void addProduct(Product product) {
		store.setProducts(new ArrayList<Product>());	
		List<Product> products = store.getProducts();
		products.add(product);
		}
	public void addProducts(List<Product>newProduct){
		store.getProducts().addAll(newProduct);
	}
}
