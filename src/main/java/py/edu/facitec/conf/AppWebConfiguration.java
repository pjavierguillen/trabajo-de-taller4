package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;
import py.edu.facitec.dao.ClienteDao;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, ClienteDao.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
    
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/static/");
        resolver.setSuffix(".html");

        resolver.setCache(false); //Agregado al proyecto, figura en el manual
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    @Bean  	
    public FormattingConversionService mvcConversionService() 
    { 
     	DefaultFormattingConversionService conversionService =  	new DefaultFormattingConversionService(true);
     	DateFormatterRegistrar registrar = new DateFormatterRegistrar(); 
     	registrar.setFormatter(new DateFormatter("yyyy-MM-dd"));  
     	registrar.registerFormatters(conversionService); 
     	return conversionService; 
     	} 


}
