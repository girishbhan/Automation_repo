
abstract class Bike1 {
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed: "+spd);
	}
}
class Honda4 extends Bike1 {
	@Override
	void run() {
		System.out.println("running safely");
	}
	void color() {
		System.out.println("Honda1 color is blue");
	}
}
class abstractClass1{
	public static void main(String args[]) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();		
		//Bike1 b1=new Bike1(); //we cann't create an object of abstract class as it is incomplete class
		Bike1 b2=new Honda4();//when we create an object with reference to other class, then we can use only other class nsmethods.
		b2.run();
		b2.speed(20);
		//b2.color();
		
		
	}
}
