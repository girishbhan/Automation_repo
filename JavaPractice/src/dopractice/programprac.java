package dopractice;
import java.util.Scanner;
public class programprac {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c ;
		for(int i=0;i<=10;i++) {
			c=a+b;
			System.out.println(a);
             a =b;
			b=c;
			}
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("print number");

		num = sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum = sum+i;
		}
		System.out.println(sum);

       int nat ;
       int subs;
       System.out.println("type the end point");
       nat = sc.nextInt();
       for(int i=nat;i>=1;i--) {
    	   subs=i-1;
    	   System.out.println(subs);
    	   
       }
       System.out.println("write the number for table:");
       int ref;
       int table =sc.nextInt();
       for(int i=1;i<=10;i++) {
    	  ref =table*i;
    	  System.out.println(ref);
    	    }
       int factorial;
       int fact;
       System.out.println("type the number:");
       factorial = sc.nextInt();
       for(int s=factorial;s>=1;s--) {
    	   fact= factorial*(s-1);
    	   System.out.println(fact);
    	   
       }
       
	}    
}
