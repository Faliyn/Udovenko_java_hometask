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
public class Marmelade extends Candy {
    
    boolean fresh;
    private String taste;
    private int callories;

    public Marmelade(boolean fresh, String taste, int callories, String name, double persant_of_sugar, double weight, String vendor, int price) {
        super(name, persant_of_sugar, weight, vendor, price);
        this.fresh = fresh;
        this.taste = taste;
        this.callories = callories;
    }

    public Marmelade(){
    }

    @Override
    public String toString() {
        return "Marmelade{" + "name=" + getName() + ", persant_of_sugar=" + getPersant_of_sugar() + ", weight=" + getWeight() + 
                ", vendor=" + getVendor() + ", price=" + getPrice()+ "fresh=" + fresh + ", taste=" + taste + ", callories=" + callories + '}';
    }
    
    

    @Override
    public boolean isFresh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getCallories() {
        return callories;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }
    
}
