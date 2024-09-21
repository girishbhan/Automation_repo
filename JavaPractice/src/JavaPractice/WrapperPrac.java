package JavaPractice;

public class WrapperPrac {

	public static void main(String[] args) {
		/*
		 * int a = 35; Integer obj = a;// implicit boxing ; explicit boxing is
		 * discontinued after java 8 version System.out.println(obj);// will print value
		 * as toString method is overrided here boolean value = true; Boolean ref =
		 * value; System.out.println("comaparing the values:"+obj.equals(ref)); boolean
		 * b = ref.booleanValue();//unboxing System.out.println(b);
		 */
		String st = "  welcome ";
		String bt = new String("java language");
		System.out.println("length in the string is:" + st.length());
		System.out.println("charcter in the 2 index is:" + st.charAt(2));
		System.out.println("character at 0 index :" + st.charAt(0));
		System.out.println("removing the spaces from start and end:" + st.trim());
		System.out.println("comparing the two objects based on values:" + bt.equals(st));
		System.out.println("string in uppercase is :" + st.toUpperCase());
		System.out.println("string in lowercase is :" + st.toLowerCase());
		// print every single char of string class
		for (int i = 0; i < st.length(); i++) {
			System.out.println(st.charAt(i));

		}
		StringBuffer deng = new StringBuffer("i love india");
		System.out.println(deng.length());
		deng.append("doska dadang");
		System.out.println(deng);
		System.out.println(deng.capacity());
		deng.reverse();
		System.out.println(deng);
		System.out.println(deng.charAt(2));
		System.out.println(deng.indexOf("o"));
		
		int a=25;
		Integer obj = a;
		int x =obj.intValue();

	}

}
