// Ques 1
Encapsulation- It is used to hide data from user. It is also acts as a shield which protect data from being accessed by the 
code outside this shield. The data of class can be hidden from other classes. The main motive of Encapsulation is data
hiding.

For eg. 

class Area{
	public static void main(String args[]){
	
	int length;
	int breadth;
	Area(int length , int breadth);{
		this.length = length;
		this.breadth = breadth;
	}
		
	}
	public void getArea(){
		int area = length*breadth;
		System.out.println("Area:"+ area);
		
	}
}
class Main{
	public static void main(String args[]){
		Area rectangle = new Area(5,6);
		rectangle.getArea();
	}
	
}

//Ques 2
Polymorphism- Java allows us to perform the same action in many different ways.Function overridding means name same,arguments 
same and return same. Function overloading means name same , argument different and different return type. It can
only be achieved by function overriding and function overloading.
 
For eg.
class Bike{
	
	
	void run(){
		System.out.println("running");
	}
	
} 
class Splendor extends Bike{
	
	void run(){
		
		System.out.println("running safely with 40km");
	}
	public static void main(String args[]){
		Bike b = new Splendor();
		b.run();
		
}
	}
	
// Ques 3

Access Specifiers- It is used to set the visibility of classes, interfaces,variables,methods and constructors.Access
Specifiers used as a keywords to control the visibility. 
There are four types of access specifiers-
1. private- We can access the private only within the same class.
2. Default- We can access the default within the class and within the packages.
3. protected- We can access the protected within the class, within packages and also outside the package by subclasses 
only.
4. public- We can access the public within class, within packages, also outside the package by subclasses and within
outside package.

Packages- Group classes considered as a package. Package considered similar type of classes.

Final Keyword- keywords are predefined in programming. Final Keyword target information.


// Ques 5

class Product{
	
	public static void main(String args[]){
		int n = 5;
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++){
			System.out.print("1");
			}
			System.out.println();
		}
		 
	}
}


//Ques 4
import java.util.Scanner;
public class Rectangle{
	
	double length;
	double width;
	void area()
	{
		
		double area;
		area = this.length*this.width;
		System.out.println("Area of rectanglr is:"+ area);
	}
		
	
	
}
class Shape extends Rectangle{
	
	void area(){
		
		System.out.println("length");
	}
	
	public static void main(String args[]){
		
		Rectangle b = new Shape();
		b.area();
	}
}


