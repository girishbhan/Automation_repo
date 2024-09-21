package Example;

public class methodCalling {

	public static void main(String[] args) {
		System.out.println("program starts");
		methodCalling ref = new methodCalling();
		ref.addTwoNumbersWithParam(30,600);
		int a =30,b=40;// we can do this also 
		ref.addTwoNumbersWithParam(a,b);
		System.out.println("program ends");

	}
 void addTwoNumbers() {
	int a =20,b = 30, res;
	res=a+b;
	System.out.println("addition is:"+res);
	
}
 void addTwoNumbersWithParam(int a, int b) {
	int res= a+b;
	System.out.println("the addition is :"+res);
}
}