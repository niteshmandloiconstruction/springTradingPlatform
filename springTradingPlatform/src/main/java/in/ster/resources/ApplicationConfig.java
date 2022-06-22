package in.ster.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "in.ster.ctl")
public class ApplicationConfig implements WebMvcConfigurer{

	/*  1st way without static resource without implementing WebMvcCofigurer
	 * 
	 * @Bean public InternalResourceViewResolver viewResolver() {
	 * 
	 * InternalResourceViewResolver internalResourceViewResolver = new
	 * InternalResourceViewResolver();
	 * internalResourceViewResolver.setPrefix("/WEB-INF/views/");
	 * internalResourceViewResolver.setSuffix(".jsp");
	 * return internalResourceViewResolver; }
	 */
	
	// 2nd way with static resource with implementing WebMvcCofigurer
	
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
	registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static_resources/");
	}
	
	
}
