package julypractice;

class Demo2 {
	void calling() {
		System.out.println("I am calling you....");
	}
}

public class objectclass extends Demo2{
			void display() {
				System.out.println("I am displaying....");
			}
			
			public String toString() {
				return "Hello";
			}
			public int hashCode() {
				return 101;
			}
			public boolean equals(Object obj) {
				return true;
			}
			public static void main(String[] args) {
				Demo2 d1=new Demo2();
				System.out.println("Demo2 ref d1: "+d1);
				System.out.println("Demo2 ref d1 address in integer: "+d1.hashCode());
						
				
				objectclass ref1=new objectclass();
				System.out.println("ref1: "+ref1);
				System.out.println("Ref1 address in integer: "+ref1.hashCode());
						//or
				//System.out.println("ref1: "+ref1.toString());
				
				objectclass ref2=new objectclass();
				System.out.println("ref2: "+ref2.toString());
				System.out.println("Ref2 address in integer: "+ref2.hashCode());
				
				System.out.println("Ref1 compared with ref2: "+ref1.equals(ref2));
				
				objectclass ref3=ref1;
				System.out.println("ref3: "+ref3.toString());
				System.out.println("Ref3 address in integer: "+ref3.hashCode());
				System.out.println("Ref1 compared with ref3: "+ref1.equals(ref3));	
			}
		

}


