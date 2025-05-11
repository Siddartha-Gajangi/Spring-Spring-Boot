package com.sid.conf;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.sid.sbeans")
public class AppConfig {
	public AppConfig() {
		
	}
@Bean(name="ldate")
public LocalDate createDate() {
	return LocalDate.now();
}
}	

