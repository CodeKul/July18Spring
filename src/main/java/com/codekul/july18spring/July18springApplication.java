package com.codekul.july18spring;

import com.codekul.july18spring.di.Company;
import com.codekul.july18spring.ioc.Jio;
import com.codekul.july18spring.ioc.SimConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class July18springApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(July18springApplication.class, args);
//		Jio jio  = context.getBean(Jio.class);
//		jio.message();
//		jio.call();

		Company company = context.getBean(Company.class);
		company.showEmp();

		ConfigurableApplicationContext context1 = new AnnotationConfigApplicationContext(SimConfig.class);

//		Jio jio1 = context1.getBean(Jio.class);
//		jio1.call();
	}

	@GetMapping("getMsg")
	public String getHiiMsg(){
		return "Hii";
	}


}
