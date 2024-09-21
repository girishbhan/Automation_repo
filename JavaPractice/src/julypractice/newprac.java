package julypractice;

public class newprac {

	public static void main(String[] args) {
       String ref = new String("jai shriram");
       String rev = "welcome";
       System.out.println(ref);// we are printing the object so automatically the tostring method from object class will get called 
       String def = ref+rev;
       System.out.println(def);
       System.out.println(ref.length());
       System.out.println(ref.charAt(2));
       System.out.println(ref.equals(rev));
       System.out.println((ref==rev));
       
       
	}

}
