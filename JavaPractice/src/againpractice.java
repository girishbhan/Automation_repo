
public class againpractice {
	final int salary;// declared this in non static block.
	int rupees = 780;
	 final static int fees; // problem in declaring this variable in static block.
		public static void main(String[] args) {
		 final	int age;
			//System.out.println(age);
			System.out.println("program starts");
			againpractice ref = new againpractice();
			
			System.out.println(ref.salary);
			System.out.println(ref.rupees);
		  System.out.println(againpractice.fees);
		  age = 45;
		  System.out.println(age);
		  ref.methodA();

	}
		static {
		 fees = 55000;// this is how we can declare sgv in static block.
		//  System.out.println("rupees :"+fees);
		   System.out.println("i am static block");
				}
		static {
			int rupees = 6800;
			System.out.println("rupees id :"+rupees);
			System.out.println("i am static block 2");
		}
		void methodA() {
			System.out.println("i am non static method");
			System.out.println(salary);
			System.out.println(rupees);
		}
		{ salary = 60000;
			System.out.println("i am non static block");
}
}
