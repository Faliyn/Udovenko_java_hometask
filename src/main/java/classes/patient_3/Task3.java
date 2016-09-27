/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.patient_3;

/**
 *
 * @author Мария
 */
public class Task3 {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.print();
        
        
        System.out.println("Patients with cards in interval: ");
         for(int i=0; i<Patient.patients.length;i++){
             if (Patient.isInInterval(Patient.patients[i], 1234,3345)){
                 
                 System.out.println(Patient.patients[i]);
             }
         } 
        
         
         System.out.println("Patients with current diseases: ");
         
         for(int i=0; i<Patient.patients.length;i++){
             if (Patient.haveThisDiagnosis(Patient.patients[i],"diarrhea")){
                 
                 System.out.println(Patient.patients[i]);
             }
         }
         
    }
    
}
