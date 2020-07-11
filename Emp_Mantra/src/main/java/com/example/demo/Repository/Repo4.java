package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Holiday;

public interface Repo4 extends JpaRepository<Holiday, Integer> {

}
