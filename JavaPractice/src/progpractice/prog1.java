package progpractice;
import java.util.Scanner;
public class prog1 {

	public static void main(String[] args) {
	  int number ;
	  Scanner r = new Scanner(System.in);
	  System.out.println("Number type");
	  number =r.nextInt();
	  if (number >= 0) {
		  System.out.println("the given number is positive");
	  }
	  else {
		  System.out.println("the number is negative");
	  }
	  for(int i=0;i<5;i++) {
		  System.out.println("Printing 5 times");
	  }
	  for (int j =1;j<=5;j++) {
		  System.out.println(j);
	  }
	  int sum=0;
	  for(int h =0;h<=10;h++) {
		  sum =sum+h;
	  }
	  System.out.println("Sum of 10 natural number is :"+sum);
	}
}
