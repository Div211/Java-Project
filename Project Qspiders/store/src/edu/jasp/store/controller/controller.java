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
		if(store.getProducts()==null) {
			store.setProducts(new ArrayList<Product>());	
			List<Product> products = store.getProducts();
			products.add(product);
		}else {
			store.getProducts().add(product);
		}
		
		}
	public void addProducts(List<Product>newProduct){
		if(store.getProducts()==null) {
			for(Product product: newProduct) {
				addProduct(product);
			}
		}else {
			store.getProducts().addAll(newProduct);
		}
	}
	public List<Product> getAllProduct(){
		return store.getProducts();
	}
	
	public void removeProduct(List<Integer>products) {
		List<Product> existingProduct = store.getProducts();
		ArrayList<Product> productToRemove = new ArrayList<Product>();
		//to change target
		for(Integer productTarget: products ) {
			//eliminate target
			int targerId = productTarget;
			for(Product productEliminator : existingProduct) {
				if(productEliminator.getId() == targerId) {
					productToRemove.add(productEliminator);
				}
			}
		}
		store.getProducts().removeAll(productToRemove);
	}
	
	public void updateProductName(int productIdToUpadate, String newName) {
		Product product = getProduct (productIdToUpadate);
		getProduct(productIdToUpadate).setName(newName);
	}
	public Product getProduct(int productId) {
		for(Product product : store.getProducts()) {
			if(product.getId()==productId) {
				return product;
			}
		}
		return null;
	}
}
