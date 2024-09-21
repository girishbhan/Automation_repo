package fullpractice;

public class inheritence {

	public static void main(String[] args) {
		System.out.println("i am main method ");
		/*
		 * exam r1 = new exam(); r1.methodA(); r1.methodB(); rascal ref = new rascal();
		 * ref.methodC(); ref.methodD();
		 */
		rascal r1= new rascal();
		r1.methodA();
		r1.methodB();
		r1.methodC();
		r1.methodD();
		r1.methodS();

	}
	void methodS() {
		System.out.println(" i am method s in inheritence class");
	}
}

class exam extends inheritence {
	void methodA() {
		System.out.println(" i am method A");
	}

	void methodB() {
		System.out.println(" i am method B");
	}
}

class rascal extends exam {
	void methodC() {
		System.out.println(" i am method c ");
	}

	void methodD() {
		System.out.println("  i am method d");
	}

}
