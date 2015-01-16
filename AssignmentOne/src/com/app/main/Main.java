package com.app.main;

import com.app.entities.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Main {
	
	public static int id;
	public static String name,model;
	public static int resale_value;
	public static  int price;
	static  Map<Integer,Customer> map1=new HashMap<Integer,Customer>();
        static List<Car> list = new ArrayList<Car>();
        static Set<Integer> setofkeys=map1.keySet();
        static Iterator<Integer> itr=setofkeys.iterator();
    static  Scanner s=new Scanner(System.in);
    
	public static void addcustomer()
	   {
		// Scanner s=new Scanner(System.in);
			
			System.out.println("enter id and name of customer");
			 id=getInteger();
                         System.out.println("Id : " + id);
//			String name=getLine();
                         String custName = getLine();
                         System.out.println("Name : " + custName);
//                         if(true)
//                         return;
                        Customer c=new Customer(id,custName);
                        
//			map1.put(id,name);
                        if(map1.get(id)==null)
                        {
                         map1.put(id, c);
                        }
                        else
                        {
                            System.out.println("user already exists");
                        }
			
	   }
	
	public static void addcar()
	   {
              
                 System.out.println("enter id,resale_value,price of car");
		 
               id = getInteger();
               Customer customer = map1.get(id);
               if(customer == null){
                   System.out.println("Customer does not exist");
                 // return;
               } 
               
		   
                 else
        {
                 int car_choose;
                 if(map1.get(id)!=null)
                         {
                //while(getLine().equals("\n"));  
                      System.out.println("1: order for toyota");
	              System.out.println("2: order for maruti");
                      System.out.println("3: order for hyundai");
                      car_choose=s.nextInt();
                     switch(car_choose)
                     {
                    case 1:
                    System.out.println("enter car id");
                     id=getInteger();
                     System.out.println("enter car model no.");
                     model=getLine();
                     System.out.println("enter car price");
                    price=getInteger();
                   Car e=new Toyota(id,model,price);
                   customer.getList().add(e);
//	        	mainList.add(e);
                    break;
                    
                    case 2:
                    System.out.println("enter car id");
                     id=getInteger();
                     System.out.println("enter car model no.");
                    model=getLine();
                    System.out.println("enter car price");
                     price=getInteger();
                    Car e1=new Maruti(id, model,price);
	        	 customer.getList().add(e1);
                    break;
                         
                    case 3:
                    System.out.println("enter car id");
                     id=getInteger();
                     System.out.println("enter car model no.");
                     model=getLine();
                     System.out.println("enter car price");
                     price=getInteger();
                    Car e2=new Hyndai(id,model,price);
	        	 customer.getList().add(e2);
                    break;
                     
                     default: break;
                     }
                         
                
                            }
	   }
           }
        
        public static void display()
        {
            System.out.println("display customer by their id");
            id=getInteger();
            Customer cust = map1.get(id);
            if(map1.get(id)!=null)
            {
             
            System.out.println("display id"+cust);
            
            for(Car c1:cust.getList())
            {
                System.out.println(c1);
            }
            }
            else
            {
                System.out.println("no user exists");
            }
        }
        
        public static void displayall()
        {
            for(Entry<Integer,Customer> entry : map1.entrySet())
            {
                Customer cust=entry.getValue();
                System.out.println("user id"+entry.getKey());
                System.out.println("user name"+cust.getName());
                for(Car car:list)
                {
                    System.out.println(list);
                }
            }
        }
      
          public static void prize()
        {
                     
        List<Integer> list11;
            list11 = new ArrayList<>();
        System.out.println("enter id for lucky draw");
        for(int i = 1; i <= 2; i++) 
        {
        System.out.println("enter id");
        id=getInteger();
        list11.add(id);
        }

       List<Integer> list1 = new ArrayList<>(map1.keySet());
        for(int j = 0; j <= 3; j++)
        {
        int randomIndex=new Random().nextInt(list1.size());
        Integer randomValue=list1.get(randomIndex);
        System.out.println("random values are"+randomValue);
     
        }
        list.retainAll(list1);
         System.out.println("winners"+list11);
        }
    
           
	public static void main(String args[])
	{
		 // Scanner s=new Scanner(System.in);
             
			/*System.out.println("enter id and name of customer");
		 id=s.nextInt();
		 name=s.nextLine();
			
	         System.out.println("enter id,resale_value,price of car");
	         resale_value=s.nextInt();
		 price=s.nextInt();*/
		
	        int choice;
	        do{
	        System.out.println("1: Add Customer");
	        System.out.println("2: Add car");
                System.out.println("3: display by their id");
               System.out.println("4: display all user");
                 System.out.println("5: prize distribution");
                System.out.println("6: Exit");
	        
	        choice = getInteger();
	        switch(choice){
	        case 1:
	        	addcustomer();
	           // Customer c1 = new Customer();  
	        	//mainlist.add(c1);
	        	break;
	        	
	        case 2:
	        	addcar();
	           // Customer c2 = new Customer();  
	        	//mainlist.add(c1);
	        	break;
                    
                case 3:
                    display();
                  break;
                    
                     case 4:
                  displayall();
                  break;
                    
                         
                     case 5:
                  prize();
                  break;
                    
	        default: break;
	        
	        }
	        
	        }while(choice!=3);
	       
               
	   	System.out.println(s);
			
		}
        
        private static String getLine(){
            String input;
            while(true){
                input = s.nextLine();
                if(!input.isEmpty()){
                    return input;
                }
            }
        }
        
        private static int getInteger(){
            String input;
            while(true){
                input = s.nextLine();
                if(!input.isEmpty()){
                    int a=Integer.parseInt(input);
                    return a ;
                }
            }
        }
}
