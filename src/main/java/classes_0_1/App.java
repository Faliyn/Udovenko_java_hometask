/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_0_1;

/**
 *
 * @author Мария
 */
public class App {
    public static void main(String[] args) {
        
        Bank aval = new Bank("Bank Aval",100000000);
        System.out.println(aval);
        aval.makePropositions();
        
        aval.createAnAccount("Vasia",33);
        
        
    }
}
