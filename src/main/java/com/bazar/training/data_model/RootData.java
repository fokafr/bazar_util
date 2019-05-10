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
		
		root.put("user", "Big Joe");
		
		// Create the "latestProduct" hash. We use a JavaBean here, but it could be a Map too.
		Product latestProduct = new Product();
		latestProduct.setUrl("products/greenmouse.html");
		latestProduct.setName("green mouse");
		
		// and put it into the root
		root.put("latestProduct", latestProduct);
		
		/*
		 *  The variables that act like directories (the root, animals, mouse, elephant, python, misc)
		 *  are called hashes. Hashes store other variables (the so called sub variables) by a lookup
		 *  name (e.g., "animals", "mouse" or "price").
		 */
		Animal mouse = new Animal();
		Animal elephant = new Animal();
		Animal python = new Animal();
		
		mouse.setSize("small");
		mouse.setPrice(50);
		elephant.setSize("large");
		elephant.setPrice(5000);
		python.setSize("medium");
		python.setPrice(4999);
		
		Map<String, Object> animals = new HashMap<String, Object>();
		animals.put("mouse", mouse);
		animals.put("elephant", elephant);
		animals.put("python", python);
		
		Misc misc = new Misc();
		misc.setMessage("Something");
		
		
		root.put("animals", animals);
		root.put("misc", misc);
		
		/*
		 * Another important kind of variables are sequences. They store subvariables like hashes, 
		 * but here subvariables doesn't have a name, they are just items in a list. For example,
		 * in this data-model, animals and misc.fruits are sequences:
		 */
		
		List animalsSeq = new ArrayList<Animal>();
		animalsSeq.add(mouse);
		animalsSeq.add(elephant);
		animalsSeq.add(python);
		root.put("animalsSeq",animalsSeq);
		
		List fruits = new ArrayList<String>();
		fruits.add("orange");
		fruits.add("banana");
		
		Misc miscSeq = new Misc();
		miscSeq.setFruits(fruits);
		
		root.put("miscSeq",miscSeq);
		
		return root;
	}
	
	
	
}
