package Example;

public class returnvalue {

	public static void main(String[] args) {
	 System.out.println("program starts");
	 System.out.println(methodA(55000,7.8,5));// methodA(55000,7.8,5);
	 System.out.println("program ends");
	 

	}
static double methodA(double p,double r,double n) {
 
double interest=(p*r*n)/100;
 System.out.println("interest is :"+interest);// 
 return interest;
	
	
}
}
