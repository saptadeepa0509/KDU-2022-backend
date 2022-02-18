package com.kd.spring.jdbc.dao;

import com.kd.spring.jdbc.model.Actor;

import java.util.List;


public interface ActorDao {
    Actor getActorById(int id);
    List<Actor> getActorByFirstName(String firstName);
    List<Actor> getActorByLastName(String lastName);

}
