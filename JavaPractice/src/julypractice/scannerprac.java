package julypractice;

import java.util.Scanner;

public class scannerprac {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // keep in mind to import java.util package
		int num1,num2;
		System.out.println("type numer 1");
	    num1= scn.nextInt();
	    System.out.println("type number 2:");
	    num2 =scn.nextInt();
	  //  System.out.println(num1);
	  //  System.out.println(num2);
	     int add =num1+num2;
	     System.out.println(add);
	    int a;
	    double b;
	    float c;
	    boolean d;
	    char v;
	    a = scn.nextInt();
	    b = scn.nextDouble();
	    c= scn.nextFloat();
	    v = scn.next().charAt(0);
	    d =scn.nextBoolean();
	    
		

	}

}
