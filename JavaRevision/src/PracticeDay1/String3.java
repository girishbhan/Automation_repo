package PracticeDay1;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a String");
		str = sc.next();
		StringBuffer ref = new StringBuffer(str);
		ref.reverse();
		System.out.println(ref);
		String3.methodA(8);
		int a = 0, b = 1;
		int c = 0;
		for (int i = 1; i <= 8; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
		String3.aerageOfThreeNus(30, 40, 50);

	}

	public static void methodA(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	static void aerageOfThreeNus(int a, int b, int c) {
		int d = (a + b + c) / 3;
		System.out.println(d);

	}

}
