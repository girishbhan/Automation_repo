package Example;

public class practice13 {

	public static void main(String[] args) {
		System.out.println("program starts");
		System.out.println("program ends");
    practice13.methodA();
	}
     public static void methodA() {
    	 int a =30, b=20, res =a+b;
    	 System.out.println("addition of two number is "+res);
    	 methodWithParam(30,500);
    	int d=50;int e=60;
    	 methodWithParam(d,e);
    	 
     }
     public static void methodWithParam(int a, int b) {
    	// a =50; b=20;
    	  int res =a+b;
    	 System.out.println("addition of two number is "+res);
}
}