package newpractice;
class GrandFather{
	//default constructor
	void myHome() {
		System.out.println("Grandfather home...");
	}
}
class Father extends GrandFather{
	Father(int num){
		System.out.println("I am father class cons..");
	}
	//virtual member/inherited member: myHome()
	void myCar() {
		System.out.println("father car...");
	}
}
class Child extends Father{
	//default constructor with super()
	Child(){
		super(25);
		System.out.println("I am child class cons..");
	}
	
	//virtual member/inherited member: myHome(), myCar()
	void myBike() {
		System.out.println("Child bike...");
	}
}
public class Example3 {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.myBike();
		c1.myCar();
		c1.myHome();
	}

}
