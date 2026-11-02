package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.Employee;

@Configuration
//@ComponentScan(basePackages = {"test","demo","NoUniqueBeanDefinition"})
public class MyConfig {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
}
