/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_0_1;

import java.util.*;

/**
 *
 * @author Мария
 */
public class Bank {
    private String name;
    private int credit_limit;
    private int in_credit;
    private double persant;

    @Override
    public String toString() {
        return "Bank{" + "name=" + name + ", credit_limit=" + credit_limit + ", in_credit=" + in_credit + ", persant=" + persant + '}';
    }

    public Credit[] makePropositions(){
        
        Credit b = new Credit();
        
        Credit[] a=b.createCredits();
        for(Credit i:a){
        System.out.println(i);}
        return a;
    }
    
    public void createAnAccount(String name,int Age){
        Client c = new Client();
        c.makeAnAccount(name, Age);
    }
    public Bank(String name, int credit_limit) {
        this.name = name;
        this.credit_limit = credit_limit;
        persant=0.01;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(int credit_limit) {
        this.credit_limit = credit_limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIn_credit() {
        return in_credit;
    }

    public void setIn_credit(int in_credit) {
        this.in_credit = in_credit;
    }

    public double getPersant() {
        return persant;
    }

    public void setPersant(double persant) {
        this.persant = persant;
    }

  
    
    
    
    
    
    public class Client{

        public Client(){
            
        }
        private Client(String name, int age) {
            this.name = name;
            this.age = age;
            this.on_credit_acc = 0;
            this.on_main_acc = 10;
           
           
        }
        
        String name;
        int age;
        int on_credit_acc;
        int on_main_acc;
        Date avail_acc;
        Date get_credit;
        Date pay_credit;
        int credit_id;

        @Override
        public String toString() {
            return "Client{" + "name=" + name + ", age=" + age + ", on_credit_acc=" + on_credit_acc + ", on_main_acc=" + on_main_acc + ", avail_acc=" + avail_acc + ", get_credit=" + get_credit + ", pay_credit=" + pay_credit + ", credit_id=" + credit_id + '}';
        }
        
   
        
        public void makeAnAccount(String name, int age){
            System.out.println("creating some dates.....");
            Client one = new Client (name,age);
            Calendar a = new GregorianCalendar();
            
            System.out.println( a.getTime());
           
           one.get_credit=a.getTime();
            System.out.println("date of taking credit "+one.get_credit);
             Calendar b=a;
           b.add(Calendar.YEAR,1);
            one.pay_credit=b.getTime();
            System.out.println(" date of paying credit "+one.pay_credit);
            a.add(Calendar.YEAR, 5);
            one.avail_acc=a.getTime();
            System.out.println(" your account is avaliable until "+one.avail_acc);
            
           Random r = new Random(1000);
           one.credit_id=r.nextInt();
           System.out.println(one);
        
        }
        
        public void takeCredit(){
            
            
            
        }
        
        
        
    }
    
    
    
    
    public class Credit{
        private String [] types={ "Hypotec","Business", "Educational","Consumer","Medical"};
        private String [] purposes={ "IMN comp","Business Association", "Cambrige Univercity","Mega Market","Golden Hospital"};
        private int [] limits={300000,500000,10000,20000,1000000};
        
        
        
        private int id;
        private String type;
        private int credit_limit;
        private String purpose;

        private Credit() {
        }

        @Override
        public String toString() {
            return "Credit{" + "id=" + id + ", type=" + type + ", credit_limit=" + credit_limit + ", purpose=" + purpose + '}';
        }

        
        
        
        public Credit[] createCredits(){
            Random r = new Random((100000)+1);
            Credit[] mass = new Credit[5];
            for(int i=0;i<mass.length;i++){
                Credit m = new Credit();
                m.setCredit_limit(limits[i]);
                m.setPurpose(purposes[i]);
                m.setType(types[i]);
                m.setId(r.nextInt());
                mass[i]=m;
            }
            System.out.println("mass created");
            return mass;
            
        }

       

        
        
        public String[] getTypes() {
            return types;
        }

        public void setTypes(String[] types) {
            this.types = types;
        }

        public String[] getPurposes() {
            return purposes;
        }

        public void setPurposes(String[] purposes) {
            this.purposes = purposes;
        }

        public int[] getLimits() {
            return limits;
        }

        public void setLimits(int[] limits) {
            this.limits = limits;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getCredit_limit() {
            return credit_limit;
        }

        public void setCredit_limit(int credit_limit) {
            this.credit_limit = credit_limit;
        }

        public String getPurpose() {
            return purpose;
        }

        public void setPurpose(String purpose) {
            this.purpose = purpose;
        }
        
        
        
        
        
       
        
        
        
        
    }
    
}
