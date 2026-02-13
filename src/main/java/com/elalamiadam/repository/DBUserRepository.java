package com.elalamiadam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elalamiadam.entity.DBUser;

public interface DBUserRepository extends JpaRepository<DBUser,Integer> {
    
    public DBUser findByUsername(String username);
}
