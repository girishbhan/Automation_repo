
class Vehicle{
	Vehicle (int salary){
		System.out.println("i am vehicle class constructor");
		System.out.println(salary);
	}
	void color() {
		System.out.println("Vehicle is black");
	}
}
class Bike extends Vehicle{
	//default constructor with super()
	
	
Bike(){super(26000);
	System.out.println("i am bike class constructor");
		
	}
	void wheels(int ct) {
		System.out.println("bike has "+ct+" wheels");
	}
}
class Car extends Vehicle{
	//default constructor with super()
	Car (){
		super(45000);
	}
	void wheels(int ct) {
		System.out.println("Car has "+ct+" wheels");
	}
}
public class Example5 {

	public static void main(String[] args) {
		Bike ref = new Bike();
		Car rev = new Car();
		
		
        
	}
}