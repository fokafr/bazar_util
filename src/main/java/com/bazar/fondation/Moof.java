package com.bazar.fondation;

public class Moof {
 private int moofValue;
 
 Moof(int val){
	 moofValue = val; 
 }
 
 public int getMoofValue() {
	 return moofValue;
 }
 
 //Override equals method
 //equals(), hashCode(), and toString() methods are
 //all public.
 
 public boolean equals(Object o) {
  if((o instanceof Moof) && ((Moof) o).getMoofValue()== this.moofValue) return true;
  else	 return false;
	 
 }
 
 
}
