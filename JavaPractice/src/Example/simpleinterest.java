package Example;

public class simpleinterest {

	public static void main(String[] args) {
	  System.out.println("program starts");
	 // methodA(55000,5,7.8);
	  int p =55000;
	   methodA(55000,5,7.8);
	  //System.out.println(x);
	   double fullinterest = p+ methodA(55000,5,7.8);
	   System.out.println("full interest is "+fullinterest);
	   
	  
	  
	  }
	static double methodA(int p,int t, double r) {
		double interest;
		interest=(p*r*t)/100;
		System.out.println("simple interest is:"+interest);
		return interest;
		
		
	}

}
