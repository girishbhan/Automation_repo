package newpractice;

class Fruit{
	Fruit(int num){
		System.out.println("I am Fruit class cons...");
	}
	void taste() {
		System.out.println("Fruits are sweet");
	}
}
class Apple extends Fruit{
	Apple(){//
		super(25);//we need to write super() explicitly as parent class has parameterized constructor
		System.out.println("I am Apple class cons..");
	}
	void shape() {
		System.out.println("Apple are round in shape");
	}
}
public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Apple ref=new Apple()	;
		System.out.println("Program Ends");
	}
}