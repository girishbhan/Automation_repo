package dopractice;

public class StringPrac {
	
	static void palincheck(String str) {
	 str ="Gandit gu";
	 String temp="";
	 for(int i =str.length()-1;i>=0;i--) {
		 temp= temp+str.charAt(i);
		 
	 }
	 System.out.println("reverse number is :"+temp);
	 if(temp.equals(str)) {
		 System.out.println("this is a palindrome string");
	 }
	 else {
		 System.out.println("This is not a palindrome number.");
	 }
	}

	public static void main(String[] args) {
 String sc = new String("Welcome");// String sc = "welcome";
 StringPrac ref = new StringPrac();
 ref.palincheck(sc);
 System.out.println("elemnts in string is :"+sc.length());
 System.out.println("char at the index 1 is :"+sc.charAt(1));
 System.out.println("char at index 3 is :"+sc.charAt(3));
 System.out.println("sc at uppercase:"+sc.toUpperCase());
 System.out.println("sc at lowercase:"+sc.toLowerCase());
 System.out.println("sc char e at which index:"+sc.lastIndexOf('e'));// last e in string
 System.out.println("sc char e at which index:"+sc.indexOf('e'));
 for(int i=sc.length()-1;i>=0;i--) {
	 System.out.println("reverse char of string:"+sc.charAt(i));
 }
 String temp = "";
 for (int i=sc.length()-1;i>=0;i--) {
	 temp = temp+ sc.charAt(i);
	 }
 System.out.println(temp);
 String str1="Pune";
	//toString() method is overrided in String class, so it will value present inside string object
	System.out.println("Str1: "+str1);
	String str2="Pune";
	System.out.println("Str2: "+str2);
	System.out.println("check str1 and str2 contains same value or not? "+str1.equals(str2));
	System.out.println("check str1 and str2 both are same object or not? "+(str1==str2));
 
 
 
	}

}
