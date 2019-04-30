package com.bazar.training.data_model;

import java.util.HashMap;
import java.util.Map;

public class RootData {


	

	
	/*
	 * (root)
  |
  +- user = "Big Joe"
  |
  +- latestProduct
      |
      +- url = "products/greenmouse.html"
      |
      +- name = "green mouse"
	 */
	

	public  Map buildDataModel() {
		Map<String, Object> root = new HashMap<>();
		root.put("user", "Big Joe");
		
		// Create the "latestProduct" hash. We use a JavaBean here, but it could be a Map too.
		Product latestProduct = new Product();
		latestProduct.setUrl("products/greenmouse.html");
		latestProduct.setName("green mouse");
		
		// and put it into the root
		root.put("latestProduct", latestProduct);
		return root;
	}
	
	
	
}
