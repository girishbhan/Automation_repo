

public class newpractice {
	int salary;
	static int age;

	public static void main(String[] args) {
		System.out.println("program starts");
		newpractice ref = new newpractice(35000,45);
		ref.methodA(55000);
	//newpractice rev= new newpractice(58000);
		//newpractice res = new newpractice(25000,35);
		
		
		}
	newpractice(){
		System.out.println(" i am zero param cons.");
		System.out.println(this.salary);
		
		
	}
	newpractice(int salary){
		this();
		System.out.println(" i am param cons.");
		System.out.println(salary);
		System.out.println(this.salary);
	}
     newpractice (int salary, int age){
    	 this(25000);
    	 System.out.println(" i am 3 param cons.");
    	 System.out.println(salary);
    	 System.out.println(this.salary);
    	 System.out.println(age);
    	 System.out.println(this.age);// how can i able to acess the static global variable with this keyword?
     }
     void methodA(int salary) {
    	 salary = 45000;
    	 System.out.println(salary);
    	 System.out.println(this.salary);
     }
}
