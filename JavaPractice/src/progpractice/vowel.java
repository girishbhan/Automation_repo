package progpractice;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
    int num1,num2,num3;
    Scanner r = new Scanner(System.in);
    System.out.println("print number 1");
    num1 = r.nextInt();
    System.out.println("print number 2");
  num2 = r.nextInt();
  System.out.println("print number 3");
    num3 = r.nextInt();
    if((num1>num2)&&(num1>num3)) {
    	System.out.println("The largest number is :"+num1);
    	 }
    else if ((num2>num1) && (num2 >num3)){
    	System.out.println("the largest number is :"+num2);
    	
    }
    else {
    	System.out.println("the largest number is:"+num3);
    }
    
   int year;
   System.out.println("type year to check leap year");
   year = r.nextInt();
   if (year%100== 0 && year%400==0) {
	   System.out.println(year +" year is  lepa Year");
   }
   else { 
	   System.out.println("this year is not a leap year");
   }
   
    
	}

}
