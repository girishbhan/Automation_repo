package julypractice;
	


import java.util.Scanner;
class deng{
	void methodA() {
		System.out.println("i am methodA");
		Scanner scn = new Scanner(System.in);
		int num;
		double b;
		float c;
		boolean d;
		char e;
		String r ="welcome";
		num=scn.nextInt();
		b = scn.nextDouble();
		c =scn.nextFloat();
		d = scn.nextBoolean();
		e =scn.next().charAt(0);
		r = scn.next();
		System.out.println(num+b+c+e+r);
		
	}
}
public class stringexample {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner ref = new Scanner(System.in);// as scanner class belongs to java.util package we need to import the java.util package
       System.out.println("type num1");
		num1 =ref.nextInt();
       System.out.println("type num2");
       num2 =ref.nextInt();
       System.out.println("type num3");
       num3 =ref.nextInt();
       int num = num1+num2+num3;
       System.out.println(num);
       
	}

}
