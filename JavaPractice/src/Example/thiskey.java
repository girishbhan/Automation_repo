package Example;

public class thiskey {
	static int age =25;
	 double salary = 55000;
	public static void main(String[] args) {
		System.out.println("program starts");
		System.out.println("age :"+age);
        thiskey ref = new thiskey();//if we have both the nsib and nsc present in the method then after creating an object first block will be accessed.		
		System.out.println("salary :"+ref.salary);//when non static block and non static cons. is presented in a class then after creating an object first block is executed and then cons 
		double sum = age+ref.salary;
		System.out.println(sum);
		thiskey.methodA();
		ref.methodB();
		}
	   static void methodA() {
		   System.out.println(thiskey.age);
		   thiskey ref = new thiskey();// we can create the same name object in different methods.
		   double  sum = age+ref.salary;
		   System.out.println(sum);
		      }
	   void methodB() {
		   System.out.println(+age);
		   System.out.println(salary);//accessed non static variable directly in non static method
	   }
		   thiskey(){
			   System.out.println(" i am zero param cons ");
			  //  salary = 54000;
			   System.out.println(salary);
			   	   }
		   static {
			   System.out.println("===============sib");
		   }
		   {System.out.println("=====NSIB======================");}
}
