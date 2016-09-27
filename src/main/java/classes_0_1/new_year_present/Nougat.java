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
public class Nougat extends Candy {

    private int callories;
    private boolean fresh;

    public Nougat(){
        
    } 

    @Override
    public String toString() {
        return "Nougat{" + "name=" + getName() + ", persant_of_sugar=" + getPersant_of_sugar() + ", weight=" + getWeight() + 
                ", vendor=" + getVendor() + ", price=" + getPrice()+ "callories=" + callories + ", fresh=" + fresh + '}';
    }

    
    
    public Nougat(int callories, boolean fresh, String name, double persant_of_sugar, double weight, String vendor, int price) {
        super(name, persant_of_sugar, weight, vendor, price);
        this.callories = callories;
        this.fresh = fresh;
    }

    
    
    public int getCallories() {
        return callories;
    }

    public void setCallories(int callories) {
        this.callories = callories;
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
