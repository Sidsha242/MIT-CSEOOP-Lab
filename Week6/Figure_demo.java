package proj_pack2;

import java.util.*;
abstract class Figure
{
	int x,y;
	abstract void area();
	
}

class Rectangle extends Figure {
	void area() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Rectangle");
		System.out.print("Enter length and breadth: ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("The area of Rectangle is: " + x * y);
	}
}
class Triangle extends Figure {
	void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Triangle");
		System.out.print("Enter Base And Height: ");
		x =sc.nextInt();
		y =sc.nextInt();
		System.out.println("The area of Triangle is: " + (x * y) / 2);
	}
}
class Square extends Figure {
	void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Square");
		System.out.print("Enter side of square : ");
		x =sc.nextInt();
        y = x;
		System.out.println("The area of Square is: " + (x * y));
	}
}

class Figure_demo {
	
	public static void main(String args[]) 
	{
		Figure fiobj;
		fiobj= new Rectangle();
		fiobj.area();

		fiobj= new Triangle();
		fiobj.area();
		
		fiobj = new Square();
		fiobj.area();
	}
}

