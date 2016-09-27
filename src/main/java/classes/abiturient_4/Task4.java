/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.abiturient_4;

/**
 *
 * @author Мария
 */
public class Task4 {
    public static void main(String[] args) {
        
        Abiturient [] a = Abiturient.createAbiturients(5);
        Abiturient.countSumm(a);
        Abiturient.print();   
        System.out.println("our loosers://////////////////////////////////////////////////////////////////// ");
        Abiturient.isLoser(a);
        System.out.println("summ is over 200 ://////////////////////////////////////////////////////////////////// ");
        Abiturient.isSumm(a);
        Abiturient.sortAbiturients(a,3);
        
    }
}
