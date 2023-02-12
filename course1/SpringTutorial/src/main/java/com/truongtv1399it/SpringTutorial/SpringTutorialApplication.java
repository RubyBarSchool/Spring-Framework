package com.truongtv1399it.SpringTutorial;

import com.truongtv1399it.SpringTutorial.properties.SomeExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import com.truongtv1399it.SpringTutorial.BBSort;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringTutorialApplication {

	@Autowired
	private Algorithm treeSort;

	@Autowired
	private Algorithm BBSort;

	public static void main(String[] args) {
	    ApplicationContext applicationContext = SpringApplication.run(SpringTutorialApplication.class, args);
		SomeExternalService  someExternalService = (SomeExternalService) applicationContext.getBean("someExternalService");

		BBSort bbSort = (BBSort) applicationContext.getBean("BBSort");
		bbSort.run();
		System.out.println(someExternalService.getUrl());
	}

}
