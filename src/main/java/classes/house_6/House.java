/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.house_6;

import java.util.Random;

/**
 *
 * @author Мария
 */
public class House {
   private int flat_numb;
   private int area;
   private int floor_numb;
   private int room_amount;
   private String street;
   private String type;
   private int lifetime;

   public static House [] flats;
   static{
       final String [] streets={
         "Window","Red","Victory","Bird","Baker","Cake"  
       };
       final String [] types={
           "high-rise building","five-storey building","private house"
       };
       Random r = new Random();
       flats=new House[5];
       for(int i=0;i<flats.length;i++){
       House f = new House();
       f.setArea(r.nextInt(20)+30);
       f.setFlat_numb(r.nextInt(140)+1);
       f.setFloor_numb(r.nextInt(13)+1);
       f.setLifetime(r.nextInt(100)+1);
       f.setRoom_amount(r.nextInt(4)+1);
       f.setStreet(streets[r.nextInt(streets.length)]);
       f.setType(types[r.nextInt(types.length)]);
       flats[i]=f;
       }
   };

   public void print(House [] mass){
       for(House h:mass){
           System.out.println(h);
       }
           
   }
   
   public void searchRooms(House [] mass,int amnt){
       House [] rezult = new House[mass.length];
       for(int i=0;i<mass.length;i++){
           if(mass[i].room_amount==amnt){
               rezult[i]=mass[i];
           }
       }
       System.out.println("Rezults of search");
        for(int i=0;i<rezult.length;i++){
          if(rezult[i]!=null){
              
          System.out.println(rezult[i]);
          }}
   }

   
   public void searchRoomsFloors (House [] mass,int amnt,int bord1,int bord2){
       House [] rezult = new House[mass.length];
       for(int i=0;i<mass.length;i++){
           if(mass[i].room_amount==amnt && mass[i].floor_numb>bord1 && mass[i].floor_numb>bord2){
               rezult[i]=mass[i];
           }
       }
       System.out.println("Rezults of search");
        for(int i=0;i<rezult.length;i++){
          if(rezult[i]!=null){
              
          System.out.println(rezult[i]);
          }}
   }
   
   
    public void searchArea(House [] mass,int amnt){
       House [] rezult = new House[mass.length];
       for(int i=0;i<mass.length;i++){
           if(mass[i].area>amnt){
               rezult[i]=mass[i];
           }
       }
       System.out.println("Rezults of search");
        for(int i=0;i<rezult.length;i++){
          if(rezult[i]!=null){
              
          System.out.println(rezult[i]);
          }}
   }

    
    public House() {
    }

    public House(int flat_numb, int area, int floor_numb, int room_amount, String street, String type, int lifetime) {
        this.flat_numb = flat_numb;
        this.area = area;
        this.floor_numb = floor_numb;
        this.room_amount = room_amount;
        this.street = street;
        this.type = type;
        this.lifetime = lifetime;
    }
   
   
   
   
    @Override
    public String toString() {
        return "House{" + "flat_numb=" + flat_numb + ", area=" + area + ", floor_numb=" + floor_numb + ", room_amount=" + room_amount+ " "+  street +" street=" + ", type=" + type + ", lifetime=" + lifetime + '}';
    }

    public int getFlat_numb() {
        return flat_numb;
    }

    public void setFlat_numb(int flat_numb) {
        this.flat_numb = flat_numb;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor_numb() {
        return floor_numb;
    }

    public void setFloor_numb(int floor_numb) {
        this.floor_numb = floor_numb;
    }

    public int getRoom_amount() {
        return room_amount;
    }

    public void setRoom_amount(int room_amount) {
        this.room_amount = room_amount;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
   
}
