package basictypes;
import java.util.Scanner;

import java.util.Random;

public class Task2_5 {
	
	public static int [][] getMass(int [][] arr,int n,int m){
		Random rand = new Random();
		for(int i=0; i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=rand.nextInt(10);
			}
			
		}
		return arr;
	}

	public static void printMass(int [][] arr,int n,int m){
		
		for(int i=0; i<n;i++){
			for(int j=0;j<m;j++){

				System.out.print(arr[i][j]+"  ");
			
			}System.out.println();
			
		}
		
	}
	
public static void printInvertMass(int [][] arr,int n,int m){
		
		for(int i=n-1; i>=0;i--){
			for(int j=m-1;j>=0;j--){

				System.out.print(arr[i][j]+"  ");
			
			}System.out.println();
			
		}
		
	}
	

public static void printEvenNumb(int [][] arr,int n,int m){
	
	for(int i=0; i<n;i++){
		for(int j=0;j<m;j++){
		
	if(i%2==0 && arr[i][j]%2==0 ){
		System.out.print(arr[i][j]);
		
	}else System.out.print("*");
	
	
	}System.out.println();
}
}

public static void printOddNumb(int [][] arr,int n,int m){
	
	for(int i=0; i<n;i++){
		for(int j=0;j<m;j++){
		
	if(i%2!=0 && arr[i][j]%2!=0 ){
		System.out.print(arr[i][j]);
		
	}else System.out.print("*");
	
	
	}System.out.println();
}
}


public static void printCountSumm(int [] [] arr,int n,int m){
	int summ=0;
	for(int i=0; i<n;i++){
		for(int j=0;j<m;j++){
		
	if(i%2==0 ){
		if(arr[i][j]%7==0){
		summ+=arr[i][j];
		}
		
	}
		}
			}System.out.print(summ);	
	
	}

public static void printCountNumb(int [] [] arr,int n,int m){
	int rez=1;
	for(int i=0; i<n;i++){
		for(int j=0;j<m;j++){
		
	if(i%2!=0 ){
		if(arr[i][j]%3==0 && arr[i][j]!=0){
		rez*=arr[i][j];
		}
		
	}
		}
			}System.out.print(rez);	
	
	}
	

	public static void main(String []args){
System.out.println( "Please, enter size of array: " );
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
           
        int [][] mass = new int [n][m];
        
		mass=getMass(mass,n,m);
		printMass(mass,n,m);
		
		
		System.out.println();
		System.out.println();
		printInvertMass(mass,n,m);
		
		System.out.println();
		System.out.println();
		printEvenNumb(mass,n,m);
		
		System.out.println();
		System.out.println();
		printOddNumb(mass,n,m);
		
		
		System.out.println();
	
		printCountSumm(mass,n,m);
		System.out.println();
		printCountNumb(mass,n,m);
		
	}

}
