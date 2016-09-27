/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.student_1;

import java.util.Scanner;

/**
 *
 * @author Мария
 */
public class Task1 {
    
    
    public static void main(String[] args) {
        Student.GroupCreator c = new Student.GroupCreator();
        c.create();
        c.print();
      
        Student comp =new Student();
        
        System.out.println("Please, choose a characteristic you want to search. \n If you whant to "
                + "find all students by faculty press 1 \n"
                + "If you whant tofind all students by course press 3 \n"
                + "If you whant tofind all students by group press 4 \n");
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Please, type correctly-spelled name of characteristic");
       // String m = sc.next();
        switch(n){
            case 1:{ 
                System.out.println("Awaliable names: \n");
                c.print(c.faculties);
                String m = sc.next(); comp.setFaculty(m);}
            case 3:{ System.out.println("Awaliable names: \n");
                c.print(c.courses);
                String m = sc.next(); comp.setCourse(m);}
            case 4:{System.out.println("Awaliable names: \n");
                c.print(c.groupes);
                String m = sc.next(); 
                comp.setGroup(m);
            }
                
        }
        
   c.go(comp, n);
        
        
       
    }
}
