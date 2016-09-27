/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_0_1.new_year_present;

/**
 *
 * @author Мария
 */
public class Chocolate_candy extends Candy{
    
    String main_component;
    String second_component;
    int callories;
    String color;
     boolean fresh;

    public Chocolate_candy(){
    }

    @Override
    public String toString() {
        return "Chocolate_candy{" + "name=" + getName() + ", persant_of_sugar=" + getPersant_of_sugar() + ", weight=" + getWeight() + 
                ", vendor=" + getVendor() + ", price=" + getPrice()+ "main_component=" + main_component + ", second_component=" + second_component + ", callories=" + callories + ", color=" + color + ", fresh=" + fresh + '}';
    }
     
     
     
     

    public Chocolate_candy(String main_component, String second_component,
            int callories, String color, boolean fresh, String name,
            double persant_of_sugar, double weight, String vendor, int price) {
        super(name, persant_of_sugar, weight, vendor, price);
        this.main_component = main_component;
        this.second_component = second_component;
        this.callories = callories;
        this.color = color;
        this.fresh = fresh;
    }

    

     
     
     
     
    public String getMain_component() {
        return main_component;
    }

    public void setMain_component(String main_component) {
        this.main_component = main_component;
    }

    public String getSecond_component() {
        return second_component;
    }

    public void setSecond_component(String second_component) {
        this.second_component = second_component;
    }

    public int getCallories() {
        return callories;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
     
    
    
    @Override
    public boolean isFresh() {
        if(fresh){
            System.out.println("This candy can be added to the present");
            return true;
        }
        return false;
    }
    
}
