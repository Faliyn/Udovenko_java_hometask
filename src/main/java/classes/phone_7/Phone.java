/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.phone_7;

import java.util.Random;

/**
 *
 * @author Мария
 */
public class Phone implements Comparable<Phone> {
   
private String name;
private String surName;
private String address;
private long card_numb;
private double time_of_local_call;
private double time_of_foreign_call;
private int debet;
private int credit;

static Phone []abonents;
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
  
  static final long [] cardNumbers={
    1234, 2345,4059,6492,3756,
    1256, 9286,2830,4010,4047
};

    @Override
    public String toString() {
        return "Phone{" + "name=" + name + ", surName=" + surName + ", address=" + address + ", card_numb=" + card_numb + ", time_of_local_call=" + time_of_local_call +" hours "+ ", time_of_foreign_call=" + time_of_foreign_call +" hours "+ ", debet=" + debet + ", credit=" + credit + '}';
    }
  
  
  
  static  final String [] addreses={
       "dormitory 1",
       "dormitory 3",
       "dormitory 1",
       "dormitory 2",
       "dormitory 2",
       "dormitory 2",

   };
   

  static{
    Random r = new Random();
   abonents = new Phone [12];
   for(int i=0; i<abonents.length;i++){
       Phone s = new Phone();
      
       s.setAddress(addreses[r.nextInt(5+1)]);
       s.setName(names[r.nextInt(5+1)]);
       s.setSurName(surNames[r.nextInt(5+1)]);
        s.setCard_numb(cardNumbers[r.nextInt(9+1)]);
        s.setTime_of_foreign_call(r.nextInt(100));
        s.setTime_of_local_call(r.nextInt(100));
        s.setCredit(r.nextInt(50));
        s.setDebet(r.nextInt(100));
        abonents[i]=s;
   }
  }
  
  
  public void LocalCall(Phone [] mass,int time){
      Phone [] rez=new Phone[mass.length];
      for(int i=0;i<mass.length;i++){
          if(mass[i].time_of_local_call>time){
              rez[i]=mass[i];
          }
      }
      for(Phone a:rez){
          if(a!=null){
              System.out.println(a);
          }
      }
  }
  
  public void isForeignCall(Phone [] mass){
      Phone [] rez=new Phone[mass.length];
      for(int i=0;i<mass.length;i++){
          if(mass[i].time_of_local_call!=0){
              rez[i]=mass[i];
          }
      }
      for(Phone a:rez){
          if(a!=null){
              System.out.println(a);
          }
      }
  }
  
  public static void print(){
      for (Phone a:abonents){
        System.out.println(a);
             }
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCard_numb() {
        return card_numb;
    }

    public void setCard_numb(long card_numb) {
        this.card_numb = card_numb;
    }

    public double getTime_of_local_call() {
        return time_of_local_call;
    }

    public void setTime_of_local_call(double time_of_local_call) {
        this.time_of_local_call = time_of_local_call;
    }

    public double getTime_of_foreign_call() {
        return time_of_foreign_call;
    }

    public void setTime_of_foreign_call(double time_of_foreign_call) {
        this.time_of_foreign_call = time_of_foreign_call;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public int compareTo(Phone o) {
         return this.surName.compareTo(o.surName);
    }




}
