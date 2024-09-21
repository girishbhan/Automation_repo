package Example;

public class getreturntype {

	public static void main(String[] args) {
		System.out.println("program starts");
		int x=123;
		//getReverseNumber(x);/*when you directly call method having return type then you will be execute its method body but you wont get its return value.
	System.out.println(getReverseNumber(x));
		/*when you call a method having return value with in println then you will execute the method body & also will 
		get the return value */
		
		System.out.println("program ends");
	
	}
public static int getReverseNumber(int num) {
	int rev=0,rem;
	System.out.println("original number is :" +num);
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	return rev;
	
}
}