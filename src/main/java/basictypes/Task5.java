package basictypes;

import java.util.Scanner;

public class Task5 extends Task4 {

	static double cylinder_area(int r,int h){
		double sp=circle_area(r);
		return sp*h;
	}
	
	static double cylinder_volume(int r,int h){
		double vol=circumference(r);
		return vol*h;
	}
	
	static double sphere_area(int r){
		double vol=circumference(r);
		return vol*4;
	}
	
	static double sphere_volume(int r){
		double vol=((4/3)*pi*(r^3));
		return vol;
	}
	
	static double parallel_volume(int a,int b,int h){
		double vol=rectangle_area(a,b);
		return vol*h;
	}
	
	static double parallel_area(int a,int b,int h){
		double vol=rectangle_perim(a,b);
		return vol*h;
	}
	
	static double tetraedr_area(int a){
		double half_perim=((1/2)*3*a);
		double s=((a^2)*(Math.sqrt(3)))/4;
		double aph=((2*s)/a);
		
		return half_perim*aph;
	}
	 static double tetraedr_volume(int a,int h){
		 double s=((a^2)*(Math.sqrt(3)))/4;
		 return ((1/3)*s*h);
	 }
	
	public static void main(String args[]) {
		
		int r_cyl;
		int h_cyl;
		int r_sph;
		int a_p,b_p,h_p;
		int a_tetr,h_tetr;
		
		System.out.println("Здравствуйте!В этой части мы перейдем к вычислению характеристик объёмных тел! ");
		System.out.println("Для начала, поработаем с шаром :) Введите радиус шара: ");
		Scanner sc = new Scanner(System.in);
		r_sph = sc.nextInt();
		double l=sphere_volume(r_sph);
		System.out.println("Объём шара: "+l);
		double s=sphere_area(r_sph);
		System.out.println("Площадь поверхности шара: "+s);
		
		System.out.println("Теперь, сделаем из шара цилиндр! Введите высоту цилиндра: ");
		h_cyl = sc.nextInt();
		double cyl=cylinder_area(r_sph,h_cyl);
		System.out.println("Площадь поверхности цилиндра: "+cyl);
		
		double cyl_vol=cylinder_volume(r_sph,h_cyl);
		System.out.println("Объём цилиндра: "+cyl_vol);
		
		
		System.out.println("Теперь поработаем с правильной пирамидой :) Введите сторону треугольника основания\n и высоту тетраэдра: ");
		
		a_tetr = sc.nextInt();
		h_tetr = sc.nextInt();
		double st=tetraedr_area(a_tetr);
		System.out.println("Площадь тетраэдра: "+st);
		
		 double pt=tetraedr_volume(a_tetr,h_tetr);
		 System.out.println("Объём тетраэдра: "+pt);
		 
		 System.out.println("Настала очередь параллелепипеда :) Введите его стороны и высоту: ");
		 	a_p = sc.nextInt();
			b_p = sc.nextInt();
			h_p = sc.nextInt();
			double sr=parallel_area(a_p,b_p,h_p);
			System.out.println("Площадь параллелепипеда: "+sr);
			
			 double pr=parallel_volume(a_p,b_p,h_p);
			 System.out.println("Объём параллелепипеда: "+pr);
			
	}
	
}
