package com.app.entities;

public class Toyota extends Car {
    int id,resale_value,price;
    String model;
   public Toyota(int id,String model,int price)
   {
     super(id,model,price);
       this.id=id;
       this.model=model;
       price=800000;
       resale_value=price-(80/100*(price));
   }
	

}
