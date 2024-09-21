package JavaPractice;
import java.util.Scanner;
public class stringpractice {
	static String name;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a name");
		name = sc.next();
		System.out.println("reverse of this string is :"+stringpractice.methodA(name));
		stringpractice b = new stringpractice();
		b.methodB();

	}
     public static String methodA(String str) {
    	 String temp ="";
    	 str =stringpractice.name;
    	 for (int i =str.length()-1;i>=0;i--) {
    		 temp = temp+str.charAt(i);
    		  }
    	 return temp;
    	    }
     void methodB() {
    	 String sb = new String("i am learning java");
    	 System.out.println(sb);
    	 System.out.println("length of this string is :"+sb.length());
    	 System.out.println("character available at index 5 is:"+sb.charAt(5));
    	 System.out.println("string sb in lower case :"+sb.toLowerCase());
    	 System.out.println("string sb in upper case:"+sb.toUpperCase());
    	 System.out.println("perticular char at which string:"+sb.indexOf('l'));
    	 System.out.println("perticular char at which index:"+sb.indexOf('j') );
    	 System.out.println("last index of a character is :"+sb.lastIndexOf('a'));
    	 System.out.println(sb);
    	 
    	 
    	 
    	 }
     
}
