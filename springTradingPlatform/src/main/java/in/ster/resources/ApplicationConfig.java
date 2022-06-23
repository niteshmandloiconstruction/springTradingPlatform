package in.ster.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "in.ster")
public class ApplicationConfig implements WebMvcConfigurer {

	/*
	 * 1st way without static resource without implementing WebMvcCofigurer
	 * 
	 * @Bean public InternalResourceViewResolver viewResolver() {
	 * 
	 * InternalResourceViewResolver internalResourceViewResolver = new
	 * InternalResourceViewResolver();
	 * internalResourceViewResolver.setPrefix("/WEB-INF/views/");
	 * internalResourceViewResolver.setSuffix(".jsp"); return
	 * internalResourceViewResolver; }
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

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/hibernate");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
			
		return new JdbcTemplate(getDataSource());
	}

}


