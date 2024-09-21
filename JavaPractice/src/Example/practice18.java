package Example;

public class practice18 {
	static int a =15, b =16;
	int num =1;
	int rep= 35;
	int tes=56;

	public static void main(String[] args) {
	 int sum= practice18.a + practice18.b;
	  System.out.println("sum:"+sum);
	  practice18 ref= new practice18();
	 ref.methodA();
	 methodC();
	   int v= ref.num+a;
	   System.out.println("v is :"+v);
	  
	
	}
	public void methodA() {
		//int res = practice18.a-practice18.b;
	 int p =17, q=54;
	 practice18 t= new practice18();
	 
	 int res = p+q+t.num;
	 System.out.println("value is :"+res);
	 
	}
	public static void methodC() {
		practice18 y =new practice18();
		 int sum = y.rep;
		 System.out.println(sum);
		
		
	}
}


