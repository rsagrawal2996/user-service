package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository(value = "userDao")
public interface UserDao extends JpaRepository<User, Integer> {
	public User findByUserId(String userId);

}



