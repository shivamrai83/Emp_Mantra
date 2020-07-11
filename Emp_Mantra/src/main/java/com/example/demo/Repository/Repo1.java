package com.example.demo.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Date;

public interface Repo1 extends JpaRepository<Date, Integer> {

	

}
