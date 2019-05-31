package com.bazar.fondation;

public class DVDInfo implements Comparable<DVDInfo>{

	String title;
	String genre;
	String leadActor;
	
	DVDInfo(String t, String g, String a) {
	title = t; genre = g; leadActor = a;
	}
	
	public String toString() {
		return title +"/ "+ " " + genre +"/ "+" " + leadActor + "\n";
		}
	
	public int compareTo(DVDInfo o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.getTitle());
		//return genre.compareTo(o.getGenre());
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getLeadActor() {
		return leadActor;
	}
 
	
	
}
