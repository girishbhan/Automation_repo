package dopractice;
import java.util.Scanner;
public class exprac {

	public static void main(String[] args) {
     int num;
     Scanner sc = new Scanner(System.in);
     System.out.println("Type a number");
     num = sc.nextInt();
     for(int a =1;a<=num;a++) {
    	 if((num%a)==0) {
    		 System.out.println(a);
    	 }
     }
     int sum=4532;
     int ct=0;
     while(sum>0) {
    	sum =sum /10; 
    	ct++;
     }
     System.out.println(ct);
     
     int a =0;
     int b =1;
     int c;
      for (int i=0;i<=10;i++) {
    	  c =a+b;
    	  System.out.println(a);
    	  a=b;
    	  c=b;
      }
     
     
}

}
