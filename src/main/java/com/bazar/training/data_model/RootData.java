package com.bazar.training.data_model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		Map<String, Object> root = new HashMap<String, Object>();
				
		// Create the "latestProduct" hash. We use a JavaBean here, but it could be a Map too.
						
		Product latestProduct = new Product();
		latestProduct.setUrl("products/greenmouse.html");
		latestProduct.setName("green mouse");
		
		// and all animals
		Animal mouse = new Animal();
		mouse.setSize("small");
		mouse.setPrice(50);
		
		Animal elephant = new Animal();
		elephant.setSize("large");
		elephant.setPrice(5000);
		
		Animal python = new Animal();
		python.setSize("medium");
		python.setPrice(4999);
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(mouse);
		animals.add(elephant);
		animals.add(python);
		Misc foo = new Misc();
		foo.setFoo("Something");
		
		// and put it into the root
		root.put("user", "Big Joe");
		root.put("latestProduct", latestProduct);
		root.put("message","It is a test");
		root.put("foo",foo);
		root.put("animals", animals);
		return root;
	}
	
	
	
}
