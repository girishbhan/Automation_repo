package julypractice;
class Demo5{
	void calling() {
		System.out.println("i am ns method");
	}
}

public class systemclass {
     static Demo5 rev = new Demo5(); // created static reference variable of class Demo.
	public static void main(String[] args) {
	 Demo5 ref = new Demo5();
	 System.out.println(systemclass.rev);
	 System.out.println(ref);
	 systemclass.rev.calling();
	 int num1,num2;
	// Scanner scn = new Scanner(System.in);
	 
	 
  
	}

}
