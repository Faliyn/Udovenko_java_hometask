package basictypes;
import java.util.Scanner;

import java.util.Random;
public class Task2_4 {
	
	public static void getMass(int [] arr){
		Random rand = new Random();
		for(int i=0; i<arr.length;i++){
			arr[i]=rand.nextInt(100);
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	
	public static void printMass(int [] arr){
		for(int i:arr){
			System.out.print(i);
			
		}System.out.println();
	}
	
	public static void printInvertMass(int [] arr){
		
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}System.out.println();
	}
	
		public static void printEvenNumb(int [] arr){
	for(int i:arr){
		
	if(i%2==0){
		System.out.print(i);
		
	}else System.out.print("*");
	
	
	}System.out.println();
}

		public static void printOddNumb(int [] arr){
		
			for(int i:arr){
		
				if(i%2!=0){
						System.out.print(i);
		
					}else System.out.print("*");

	
	}System.out.println();
}

public static void printCountSumm(int [] arr,int n){
	int summ=0;
	for(int i:arr){
		
	if(i%n==0){
		summ+=i;
		
	}
	
	
	}System.out.println(summ);
}


public static void printCountProd(int [] arr,int n){
	int rez=1;
	for(int i:arr){
		
	if(i%n==0){
		rez*=i;
		
	}
	
	
	}System.out.println(rez);
}



	
	public static void main( String[] args )
    {
    	
    	
        System.out.println( "Please, enter size of array: " );
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int [] mass = new int [n];

        getMass(mass);
        printMass(mass);
        printInvertMass(mass);
        printEvenNumb(mass);
        printOddNumb(mass);
        
        printCountSumm(mass,3);
        printCountProd(mass,7);
    }

}
