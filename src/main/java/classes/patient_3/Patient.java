/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.patient_3;

import java.util.Random;

/**
 *
 * @author Мария
 */
public class Patient  {
    
    private int id;
private String name;
private String surName;
private String patr;

private String address;
private long cardNumb;
private String diagnostic;

public static Patient [] patients;

  
      
      
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
    
   

   
   static final long [] cardNumbers={
    1234, 2345,4059,6492,3756,
    1256, 9286,2830,4010,4047
};
   
   static final String [] diagnostics={
    "diarrhea","flu","chickenpox","angina","fracture","lupus","bronchitis"
   };
static{
    Random r = new Random();
   patients = new Patient [12];
   for(int i=0; i<patients.length;i++){
       Patient s = new Patient();
       s.setId(r.nextInt());
       s.setAddress(addreses[r.nextInt(5+1)]);
       s.setName(names[r.nextInt(5+1)]);
       s.setSurName(surNames[r.nextInt(5+1)]);
       s.setPatr(patronymics[r.nextInt(5+1)]);
       s.setDiagnostic(diagnostics[r.nextInt(6+1)]); 
       s.setCardNumb(cardNumbers[r.nextInt(9+1)]);
      
      
      patients[i]=s;
   }
}

public static boolean isInInterval(Patient obj,int l,int r){
       return obj.cardNumb>l && obj.cardNumb<=r;
       
   }

public static boolean haveThisDiagnosis(Patient obj,String str){
      int a=obj.diagnostic.compareTo(str);
      if (a==0) {
          return true;}
      else return false;
      }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", surName=" + surName + ", patr=" + patr + ", address=" + address + ", cardNumb=" + cardNumb + ", diagnostic=" + diagnostic + '}';
    }
 


public  void print(){
    for (Patient a:patients){
        System.out.println(a);
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

    public long getCardNumb() {
        return cardNumb;
    }

    public void setCardNumb(long cardNumb) {
        this.cardNumb = cardNumb;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    




}
