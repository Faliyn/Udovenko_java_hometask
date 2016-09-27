/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.abiturient_4;

import java.util.*;

/**
 *
 * @author Мария
 */
public class Abiturient {

   
private int id;
private String name;
private String surName;
private String patr;
private String address;
private int [] marks = new int [3];
int summ;
private String telNumb;


    public String getTelNumb() {
        return telNumb;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb;
    }

    @Override
    public String toString() {
        return "Abiturient{" + "id=" + id + ", name=" + name + ", surName=" + surName + ", patr=" + patr + ", address=" + address  + ", telNumb=" + telNumb + "summ of marks is "+summ+'}';
    }



public static Abiturient [] massiv;

  
      
      
   static final String [] names={
       "Ann",
       "Mary",
       "Jane",
       "Charlie",
       "Mike",
       "Tyler"
  
   };
  static final String [] surNames={
       "Black",
       "Piens",
       "Sheen",
       "Campbell",
       "Collins",
       "Edwards"
   
   };
   
   
    static final String [] patronymics={
       "Alexandrovich",
       "Alexeevich",
       "Dmitrievich",
       "Vladidmirovich",
       "Mikhailovich",
       "Sergeevich"
   
   };
   
   
  
   static  final String [] addreses={
       "dormitory 1",
       "dormitory 3",
       "dormitory 1",
       "dormitory 2",
       "dormitory 2",
       "dormitory 2",

   };
   
   static  final String [] telNumbers={
       "095-34-34-556",
       "098-23-45-678",
       "093-09-23-445",
       "095-87-98-234",
       "098-54-34-567",
       "067-33-12-222",

   };  
    
   
  
   
   public void setMark(Abiturient s){
        Random r = new Random();
    for(int i=0;i<marks.length;i++){
        s.marks[i]= (r.nextInt(51)+50);
    }
};
   
   public  static Abiturient[] createAbiturients( int n){
    Random r = new Random();
   massiv = new Abiturient [n];
   for(int i=0; i<massiv.length;i++){
       Abiturient s = new Abiturient();
       s.setId(r.nextInt());
       s.setAddress(addreses[r.nextInt(5+1)]);
       s.setName(names[r.nextInt(5+1)]);
       s.setSurName(surNames[r.nextInt(5+1)]);
       s.setPatr(patronymics[r.nextInt(5+1)]);
       s.setTelNumb(telNumbers[r.nextInt(5+1)]); 
       
       s.setMark(s);
      
       massiv[i]=s;
       
   }
   return massiv;
   }


     public  static void print(){
    for (Abiturient a:massiv){
        System.out.println(a);
        System.out.println("Their marks: ");
        for(int b:a.marks){
            System.out.println(b);
        }
        
             }
     } 
   
     public  static void print(int n){
    for (int i=0;i<n;i++){
        System.out.println(massiv[i]);
        System.out.println("Their marks: ");
        for(int b:massiv[i].marks){
            System.out.println(b);
        }
        
             }
     } 
     
     
     public static void isLoser(Abiturient [] l){
         int a=0;
         for(int i=0;i<l.length;i++){
             
             for(int d:l[i].marks){
             if (d<60){
                  a++;
                  
             } }
             if (a>0){
                 System.out.println("this abiturient has "+a+" bad marks");
                 System.out.println(l[i]);
             }
            a=0;
         
        
         }
         
     }
     
     
     public static void isSumm(Abiturient [] l){
         int a=0;
         for(int i=0;i<l.length;i++){
              for(int d:l[i].marks){
                  a+=d;
              }
             if (a>200){
                 System.out.println(l[i]);
             }
             a=0;
     }
     }
     
      public static void countSumm(Abiturient [] l){
         int a=0;
         for(int i=0;i<l.length;i++){
              for(int d:l[i].marks){
                  a+=d;
                  }
             l[i].summ=a;
           //  System.out.println("counted summ is "+a);
                     
                     
             a=0;
     }
     }
     
     public static void sortAbiturients(Abiturient [] l, int n){
         
         System.out.println("After sorting ///////////////////");
         countSumm(l);
         
         Sorter s= new Sorter();
         Arrays.sort(l,s);
         
         print(n);
                 
         
     }
     
     
     public static class Sorter implements Comparator<Abiturient>{

        @Override
        public int compare(Abiturient o1, Abiturient o2) {
            if (o1.summ<o2.summ){
                return 1;
            } else if (o1.summ>o2.summ){
                return -1;
            } return 0;
        }
         
     }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatr() {
        return patr;
    }

    public void setPatr(String patr) {
        this.patr = patr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}