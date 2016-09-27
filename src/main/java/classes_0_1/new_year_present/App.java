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
public class App {
    
    public static void main(String[] args) {
        Present pr = new Present();
        Candy cand = new Candy() {
            @Override
            public boolean isFresh() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Candy [] mass; 
        mass=pr.makeSweets();
        
      pr.createPresent(mass);
        
        
    }
    
}
