package com.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sid.Entity.Actor;
import com.sid.Repositary.IActorRepo;
import com.sid.Service.IActorService;

@SpringBootApplication
public class BootIoc04CruDoperationsJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIoc04CruDoperationsJpaApplication.class, args);
		
		IActorService service = ctx.getBean("actorService",IActorService.class);
		
		try
		{
			Actor actor= new Actor();
			actor.setActName("Sidd");
			actor.setMovieName("Saaho");
			actor.setIncome(90000.0);
			String resultMsg = service.registerActor(actor);
			System.out.println(resultMsg);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
