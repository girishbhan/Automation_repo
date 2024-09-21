package fullpractice;

public class Javaprac {
public static void main(String[] args) {
	try {
	int a[] = new int [5];
    a[5] =45;
    System.out.println(a[5]);}
 /*   catch (ArrayIndexOutOfBoundsException b) {
     System.out.println("you are in catch block");
    	System.out.println(b);
    //	System.out.println(b.getMessage());
    //	b.printStackTrace();
   }*/
	catch(ArithmeticException ref) {
		System.out.println(ref);
		System.out.println(ref.getMessage());
		ref.printStackTrace();
	}
//	catch (Exception rev) {
	//	System.out.println("referrence ");
//	}
	catch (Throwable tir) {
		System.out.println("girish");
	}
	finally {
		System.out.println("exception not handled so moving out of program");
	}
}
}