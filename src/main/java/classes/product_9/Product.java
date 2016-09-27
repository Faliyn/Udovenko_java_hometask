/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.product_9;

import java.util.*;

/**
 *
 * @author Мария
 */
public class Product {
    
    private String name;
    private String vendor;
    private double price;
    private int term_pf_usage;
    private int amount;
static Product [] products;

    
static final String[] names={
    "Chocolate","Milk","Yogurt","Cheese","Sausage"
} ;

static final String [] vendors={
    "Conty","ABK","Ritter Sport","Roshen","Karina"
};

static{
    Random r = new Random();
    products = new Product[7];
    for(int i=0;i<products.length;i++){
        Product p = new Product();
        p.setAmount(r.nextInt(50)+1);
        p.setName(names[r.nextInt(names.length)]);
        p.setPrice(r.nextInt(100)+1);
        p.setTerm_pf_usage(r.nextInt(10)+1);
        p.setVendor(vendors[r.nextInt(vendors.length)]);
        products[i]=p;
    }
}

    public static void print(){
      for (Product a:products){
        System.out.println(a);
             }
     } 
    
    public Product(String name, String vendor, double price, int term_pf_usage, int amount) {
        this.name = name;
        this.vendor = vendor;
        this.price = price;
        this.term_pf_usage = term_pf_usage;
        this.amount = amount;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", vendor=" + vendor + ", price=" + price + " uah "+", term of usage=" + term_pf_usage +" days "+ ", amount=" + amount + '}';
    }

    
    public Product[] tosearch(int field,Product[] mass){
       Product[] rez = new Product[mass.length];
       Scanner sc = new Scanner(System.in);
       switch (field){
           case 1:
               System.out.println("Enter the name you are looking for ");
        String m = sc.nextLine();
               
       for(int i=0;i<mass.length;i++){
          if(mass[i].name.compareTo(m)==0){
              rez[i]=mass[i];
          } 
       }; return rez;
           case 2:
               System.out.println("Enter the name of product you are looking for ");
        String mod = sc.nextLine();
               System.out.println("Enter the max price:");
        int n= sc.nextInt();
       for(int i=0;i<mass.length;i++){
          if((mass[i].name.compareTo(mod)==0) && (mass[i].price<n)){
              rez[i]=mass[i];
          } 
       };return rez;
       
           case 3:
            
              
               System.out.println("print minimal term of usage: ");
               int pr = sc.nextInt();
       for(int i=0;i<mass.length;i++){
          if((mass[i].term_pf_usage>pr) ){
              rez[i]=mass[i];
          } 
       }
           return rez; 
           default: System.out.println("it;s error"); return rez;
       }
       
       
       
   }
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTerm_pf_usage() {
        return term_pf_usage;
    }

    public void setTerm_pf_usage(int term_pf_usage) {
        this.term_pf_usage = term_pf_usage;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
