package com.bazar.training.algorithmique;

public class AlgoNumerique {

	public static void main(String[] args) {
		//System.out.println(fubo(10));
		int a = 3;
		int b = 5;
		System.out.println(a+"  "+b);
		System.out.println("----------------");
		permut(a,b);
		System.out.println(a+"  "+b);

	}
	
	static int fubo(int n){
		if(n==0 || n==1) return 1;
		else return fubo(n-1)+fubo(n-2);
	}
	
	static void permut(int a, int b){
		int temp;
		temp = a;
		b=a;
		b = temp;
	}
	
	static void permutSanTemp(int a, int b){
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	static int  binarySearch(int[] a, int cle){
		int debut = 0;
		int fin = a.length - 1;
		while(debut <= fin){
			int milieu = (debut + fin)/2;
			if(a[milieu] < cle ) debut = milieu + 1;
			else if (a[milieu]> cle) fin = milieu - 1;
			else  return milieu; // trouvé
		}
		return -(debut + 1); // pas trouvé.
	}
	
	
	

}
	