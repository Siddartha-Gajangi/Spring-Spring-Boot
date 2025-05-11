package com.sid.Repositary;

import org.springframework.data.repository.CrudRepository;

import com.sid.Entity.Actor;

public interface IActorRepo extends CrudRepository<Actor,Integer> {

}
