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
public class Zephyr extends Candy{

        private int callories;
        private boolean fresh;
     
        private String filling;

    public Zephyr(int callories, boolean fresh,  String filling, String name, double persant_of_sugar, double weight, String vendor, int price) {
        super(name, persant_of_sugar, weight, vendor, price);
        this.callories = callories;
        this.fresh = fresh;
        
        this.filling = filling;
    }

    public Zephyr() {
    }

    @Override
    public String toString() {
        return "Zephyr{"+ "name=" + getName() + ", persant_of_sugar=" + getPersant_of_sugar() + ", weight=" + getWeight() + 
                ", vendor=" + getVendor() + ", price=" + getPrice() + "callories=" + callories + ", fresh=" + fresh + ", filling=" + filling + '}';
    }
        
        
        
    
    @Override
    public boolean isFresh() {
        if(fresh){
            System.out.println("This candy can be added to the present");
            return true;
        }
        return false;
    }

   

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public int getCallories() {
        return callories;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }
    
    
    
}
