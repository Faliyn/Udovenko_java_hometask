/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.customer_2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;
/** *
/**
 *
 * @author Мария
 */
public class Customer {
private int id;
private String name;
private String surName;
private String patr;
private Date birthDate;
private String address;
private long cardNumb;
private long accountNumb;



public static Customer [] massiv;

  
      
      
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
   
   
   static final String [] dates={
       "11-09-1998",
       "14-02-1997",
       "08-01-1997",
       "16-03-1996",
       "27-09-1996",
       "30-05-1997"
   
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
    
   
   static final long [] cardNumbers={
    12345678, 23456798,98764059,82736492,10293756,
    12567489, 23479286,28465930,86254010,74824047
};
   
   static final long [] accountNumbers={
    1234, 2345,4059,6492,3756,
    1256, 9286,2830,4010,4047
};
   
//    public  void print(String []mass){
//    for (int i=0; i<mass.length;i++){
//        System.out.println(mass[i]);
//   }
//    };

//    public long getCardNumber() {
//        return cardNumber;
//    }
//
//    public void setCardNumber(long cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    public long getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }
   
     static public void parseDate(Customer s){
       
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Random r = new Random();
       
         try{
             Date DATA = sdf.parse(dates[r.nextInt(dates.length)]);
            
             s.setBirthDate(DATA);
         }catch (ParseException ex){
             System.out.println("kjfekjd");
         }
           
      }
      
      
  public static void createCustomers(){
   Random r = new Random();
   massiv = new Customer [12];
   for(int i=0; i<massiv.length;i++){
       Customer s = new Customer();
       s.setId(r.nextInt());
       s.setAddress(addreses[r.nextInt(5+1)]);
       s.setName(names[r.nextInt(5+1)]);
       s.setSurName(surNames[r.nextInt(5+1)]);
       s.setPatr(patronymics[r.nextInt(5+1)]);
       s.setTelNumb(telNumbers[r.nextInt(5+1)]); 
       s.setCardNumb(cardNumbers[r.nextInt(9+1)]);
       s.setAccountNumb(accountNumbers[r.nextInt(9+1)]);
       parseDate(s);
       massiv[i]=s;
   }
   
   }
   
   public  void print(){
    for (Customer a:massiv){
        System.out.println(a);
             }
     } 
  
    public static class Sorter implements Comparator<Customer>{

        @Override
        public int compare(Customer o1, Customer o2) {
           return o1.surName.compareTo(o2.surName);
        }
        
    }    
    
   public static boolean isInInterval(Customer obj,long l,long r){
       return obj.cardNumb>l && obj.cardNumb<=r;
       
   }

    

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", surName=" + surName + ", patr=" + patr + ", birthDate=" + birthDate + ", address=" + address + ", telNumb=" + telNumb + ", cardNumb=" + cardNumb + ", accountNumb=" + accountNumb + '}';
    }
private String telNumb;


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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumb() {
        return telNumb;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb;
    }

    public long getCardNumb() {
        return cardNumb;
    }

    public void setCardNumb(long cardNumb) {
        this.cardNumb = cardNumb;
    }

    public long getAccountNumb() {
        return accountNumb;
    }

    public void setAccountNumb(long accountNumb) {
        this.accountNumb = accountNumb;
    }


}
