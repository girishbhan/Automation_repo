package newpractice;

public class fullpractice {
	int  num = 4455;
	double salary =35000;

	public static void main(String[] args) {
	System.out.println("program starts");
	//fullpractice ref = new fullpractice();//if we have any param cons then we have to create an object with param cons. 
	fullpractice rev = new fullpractice(4500);
	rev.methodA(45000);
	rev.methodC();
	rev.methodC(56000);
	

	}
	 double methodA(double salary) {
		salary =43000;
		System.out.println("local salary"+salary);
		
	    double fullsalary = salary + this.salary;// now to differentiate salary variable we used this keyword
	    System.out.println(fullsalary);
	    return fullsalary;
	}
 public void methodB() {
	 System.out.println(this.salary);
	}
 public void methodC() {
	 //this(); we cant use this stat in ns method...it can be only used in cons. and it should be the first stat. of cons
	 System.out.println("i want to overload this method");
 }
 public void methodC(int salary) {
	 System.out.println("this method is overloaded.");
 }
 fullpractice(){
	 this(34000,34);
	 System.out.println("i am constructor");
	 int salary=45000;
	 double fsalary = salary+this.salary;// we can use this statement in constructor.
	 System.out.println("fsalary in consis "+fsalary);
 }
 fullpractice(int salary){
	 this();
 /*fullpractice(){ we can use only one non param cons in one class
	 System.out.println("i am second cons.");
 }*/
	 System.out.println(" i am param cons.");
	  }
 fullpractice(int salary,double age){
	 System.out.println("i am double param cons");
 }
 
 
}
