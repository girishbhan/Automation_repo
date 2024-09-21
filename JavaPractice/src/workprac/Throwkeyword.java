package workprac;
import java.util.Scanner;
public class Throwkeyword {

	public static void main(String[] args) {
     int age;
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter the age:");
     age = sc.nextInt();
     if (age<18) {
    	 throw new ArithmeticException("you are not eligible for voting");
    	 
     }
     else {
    	 System.out.println("you are eligible for voting");
     }
     System.out.println("deng tadka");
	}

}
