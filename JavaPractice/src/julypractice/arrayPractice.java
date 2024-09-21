package julypractice;

public class arrayPractice {

	public static void main(String[] args) {
    int num[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
   //  System.out.println(num.length);
  
   /*  for(int i =0;i<=num.length-1;i++) {
    	 System.out.println(num[i]);
    	 
    }
    for (int i = num.length-1;i>=0;i--) {
    	System.out.println(num[i]);
    }*/
    for(int a : num) {
    	System.out.println(a);
    }
    
	}

}
