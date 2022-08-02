// Ques1
//import java.util.Scanner;
//class Inderpreet2{
	
	public static void main(String args[]){
		
		//Scanner sc= new Scanner(System.in);
		//System.out.print("Enter a number:");
	//	int a =sc.nextInt();
//if(a%2==0)
//System.out.println(a + "is even");
//else 
//System.out.println(a +"is odd");	
//	}
//}

// Ques 2

//if(a>55)
	//System.out.println(a+"is greater");
//else
//	System.out.println(a+"is smaller");
//}
//}

//Ques3
import java.util.Scanner;
class Inderpreet2{
		public static void main(String args[]){

		//int a,b;

		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		a = sc.next.Int;
		b= sc.nextInt();
		//if(a==b)
		//{
			//System.out.println("a and b are equal");
		//}else{
			
			//System.out.println("a and b are not equal");
		//}
		//if(a>b)
		//{
		//	System.out.println(" a is greater");
		//}	else{
		//	System.out.println("b is greater");
		//}
//	}
//}





 Ques4
class Inderpreet2{
	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
				System.out.print("Enter a number:");
		int num=sc.nextInt();



	
		String rollno='546';
		Switch(rollno){
			case"579":
			System.out.println("Sonu's rollno");
			break;
			case "546":
			System.out.println("Monu's rollno");
			break;
			case "553":
			System.out.println("Manu's rollno");
			break;
			case "544":
			System.out.println("Meenu's roolno");
			break;
			case "516":
			System.out.println("Meena's rollno");
			break;
			default;


			
		}
		
	}
}


//Ques 6
import java.util.Scanner;
class Inderpreet2{
	
		public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
				System.out.print("value of n");
						int n=sc.nextInt();
						for(int i=1;i<n;i++){
							
							System.out.print(i);
						}



}
}

//Ques 8
class Inderpreet2{
	
			public static void main(String args[]){
				int a=3;
				int b=5;
				for(int i=1;i<=a;i++){
					System.out.println(" ");
					for(int j=1;j<=b;j++){
						if(i+j%2==0){
							System.out.print("1");
							else{
								
								System.out.print("0");
							}
						}					}
					System.out.println();
				}

}
}

//Ques 5

pass by value- pass by value is used in java.It means original value dosen't change but it's copy must change. When we give a copy of original file then if change occur in copy then there is no change in original file. 
for eg. int a=10;
int b=a;
then b =20;

then value of a doesn't change.
a=10

pass by reference-pass by reference is not used in java. It means if value of copied file change then value of original file also changed. When we give a copy of original file then and if we change anything in copy file then original file also changed.
for eg. int a=10;
intb=a;
then b=20;
then value of a changed.
a=20;


//Quees7


class Inderpreet2{
	
				public static void main(String args[]){
					int arr[]=10;
					for(int i=1;i<=arr;i++)
						System.out.println(i)

	
}

}