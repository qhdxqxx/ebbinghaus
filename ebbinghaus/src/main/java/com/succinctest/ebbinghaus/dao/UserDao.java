package com.succinctest.ebbinghaus.dao;

import org.springframework.stereotype.Repository;

import com.succinctest.ebbinghaus.po.User;

@Repository
public interface UserDao {
	public User getUserById(Long id);
}
