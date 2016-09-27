package basictypes;

public class Task2_1 {
	 
	 
	public static void makeMass(int [] mass){
		int count=0;
		for(int i=0;i<mass.length;i++){
			mass[i]=count;
			count++;
		}
	}
	  
	public static void printMass(int [] arr){
		for(int i:arr){
			System.out.print(i+"  ");
		}
		System.out.println();
	}
	
	
	public static int[] isMultiple(int [] arr, int n){
		int count=0;
		for(int i=0;i<arr.length;i++){
			
			count++;
		}
		int rez[]=new int[count];
		int j=0;
		for(int i:arr){
			if(i%n==0){
				rez[j]=i;
				j++;
			}
				
		}
		printMass(rez);
		return rez;
	}
	 public static int sumCount(int [] arr){
		 int sum=0;
		 for(int i:arr){
			  sum+=i;
		 }
		 System.out.println(sum);
		 return sum;
	 }
	
	public static void main(String args[]){
		int mass[]=new int [101];
		makeMass(mass);
		printMass(mass);
		
		int[]mult_3=isMultiple(mass,3);
		int s3=sumCount(mult_3);
		
		int[]mult_2=isMultiple(mass,2);
		int s2=sumCount(mult_2);
		
		int[]mult_5=isMultiple(mass,5);
		int s5=sumCount(mult_5);
		
		int[]mult_7=isMultiple(mass,7);
		int s7=sumCount(mult_7);
		int razn=s7-s2;
		System.out.println(razn);
	}

}
