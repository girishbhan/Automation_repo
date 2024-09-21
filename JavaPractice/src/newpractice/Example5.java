package newpractice;

public class Example5 {	
	int age;//we can change every cons. global variable value different.
	double salary;
	//user defined constructor- constructor overloading
	Example5(){
		System.out.println("I am zero-param cons..");
	}
	Example5(int num){
		System.out.println("I am int-param cons..");
		age=num;
	}
	Example5(double num){
		//this(25);
		System.out.println("I am double-param cons..");
		salary=num;
	}
	Example5(int num1,double num2){
		System.out.println("I am int-double-param cons..");
		age=num1;
		salary=num2;
	}
	public static void main(String[] args) {		
		System.out.println("Program starts");
		Example5 ref1=new Example5();
		System.out.println("age with ref1: "+ref1.age);
		System.out.println("salary with ref1: "+ref1.salary);
		System.out.println("**********************************");
		Example5 ref4=new Example5(25);
		System.out.println("age with ref4: "+ref4.age);
		System.out.println("salary with ref4: "+ref4.salary);
		System.out.println("**********************************");
		
		Example5 ref3=new Example5(25000.56);
		System.out.println("age with ref3: "+ref3.age);
		System.out.println("salary with ref3: "+ref3.salary);
		System.out.println("**********************************");
		Example5 ref2=new Example5(10,20000.56);
		System.out.println("age with ref2: "+ref2.age);
		System.out.println("salary with ref2: "+ref2.salary);
		System.out.println("Program ends");
	}	
}