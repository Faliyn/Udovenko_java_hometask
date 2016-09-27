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
public class Cookie extends Candy {
    
    private String filling;
     private int callories;
     boolean fresh;
     
     
    public Cookie(int callories, String filling, boolean fresh, String name, double persant_of_sugar, double weight, String vendor, int price) {
        super(name, persant_of_sugar, weight, vendor, price);
        this.callories = callories;
        this.filling = filling;
        this.fresh=fresh;
    }

    public Cookie(){
        
    }

    @Override
    public String toString() {
        return "Cookie{" + "name=" + getName() + ", persant_of_sugar=" + getPersant_of_sugar() + ", weight=" + getWeight() + 
                ", vendor=" + getVendor() + ", price=" + getPrice()+ "filling=" + filling + ", callories=" + callories + ", fresh=" + fresh + '}';
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
    
    

