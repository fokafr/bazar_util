package com.bazar.fondation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Req: contrairement à l'interface comparable, l'implémentation de la methode compare
 * ne se fait pas dans le bean
 * 
 */

public class ComparatorTest {

	
class GenreSort implements Comparator<DVDInfo> {
		public int compare(DVDInfo one, DVDInfo two) {
		return one.getGenre().compareTo(two.getGenre());
		}	

}

public static void main(String[] args) {
   new ComparatorTest().go();
}


public void go() {
	ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();
	ComparatorTest.populateList(dvdlist);
   
Collections.sort(dvdlist);
System.out.println(dvdlist); // output sorted by title
System.out.println("-------------------------");
GenreSort gs = new GenreSort();
Collections.sort(dvdlist, gs);
System.out.println(dvdlist); // output sorted by genre
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
