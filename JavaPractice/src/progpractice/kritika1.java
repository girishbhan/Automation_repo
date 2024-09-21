package progpractice;

import java.util.Scanner;

public class kritika1 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
        num =  s.nextInt();
        if (num%2==0) {
        	System.out.println(+num+":number is even");
        }
        else {
        	System.out.println("the given number is odd");
        }
		

	}

}
