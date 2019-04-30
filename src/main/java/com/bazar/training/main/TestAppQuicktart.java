package com.bazar.training.main;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import com.bazar.programerGuide.Intro;
import com.bazar.training.data_model.RootData;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class TestAppQuicktart {

	public static void main(String[] args) throws IOException, TemplateException {
		/* Create and adjust the configuration singleton */
		Intro.setConfig();
		
		
	   //RootData rootdata = new RootData();
		
		/* Get the template (uses cache internally) */
		Template templ = Intro.setConfig().getTemplate("test.ftlh");
        
        /*  /* Create a data-model, Merge data-model with template */
        Writer out = new OutputStreamWriter(System.out);
        templ.process(new RootData().buildDataModel() , out);
        
        
        
	}

}
