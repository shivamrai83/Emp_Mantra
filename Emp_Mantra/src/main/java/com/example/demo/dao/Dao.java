package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Repo;
import com.example.demo.Repository.Repo1;

import com.example.demo.Repository.Repo3;
import com.example.demo.Repository.Repo4;
import com.example.demo.model.Complain;
//import com.example.demo.Repository.Repo1;
//import com.example.demo.controller.List;
import com.example.demo.model.Date;
import com.example.demo.model.Holiday;
import com.example.demo.model.MyModel;


@Service
public class Dao {

@Autowired
private Repo repo;

@Autowired
private Repo1 repo1;

@Autowired
private Repo4 repo4;

@Autowired
private Repo3 repo3;

public Dao(Repo repo) {
} 

public void save(MyModel mymodel) {
	repo.save(mymodel);
	}

public List<MyModel> listAll1(){
	return repo.findAll();
}

public void delete(int id) {
	repo.deleteById(id);
}


public void save1(Date date) {
	repo1.save(date);
}

public List<Date> listAll() {
	return repo1.findAll();
}




public void save(Complain complain) {
	repo3.save(complain);
	
}

public List<Complain> listAll3() {
	return repo3.findAll();
}


public MyModel get(int id) {
	return repo.findById(id).get();
}
public Complain get3(int id) {
	return repo3.findById(id).get();
}
public void delete3(int id) {
	repo3.deleteById(id);
}




public void save4(Holiday holiday) {
	repo4.save(holiday);
}
public List<Holiday> listAll4(){
	return repo4.findAll();
}
public void delete4(int id) {
	repo4.deleteById(id);
}

}
