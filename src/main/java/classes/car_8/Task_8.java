/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.car_8;

/**
 *
 * @author Мария
 */
public class Task_8 {
    public static void main(String[] args) {
         Car c = new Car();
         c.print();
         
         
         Car[] m= c.tosearch(1, c.cars);
         for(int i=0;i<m.length;i++){
          if(m[i]!=null){
          System.out.println(m[i]);
          }
      }
         
         Car[] f= c.tosearch(2, c.cars);
         for(int i=0;i<f.length;i++){
          if(f[i]!=null){
          System.out.println(f[i]);
          }
      }
         
       
          Car[] s= c.tosearch(3, c.cars);
         for(int i=0;i<s.length;i++){
          if(s[i]!=null){
          System.out.println(s[i]);
          }
      }
         
         
         
         
    }
    
    
    
}
