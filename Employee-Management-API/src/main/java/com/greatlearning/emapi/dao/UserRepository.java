package com.greatlearning.emapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.emapi.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
