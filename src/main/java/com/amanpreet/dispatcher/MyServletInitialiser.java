package com.amanpreet.dispatcher;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.amanpreet.configuration.SpringConfig;

public class MyServletInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[0];
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringConfig.class};

	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
