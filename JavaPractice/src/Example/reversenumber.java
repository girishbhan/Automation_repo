package Example;

public class reversenumber {

	public static void main(String[] args) {
		System.out.println("program starts");
   int x=123;
   getreverse(x);
   System.out.println("reverse number is:"+getreverse(x));
	}
	 static int getreverse(int a) {
		 int rev=0,rem;
		 System.out.println("original number is :"+a);
		 while(a!=0) {
			 rem=a%10;
			 rev=rev*10+rem;
			 a=a/10;
		 }
		return rev;
		
	}

}
