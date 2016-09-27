/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.car_8;

import java.util.*;

/**
 *
 * @author Мария
 */
public class Car {
 private String model;
 private String mark;
 private int year;
 private String color;
 private double price;
private String register_number;

final static String [] models={
  "Standart","Cherato","Range-Rover","Star Travaller","Light"  
};

final static String [] marks={
    "Honda","Hynday","Renault","Kia","Lanos","Chevrolet"
};

final static String [] colors={"white","black","red","green","yellow"};


final static String [] numbers={
    "XA 234780","AH 354789","KU 65242839","TO 875234","RO 38757","RE 7635489","WI 097644"
};

static Car [] cars;
static{
    Random r = new Random();
    cars = new Car[7];
    for(int i=0;i<cars.length;i++){
        Car c = new Car();
        c.setColor(colors[r.nextInt(colors.length)]);
        c.setMark(marks[r.nextInt(marks.length)]);
        c.setModel(models[r.nextInt(models.length)]);
        c.setPrice(r.nextInt(100000)+1);
        c.setRegister_number(numbers[r.nextInt(numbers.length)]);
        c.setYear(r.nextInt(40)+1976);
        cars[i]=c;
    }
    
   
}

public Car[] tosearch(int field,Car[] mass){
       Car[] rez = new Car[mass.length];
       Scanner sc = new Scanner(System.in);
       switch (field){
           case 1:
               System.out.println("Enter the mark you are looking for ");
        String m = sc.nextLine();
               
       for(int i=0;i<mass.length;i++){
          if(mass[i].mark.compareTo(m)==0){
              rez[i]=mass[i];
          } 
       }; return rez;
           case 2:
               System.out.println("Enter the model you are looking for ");
        String mod = sc.nextLine();
               System.out.println("Enter the minimal term of usage:");
        int n= sc.nextInt();
       for(int i=0;i<mass.length;i++){
          if((mass[i].model.compareTo(mod)==0) && (2016-mass[i].year>n)){
              rez[i]=mass[i];
          } 
       };return rez;
       
           case 3:
            
               System.out.println("print year: ");
             int year=sc.nextInt();
               System.out.println("print minimal price: ");
               int pr = sc.nextInt();
       for(int i=0;i<mass.length;i++){
          if((mass[i].year==year) && (mass[i].price> pr)){
              rez[i]=mass[i];
          } 
       }
           return rez; 
           default: System.out.println("it;s error"); return rez;
       }
       
       
       
   }
   

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", mark=" + mark + ", year=" + year + ", color=" + color + ", price=" + price + ", register_number=" + register_number + '}';
    }



public static void print(){
      for (Car a:cars){
        System.out.println(a);
             }
     } 
    public Car(String model, String mark, int year, String color, double price, String register_number) {
        this.model = model;
        this.mark = mark;
        this.year = year;
        this.color = color;
        this.price = price;
        this.register_number = register_number;
    }

    public Car() {
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegister_number() {
        return register_number;
    }

    public void setRegister_number(String register_number) {
        this.register_number = register_number;
    }


 
 
}
