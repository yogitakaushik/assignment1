package com.app.entities;

public class Maruti extends Car   {
    int id,resale_value,price;
    String model;
   public Maruti(int id, String model,int price)
   {
       super(id,model,price);
       this.id=id;
       this.model=model;
      
       resale_value=price-(60/100*(price));
   }
	

}
