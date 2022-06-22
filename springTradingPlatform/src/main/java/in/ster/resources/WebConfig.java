package in.ster.resources;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] servletConfigClasses= {ApplicationConfig.class};
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {

		String[] srr= {"/"};
		return srr;
	}

}
