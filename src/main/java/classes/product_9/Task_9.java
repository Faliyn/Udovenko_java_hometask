/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.product_9;

/**
 *
 * @author Мария
 */
public class Task_9 {
    public static void main(String[] args) {
        
        Product p = new Product();
        p.print();
        
        
//        Product [] f = p.tosearch(1, p.products);
//        for(int i=0;i<f.length;i++){
//          if(f[i]!=null){
//          System.out.println(f[i]);
//          }
//      }
        
       
//        Product [] s = p.tosearch(2, p.products);
//        for(int i=0;i<s.length;i++){
//          if(s[i]!=null){
//          System.out.println(s[i]);
//          }
//      }
        
         Product [] t = p.tosearch(3, p.products);
        for(int i=0;i<t.length;i++){
          if(t[i]!=null){
          System.out.println(t[i]);
          }
      }
        
        
    }
    
}
