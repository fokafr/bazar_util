package com.bazar.training.fileManage;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileManager {

	// On veut verifier l'existence d'un fichier dans un repertoire
	public static String findByRegex(File folder, Pattern filename) {
	    String path = null;
		if(folder.isDirectory()) {
			List<File> files = Arrays.asList(folder.listFiles());
			Iterator<File> iter = files.iterator();
			while(iter.hasNext() && path == null) {
				path = findByRegex(iter.next(),filename);
			}
			}
		else {
			Matcher matcher = filename.matcher(folder.getName().toLowerCase());
			if(matcher.find()) {
				path = folder.getAbsolutePath();
			}
			
		}
		return path;
	}
	
	/*
	 * La classe RegexFileFilter implémente l’interface FileFilter
	 *  et comprend la propriété pattern, soit le pattern que le fichier 
	 *  doit matcher pour être accepté:
	 */
	
	public static String findByFilter(File parent, Pattern filename) {
		String path = null;
		if(parent.isDirectory()) {
			RegexFileFilter filter = new RegexFileFilter(filename);
			File[] children = parent.listFiles(filter);
			if(children.length == 1) {
				path = children[0].getAbsolutePath();
			}
			else {
				List<File> files = Arrays.asList(parent.listFiles());
				Iterator<File> fileIterator = files.iterator();
				while(fileIterator.hasNext() && path == null) {
					path = findByFilter(fileIterator.next(), filename);
				}
			}
		}
		return path;
	}
	
}
