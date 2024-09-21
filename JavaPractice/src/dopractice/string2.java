package dopractice;
import java.util.Scanner;
public class string2 {

	public static void main(String[] args) {
	  String sc;
	  Scanner ref = new Scanner(System.in);
	  System.out.println("type a String");
	    sc =ref.next();
	    string2.methodA(sc);
	    
	  
	}
 static void methodA(String str) {
	  String sc =str;
	  String temp="";
	  for(int i =sc.length()-1;i>=0;i--) {
		  temp = temp+sc.charAt(i);
		  
	  }
	  System.out.println("reverse of String is--"+temp );
  }
}
