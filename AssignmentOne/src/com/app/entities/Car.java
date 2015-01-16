package com.app.entities;

abstract public class Car {
	int id;
        String model;
        int resale_value;
        int price;
 public Car(int id,String model,int price)
 {
     id=id;
     model=model;
     price=price;
 }
public String tostring()
{
    return "\n car_id"+this.id+"\n car_model"+this.model+"\n car_price"+this.price+"\n car_resale_value"+this.resale_value;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getResale_value() {
        return resale_value;
    }

    public void setResale_value(int resale_value) {
        this.resale_value = resale_value;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
		
}
