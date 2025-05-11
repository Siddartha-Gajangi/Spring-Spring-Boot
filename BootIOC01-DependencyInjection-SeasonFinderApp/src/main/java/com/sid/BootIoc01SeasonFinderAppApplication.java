package com.sid;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sid.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIoc01SeasonFinderAppApplication {

	@Bean(name="date")
	public LocalDate createLDate() {
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(BootIoc01SeasonFinderAppApplication.class, args);
		SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
		String msg= finder.showSeason();
		System.out.println("Season "+msg);
		((ConfigurableApplicationContext)ctx).close();
	}

}
