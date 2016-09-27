/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.book_5;

import java.util.Scanner;

/**
 *
 * @author Мария
 */
public class Book {
    
    private String name;
    private String author;
    private String publisher;
   private int year;
   private int pages;
   private double price;
   private String binding_type;
public static Book [] books=new Book[5];

    final int SELECT_AUTHOR=1;
    final int SELECT_PUBLISHER=2;
    final int SELECT_YEAR=3;
    
    public Book() {
    }

    public Book(String name, String author, String publisher, int year, int pages, double price, String binding_type) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding_type = binding_type;
    }

   
   
   static{
     
       Book one = new Book("Martin Eiden","Jack London","Ranok",2001,350,100,"hard");
       books[0]=one;
       Book two = new Book("Moon Valley","Jack London","Ranok",2008,400,150,"hard");
       books[1]=two;
       Book three = new Book("To Kill a Mockingbird","Harper Lee","Sun",2004,250,156,"hard");
       books[2]=three;
       Book four = new Book("Big House","Edgar Allan Poe","Sun",2012,50,100,"soft");
       books[3]=four;
       
       Book five = new Book("Three friends"," Erich Maria Remarque","Wind",2013,65,156,"soft");
        books[4]=five;
       
   }
   public void print(){
       for(int i=0;i<books.length;i++){
           System.out.println(books[i]); 
       }
   }
   
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", publisher=" + publisher + ", year=" + year + ", pages=" + pages + ", price=" + price + ", binding_type=" + binding_type + '}';
    }

   public Book[] tosearch(int field,Book[] mass){
       Book[] rez = new Book[5];
       Scanner sc = new Scanner(System.in);
       switch (field){
           case 1:
               System.out.println("Enter the author you are looking for ");
        String auth = sc.nextLine();
               
       for(int i=0;i<mass.length;i++){
          if(mass[i].author.compareTo(auth)==0){
              rez[i]=mass[i];
          } 
       }; return rez;
           case 2:
               System.out.println("Enter the publisher you are looking for ");
        String publ = sc.nextLine();
       for(int i=0;i<mass.length;i++){
          if(mass[i].publisher.compareTo(publ)==0){
              rez[i]=mass[i];
          } 
       };return rez;
       
           case 3:
            
               System.out.println("print year: ");
             int year=sc.nextInt();
       for(int i=0;i<mass.length;i++){
          if(mass[i].year>year){
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBinding_type() {
        return binding_type;
    }

    public void setBinding_type(String binding_type) {
        this.binding_type = binding_type;
    }
   
   
    
    
}
