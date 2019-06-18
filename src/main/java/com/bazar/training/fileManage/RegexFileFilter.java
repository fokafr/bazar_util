package com.bazar.training.fileManage;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class RegexFileFilter implements FileFilter{
	
	private final Pattern pattern;
	
	public RegexFileFilter(Pattern p) {
		if(p == null) {
			throw new IllegalArgumentException("Pattern is Missing");
		}
		this.pattern = p;
	}
	
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
    return (pattern.matcher(pathname.getName()).matches());	
	}
 
}
