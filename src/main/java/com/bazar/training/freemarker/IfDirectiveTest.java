package com.bazar.training.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.bazar.programerGuide.Intro;
import com.bazar.training.data_model.RootData;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

public class IfDirectiveTest {
	 public static void excecute() throws Exception {
			
				/* Create and adjust the configuration singleton */
				Intro.setConfig();
				
				
			   //RootData rootdata = new RootData();
				
				/* Get the template (uses cache internally) */
				Template templ = Intro.setConfig().getTemplate("if_directive.ftl");
		        
		        /*  /* Create a data-model, Merge data-model with template */
		        Writer out = new OutputStreamWriter(System.out);
		        templ.process(new RootData().buildDataModel() , out);
		        
		        
		        
			
	 }
}
