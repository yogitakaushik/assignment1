package com.app.entities;

public class Hyndai extends Car {
    int id,resale_value,price;
    String model;
    /**
     *
     * @param id
     * @param model
     */
    public Hyndai(int id,String model,int price)
   {
    super(id,model,price);
       this.id=id;
       this.model=model;
     
       resale_value=price-(40/100*(price));
   }
	
}
