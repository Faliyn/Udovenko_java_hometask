
package basictypes;
import java.util.Scanner;
import java.math.*;


public class Task4 {
	static double pi=3.14;
	
	public static double circle_area(int r)
	{		
		double l=2*pi*r;
		return l;
	}
		
		
		static double circumference(int r){
		 double s=(pi*(r^2));
		 return s;
		 }
		
		static double ring_area(int r,int R){
		if(R<r){
		double sk=pi*((r^2) - (R^2));
		return sk;
		}
		else System.out.println("������ ������ ������ ������� �����, ���������� ��� ���");
		return 0;
		}
		
	
	static double triangle_area(int a, int b, int c){
		double p=(1/2)*(a+b+c);
		System.out.println("step 1  "+p);
		double prom=(p*(p-a)*(p-b)*(p-c));
		System.out.println("step 2  "+prom);
		double s=Math.sqrt(prom);
		System.out.println("step 3  "+s);
		return s;
		
	}
	
	static double triangle_perim(int a, int b, int c){
		double p=(a+b+c);
		return p;
	}
	
	static int rectangle_area(int a, int b){
		int sp=a*b;
		return sp;
		
	}
	
	static int rectangle_perim(int a, int b){
		int p=(a+b)*2;
		return p;
		
	}
	
	
	public static void main(String [] args){
		
		int r_c;
		int R_c;
		int a_t,b_t,c_t;
		int a_r,b_r;
		
		
		System.out.println("������������! �� ������ ��������� �������������� ��������� �����! ");
		System.out.println("��� ������, ���������� � ������ :) ������� ������ �����: ");
		Scanner sc = new Scanner(System.in);
		r_c = sc.nextInt();
		double l=circumference(r_c);
		System.out.println("������ ����������: "+l);
		double s=circle_area(r_c);
		System.out.println("������� ����������: "+s);
		
		System.out.println("������, ���������� ������� ������. ������� ������ ������: ");
		R_c = sc.nextInt();
		double Sk=ring_area(r_c,R_c);
		System.out.println("������� ������: "+Sk);
		
		System.out.println("������ ���������� � ������������� :) ������� ������� ������������: ");
		
		a_t = sc.nextInt();
		b_t = sc.nextInt();
		c_t = sc.nextInt();
		double st=triangle_area(a_t,b_t,c_t);
		System.out.println("������� ������������: "+st);
		
		 double pt=triangle_perim(a_t,b_t,c_t);
		 System.out.println("�������� ������������: "+pt);
		 
		 System.out.println("������� ������� �������������� :) ������� ��� �������: ");
		 	a_r = sc.nextInt();
			b_r = sc.nextInt();
			
			double sr=rectangle_area(a_r,b_r);
			System.out.println("������� ��������������: "+sr);
			
			 double pr=rectangle_perim(a_r,b_r);
			 System.out.println("�������� ��������������: "+pr);
			
}
}
