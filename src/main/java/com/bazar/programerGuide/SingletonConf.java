package com.bazar.programerGuide;

public class SingletonConf {
 private static SingletonConf once_instance = null;

public SingletonConf() {
}

public static SingletonConf getInstance() {
	if(once_instance == null) {
				
		once_instance = new SingletonConf();
	}
	
	return once_instance;
	
}
 
 
	
}
