package basictypes;
import java.util.Scanner;

import java.util.Random;
public class Task2_6 {

	public static void getMass(String [][] arr,int n,int m){
		Random rand = new Random();
		
		for(int i=0; i<n;i++){
			for(int j=0;j<=m;j++){
				while(j<=i){
				arr[i][j]=Integer.toString(rand.nextInt(10));
				}
				arr[i][j]=" ";
				System.out.print(arr[i][j]+"  ");
//					arr[i][j]=rand.nextInt(10);
				}
				
				
			}System.out.println();
		
	
			
		}
		

	public static void main(String []args){
		
System.out.println( "Please, enter size of array: " );
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
           
        String [][] mass = new String [n][m];
        
        
       getMass(mass,n,m);
		
	}
	
}
