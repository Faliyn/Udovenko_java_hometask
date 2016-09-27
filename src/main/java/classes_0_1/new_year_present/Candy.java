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
public abstract class Candy {
    
    private String name;
    private double persant_of_sugar;
    private double weight;
    private String vendor;
     private int price=0;

     public  String [] vendors={
    "Conty","ABK","Ritter Sport","Roshen","Karina"
};
     public String [] names={"Sweetty daughter","Rabbit","Santa","Feer-tree","Queen","Super Magic"};
     
     public String [] colors={"white","black","red","green","yellow"};
     
     public String [] flavorings={
         "nuts","jam","cherry","cinamon", "winilla","apple jam", "fruits"
     };
     

    public Candy() {
    }

    @Override
    public String toString() {
        return "Candy{" + "name=" + name + ", persant_of_sugar=" + persant_of_sugar + ", weight=" + weight + 
                ", vendor=" + vendor + ", price=" + price;
    }
     
             
     
     
    public Candy(String name, double persant_of_sugar, double weight, String vendor, int price) {
        this.name = name;
        this.persant_of_sugar = persant_of_sugar;
        this.weight = weight;
        this.vendor = vendor;
        this.price = price;
    }
     
     
     
     
    public abstract boolean isFresh();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPersant_of_sugar() {
        return persant_of_sugar;
    }

    public void setPersant_of_sugar(double persant_of_sugar) {
        this.persant_of_sugar = persant_of_sugar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
