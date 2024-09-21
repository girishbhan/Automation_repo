package Example;

public class example1 {
	public static void main(String[] args) {
		System.out.println("my name is lakhan");
		// System.out.println("addition is :"+methodA(12,13));
		methodA(12, 14);
		int x = methodA(12, 14);
		System.out.println(+x);
		methodB(12000, 8, 5);
		System.out.println(+methodB(12000, 8, 5));
		int y = methodB(15000, 8, 5);
		int z = x + y;
		System.out.println("value of z:" + z);

	}

	static int methodA(int a, int b) {
		int addition = a + b;
		System.out.println("value of a :" + a);
		System.out.println("value of b is :" + b);
		// System.out.println("addition is :"+addition);//
		return addition;
	}

	static int methodB(int p, int r, int t) {
		int interest = (p * r * t) / 100;
		System.out.println("amount:" + p);
		System.out.println("time:" + t);
		System.out.println("rate:" + r);
		return interest;
	}
	
	

}
