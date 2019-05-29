package com.bazar.fondation;

public class EqualsTest {


	/*
	 * ---------- equals and == --------------------

	== comprare de references of 2 abjects
	use equals compare the objects. 
	two objects are considered equal only if the two
	references refer to the same object.  
	 */
			
	
	public static void main(String[] args) {
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if (one.equals(two)) {
		System.out.println("one and two are equal");
		}

	}

}
