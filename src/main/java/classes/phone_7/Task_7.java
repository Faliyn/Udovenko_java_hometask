/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.phone_7;

import java.util.*;
/**
 *
 * @author Мария
 */
public class Task_7 {
    public static void main(String[] args) {
        
        Phone p = new Phone();
        p.print();
        System.out.println("Rezults of searching: ");
        p.LocalCall(p.abonents, 20);
        System.out.println("They have foreign calls:");
        p.isForeignCall(p.abonents);
        System.out.println("After sorting by surname: ");
        Arrays.sort(p.abonents);
        p.print();
        
    }
}
