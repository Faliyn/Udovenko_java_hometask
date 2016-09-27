/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.customer_2;

import java.util.Arrays;



/**
 *
 * @author Мария
 */
public class Task2 {
    public static void main(String[] args) {
         Customer c = new Customer();
         Customer.createCustomers();
         System.out.println("Before sorting: ");
         c.print();
         Customer.Sorter s = new Customer.Sorter();
         Arrays.sort(Customer.massiv,s);
         System.out.println("After sorting by surnames: ");
         
         c.print();
         System.out.println("Customers in theese interval: ");
         for(int i=0; i<Customer.massiv.length;i++){
             if (Customer.isInInterval(Customer.massiv[i], 12345678,33456780)){
                 
                 System.out.println(Customer.massiv[i]);
             }
         } 
         
    }
    
}
