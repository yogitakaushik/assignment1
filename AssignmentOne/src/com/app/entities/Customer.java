package com.app.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	 public int id;
	  public String name;
          
         List<Car> list=new ArrayList<Car>();

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }
    
    
         
         
}
