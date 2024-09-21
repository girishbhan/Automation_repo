package dopractice;

public class stringpractice {

	public static void main(String[] args) {
	  String s1 = new String("jai Hanuman");// two objects will be created with one reference variable
	  String s2 = "Jai Shriram";//only one object is created. 
	  System.out.println(s1);
	  System.out.println(s2);
	  String a= new String("jai siyaram");
	  String b ="jai siyaram";
	  System.out.println(a.toString());
	  System.out.println("comparing two objs. with values:"+a.equals(b));
	  System.out.println("comparing two objs. with address:"+(a==b));
	  
	  		
	  
	  

	}

}
