package com.example.desafioWL.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.desafioWL.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
