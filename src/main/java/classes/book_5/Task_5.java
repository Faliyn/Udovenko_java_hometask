/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.book_5;
import java.util.*;
/**
 *
 * @author Мария
 */
public class Task_5 {
    public static void main(String[] args) {
        Book b = new Book();
        b.print();
     
        
      Book[] m=b.tosearch(1,Book.books);
      for(int i=0;i<m.length;i++){
          if(m[i]!=null){
          System.out.println(m[i]);
          }
      }
        
        
      Book[] p =b.tosearch(2,Book.books);
      for(int i=0;i<p.length;i++){
          if(p[i]!=null){
          System.out.println(p[i]);
          }}
          
       Book[] y =b.tosearch(3,Book.books);
      for(int i=0;i<y.length;i++){
          if(y[i]!=null){
          System.out.println(y[i]);
          }}
    }
}
        

    
    
    

