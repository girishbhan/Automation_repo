package newpractice;
public class Example1 {

	//global variables
	static int a=25;
	double salary=45000.56;
	
	Example1(){
		System.out.println("I am zero-param cons...");
	}
	
	Example1(double salary){
		this();
		System.out.println("I am double-param cons...");
		System.out.println("local Salary: "+salary);
		System.out.println("global Salary: "+this.salary);
		//assigning local salary value to global salary
		this.salary=salary;
		System.out.println("local Salary: "+salary);
		System.out.println("updated, global Salary: "+this.salary);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		//local variable
		int a=10,b=20,c=a+b;
		System.out.println("local variable a : "+a);
		System.out.println("local variable b : "+b);
		System.out.println("local variable c : "+c);
		//access global variable
		System.out.println("static GV a: "+Example1.a);
		Example1 ref=new Example1();
		System.out.println("nonStatic GV salary: "+ref.salary);
		//access methods
		addition();
		addition(a, b);//addition(25, 75);
		
		System.out.println("Reverse number is: "+ref.getReverseNumber());
		System.out.println("With overloaded method, Reverse number is: "+ref.getReverseNumber(654));
		ref.getSalary(45000, 5000);
		
		Example1 r1=new Example1(55000.85);
		System.out.println("Program Ends");
	}
	
	void getSalary(int fixPay,int variablePay) {
		double salary=fixPay+variablePay;
		System.out.println("Fix pay is: "+fixPay);
		System.out.println("Variable pay is: "+variablePay);
		System.out.println("final Salary is: "+salary);
		System.out.println("Standard Salary NSGV : "+this.salary);
	}
	
	int getReverseNumber(int num) {
		int rev=0,rem;
		System.out.println("Original number is: "+num);
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	int getReverseNumber() {
		int num=123,rev=0,rem;
		System.out.println("Original number is: "+num);
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	static void addition() {
		int num1=20,num2=30,res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
	static void addition(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
}