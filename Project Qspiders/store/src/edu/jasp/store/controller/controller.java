package edu.jasp.store.controller;

import edu.jasp.store.model.Store;

public class controller {
	public static Store store = null;
	
	public Store getStore() {
		
		return store = new Store();
		
		
	}
}
