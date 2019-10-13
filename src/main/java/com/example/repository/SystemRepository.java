package com.example.repository;

import com.example.model.System;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemRepository extends JpaRepository<System, Long> {
    public System findByName(String name);
}
