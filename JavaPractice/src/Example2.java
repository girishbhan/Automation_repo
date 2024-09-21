class Demo11{
	//default constructor
	static int age=25;
	int salary=45000;
}
class Demo12 extends Demo11{
	//Java compiler will write :default constructor along with default super()
	
	//int salary=45000; //virtually will be available in Demo12 class
	void calling() {
		System.out.println("I am calling method");
	}
	static void display() {
		System.out.println("I am display method");
	}
}
public class Example2 extends Demo12{
	//Java compiler will write :default constructor along with default super()
	
	/* virtually will be available in Example2 class
		int salary=45000;
		void calling() {
			System.out.println("I am calling method");
		}
	 */
	int age=30;
	void show() {
		System.out.println("I am show method");
	}
	public static void main(String[] args) {
		System.out.println("Demo11, static variable age: "+Demo11.age);
		Demo12.display();
		
		Example2 ref=new Example2();
		System.out.println("Demo11, nonstatic variable using Example2 class object: "+ref.salary);
		ref.calling();
		System.out.println("Example2, nonstatic varibale age: "+ref.age);
		ref.show();
	}
}
