package com.bazar.programerGuide;

import java.io.File;
import java.io.IOException;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

public class Intro {


//https://freemarker.apache.org/docs/pgui_datamodel_method.html

	
	public static Configuration setConfig() throws IOException {
	
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_27);
		// Specify the source where the template files come from. Here I set a
		// plain directory for it, but non-file-system sources are possible too:
		configuration.setDirectoryForTemplateLoading(new File("src/main/java/templates"));
		configuration.setDefaultEncoding("UTF8");
		// Sets how errors will appear.
		// During web page *development* TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		// Don't log exceptions inside FreeMarker that it will thrown at you anyway:
		configuration.setLogTemplateExceptions(false);
		// Wrap unchecked exceptions thrown during template processing into TemplateException-s.
		configuration.setWrapUncheckedExceptions(true);
		
		return configuration;
	}
	
	
	
}
