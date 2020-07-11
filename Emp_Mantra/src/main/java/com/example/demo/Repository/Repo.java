package com.example.demo.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



//import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.MyModel;
//import com.mobiloitte.test.model.User;

public interface Repo extends JpaRepository<MyModel, Integer>{

	



	
}