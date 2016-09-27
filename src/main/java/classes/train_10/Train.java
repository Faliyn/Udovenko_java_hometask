/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.train_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Мария
 */
public class Train {
    
    private int train_numb;
    private String destination;
    private Date time;
    private int common_places;
    private int econom_class_places;
    private int compartment_places;
    private int luxury_places;
    static Train [] trains;

    static final String [] destinations={
        "Kiev","Kharkov","London","Simpheropol","Lviv"
    }; 
    
    static final String [] times={
        "21:45:45","12:34:45","13:11:23","20:00:00","23:30:00"
    };
    
    static{
        Random r = new Random();
        trains = new Train[5];
        for(int i=0;i<trains.length;i++){
            Train t= new Train();
            t.setCommon_places(r.nextInt(55)+1);
            t.setCompartment_places(r.nextInt(55)+1);
            t.setEconom_class_places(r.nextInt(55)+1);
            t.setDestination(destinations[r.nextInt(destinations.length)]);
            t.setLuxury_car(r.nextInt(55)+1);
            t.setTime(times[r.nextInt(times.length)]);
            t.setTrain_numb(r.nextInt(300)+1);
            
        }
        
    }
    
    public Train(int train_numb, String destination, Date time, int common_places, int econom_class_places, int compartment_places, int luxury_places) {
        this.train_numb = train_numb;
        this.destination = destination;
        this.time = time;
        this.common_places = common_places;
        this.econom_class_places = econom_class_places;
        this.compartment_places = compartment_places;
        this.luxury_places= luxury_places;
    }

    public Train() {
    }

    @Override
    public String toString() {
        return "Train{" + "train number is " + train_numb + ", it goes to " + destination + ", time  of dispatch " + time + ",it has: common places=" + common_places + ", econom class places=" + econom_class_places + ", compartment places =" + compartment_places + ", luxury_car=" + luxury_places + '}';
    }

    
    
    public int getTrain_numb() {
        return train_numb;
    }

    public void setTrain_numb(int train_numb) {
        this.train_numb = train_numb;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getTime() {
        return time;
    }

    public void setTime  (String time) {
        Date t = null;
       SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
       try{
         t= sdf.parse(time);
           System.out.println("this is parsed time: "+t);
       } catch(ParseException ex){
           System.out.println("date parse exception");
       }
       
    }

    public int getCommon_places() {
        return common_places;
    }

    public void setCommon_places(int common_places) {
        this.common_places = common_places;
    }

    public int getEconom_class_places() {
        return econom_class_places;
    }

    public void setEconom_class_places(int econom_class_places) {
        this.econom_class_places = econom_class_places;
    }

    public int getCompartment_places() {
        return compartment_places;
    }

    public void setCompartment_places(int compartment_places) {
        this.compartment_places = compartment_places;
    }

    public int getLuxury_car() {
        return luxury_places;
    }

    public void setLuxury_car(int luxury_places) {
        this.luxury_places = luxury_places;
    }
    
    
}
