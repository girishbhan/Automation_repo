package newpractice;

public class block {
	final static int salary;
	final double age;
	block(){
		this(25000,30);
		System.out.println(" i am zero param cons.");
	}
	public static void main(String[] args) {
		System.out.println("program starts");
		block ref = new block();
		System.out.println("GV salary"+salary);
		System.out.println("GV age"+ref.age);
		}
	static {salary = 50000;
		System.out.println("----------SIB-------------");
			}
	{age=45;
		System.out.println("--------------NSIB----------");
}
	block(int salary, int age){
		salary = 12000; age=20;
		System.out.println("local salary="+salary);
		System.out.println("local age :"+age);
		System.out.println("GV salary:"+block.salary);
		System.out.println("GV age:"+this.age);
		
		System.out.println("----------I am  param cons.-----------");
	}
}