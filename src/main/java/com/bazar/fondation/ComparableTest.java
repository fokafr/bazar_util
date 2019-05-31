package com.bazar.fondation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableTest {

	
/*Build by Aymar Lagarde FOKA*/
	
/* The Comparable interface is used by the Collections.sort() method and
the java.util.Arrays.sort() method to sort Lists and arrays of objects,
respectively. To implement Comparable, a class must implement a single method,
compareTo(). Here's an invocation of compareTo():	
 */

	public static void main(String[] args) {
	ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();
	ComparableTest.populateList(dvdlist);
	
	System.out.println("--------------- Avant le trie --------------------");
	for(DVDInfo dv:dvdlist) {
		System.out.println(dv.toString());
	}
	
	System.out.println("--------------- Après le trie --------------------");
	
	// le trie utilise par défaut l'implémentation de compareTo
	// Par défaut, c'est l'ordre naturel de trie qui est utilisé 
	Collections.sort(dvdlist);  
	
	for(DVDInfo dv:dvdlist) {
		System.out.println(dv.toString());
	}
	
}

	
public  static void populateList(ArrayList<DVDInfo> dvd ) {
	DVDInfo dvd1 = new DVDInfo("Donnie Darko","sci-fi", "Jake");
	DVDInfo dvd2 = new DVDInfo("Raiders of the Lost Ark","action", "Ford, Harrison");
	DVDInfo dvd3 = new DVDInfo("Caddy Shack","comedy", "Murray, Bill");
	DVDInfo dvd4 = new DVDInfo("Star Wars","sci-fi", "Ford, Harrison");
	DVDInfo dvd5 = new DVDInfo("Lost in Translation","comedy", "Murray, Bill");
	DVDInfo dvd6 = new DVDInfo("Patriot Games","action", "Ford, Harrison");
	
	dvd.add(dvd1);
	dvd.add(dvd2);
	dvd.add(dvd3);
	dvd.add(dvd4);
	dvd.add(dvd5);
	dvd.add(dvd6);
	
}
}