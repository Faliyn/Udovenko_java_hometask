/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_0_1.new_year_present;

import java.util.*;

/**
 *
 * @author Мария
 */
public class Present {
    
    
    int amount=0;
    int price=0;
    double weight=0;

    public Present() {
    }

    
    
    
    @Override
    public String toString() {
        return "Present has" + amount+ " sweets "  + ", it's price is " + price + " and it's weight is " + weight + '}';
    }
    
    
    
    public Candy[] makeSweets(){
        Candy a = new Candy() {
            @Override
            public boolean isFresh() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
         Candy [] mass = new Candy [7];
         
             
             Random r = new Random(100);
             Chocolate_candy choc = new Chocolate_candy();
             Cookie coo = new Cookie();
             Marmelade mar = new Marmelade();
             Marzipan marz = new Marzipan();
             Nougat no = new Nougat();
             Zephyr zep =new Zephyr();
             
          for(int i=0; i<mass.length;i++){   
             choc.setName(a.names[r.nextInt(a.names.length)]);
             choc.setPersant_of_sugar(0.30);
             choc.setPrice(r.nextInt(500)+1);
             choc.setVendor(a.vendors[r.nextInt(a.vendors.length)]);
             choc.setWeight(r.nextDouble());
             choc.setCallories(r.nextInt((100)+50));
             choc.setColor(a.colors[r.nextInt(a.colors.length)]);
             choc.setFresh(true);
             choc.setSecond_component(a.flavorings[r.nextInt(a.flavorings.length)]);
             
                mass[i]=choc;
             
             coo.setName(a.names[r.nextInt(a.names.length)]);
             coo.setPersant_of_sugar(0.30);
             coo.setPrice(r.nextInt(500)+1);
             coo.setVendor(a.vendors[r.nextInt(a.vendors.length)]);
             coo.setWeight(r.nextDouble());
             coo.setCallories(r.nextInt((100)+50));
             coo.setFilling(a.flavorings[r.nextInt(a.flavorings.length)]);
                mass[++i]=coo;
            
                
                
             mar.setName(a.names[r.nextInt(a.names.length)]);
             mar.setPersant_of_sugar(0.70);
             mar.setPrice(r.nextInt(500)+1);
             mar.setVendor(a.vendors[r.nextInt(a.vendors.length)]);
             mar.setWeight(r.nextDouble());
             mar.setCallories(r.nextInt((100)+50));
            mar.setTaste(a.flavorings[r.nextInt(a.flavorings.length)]);
                   mass[++i]=mar;
                
                marz.setName(a.names[r.nextInt(a.names.length)]);
             marz.setPersant_of_sugar(0.60);
             marz.setPrice(r.nextInt(500)+1);
             marz.setVendor(a.vendors[r.nextInt(a.vendors.length)]);
             marz.setWeight(r.nextDouble());
             marz.setCallories(r.nextInt((100)+50));   
                mass[++i]=marz;
                
                no.setName(a.names[r.nextInt(a.names.length)]);
             no.setPersant_of_sugar(0.68);
             no.setPrice(r.nextInt(500)+1);
             no.setVendor(a.vendors[r.nextInt(a.vendors.length)]);
             no.setWeight(r.nextDouble());
             no.setCallories(r.nextInt((100)+50));
                mass[++i]=no;
                
                zep.setName(a.names[r.nextInt(a.names.length)]);
             zep.setPersant_of_sugar(0.55);
             zep.setPrice(r.nextInt(500)+1);
             zep.setVendor(a.vendors[r.nextInt(a.vendors.length)]);
             zep.setWeight(r.nextDouble());
             zep.setCallories(r.nextInt((100)+50));
                zep.setFilling(a.flavorings[r.nextInt(a.flavorings.length)]);
               mass[++i]=zep;
              i++;              
         }
         print(mass);
        return mass;
    }
    
    public void print(Candy[] candies){
        for(Candy a:candies){
            System.out.println(a);
        }
    }
    
    public void createPresent(Candy[] mass){
        for(Candy a:mass){
            //amount++;
            //price+=a.getPrice();
            //weight+=a.getWeight();
            System.out.println(a.getPrice());
            System.out.println(a.getWeight());
            
        } 
        System.out.println("Present is created: ");
    }
    
}
