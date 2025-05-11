package com.sid.Repositary;

import org.springframework.data.repository.CrudRepository;

import com.sid.Entity.Doctor;

public interface IDoctorRepo extends CrudRepository<Doctor,Integer>
{

}