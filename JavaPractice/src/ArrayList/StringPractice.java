package ArrayList;

public class StringPractice {

	public static void main(String[] args) {
	 //reverse a String mEthod1 = using Stringbuffer class
		String s = "Welcome to automation";
		System.out.println(s.length());
        StringBuffer reverse = new StringBuffer(s);
        reverse.reverse();
        System.out.println("The reverse of the string is : "+reverse);
		//method 2=
        String rev ="";
		for(int i = s.length()-1;i>=0;i--) {// keep note that i should be decreased with -- and ishould be >=0
			char ch;
			ch = s.charAt(i);
		rev = rev+ch;	
			
		}
		System.out.println("The reverse Of the given String is : "+rev);
		
		

	}
	
	}


