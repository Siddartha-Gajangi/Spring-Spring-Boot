package com.sid.Factory;

import com.sid.comp.BikeEngine;
import com.sid.comp.IEngine;
import com.sid.comp.Person;
import com.sid.comp.CarEngine;

public class PersonFactory {

	public static Person getInstance(String engineType) {
		IEngine engine=null;
		if(engineType.equalsIgnoreCase("bike"))
			engine=new BikeEngine();
		else if(engineType.equalsIgnoreCase("car"))
			engine= new CarEngine();
		else
			throw new IllegalArgumentException("invalid counter type");
		Person p= new Person();
		p.setEngine(engine);
		return p;
	}
}
