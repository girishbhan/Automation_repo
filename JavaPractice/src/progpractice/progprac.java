package progpractice;
import java.util.Scanner;

public class progprac {

	public static void main(String[] args) {
   for(char ch ='A';ch<='Z';ch++) {
	   System.out.println(ch);
   }
   for (char ch ='a';ch<='z';ch++) {
	   System.out.print(ch);
   }
   int num;
   Scanner s = new Scanner(System.in);
   System.out.println("enter the number");
   num =s.nextInt();
    for(int ct=0;num>0;ct++) {
    	num=num/10;
    	System.out.println(ct);
    }
	}

}
