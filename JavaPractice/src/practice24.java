
public class practice24 {
    
	public static void main(String[] args) {
		System.out.println("program starts");
        practice25 ref = new practice27();// with the help of inheritence we have created only one object and we can acess the all classes ns members.
        ref.methodA();
        ref.methodB();
        }
		void methodA() {
			System.out.println("i am methodA in main method.");
			}
			}
 class practice25 extends practice24{
	void methodB() { //how to access this method.
		System.out.println("i am method A in class practice25");
	}
}
class practice26 extends practice25{
	void methodB() {
		System.out.println("i am method B");//this is overrided method, so on calling this method we get this method output 
	}
}
class practice27 extends practice26{
//	super();
	 void methodC(){
		System.out.println("i am method c");
	}
}