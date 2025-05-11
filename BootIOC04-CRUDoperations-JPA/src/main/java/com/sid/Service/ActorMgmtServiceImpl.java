package com.sid.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sid.Entity.Actor;
import com.sid.Repositary.IActorRepo;

public class ActorMgmtServiceImpl implements IActorService {

	@Autowired
	private IActorRepo actorRepo;
	
	@Override
	public String registerActor(Actor actor) {
		System.out.println("act id(beforesave)::"+actor.getActId());
		Actor act = actorRepo.save(actor);
		
		return "Actor obj is saved with id value:"+act.getActId();
	}

}
