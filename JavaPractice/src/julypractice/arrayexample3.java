package julypractice;

public class arrayexample3 {

	public static void main(String[] args) {
	 int []dir = new int[5];//5 is size of array ie number of elements.
	 dir[0]=10;
	 dir[1]=11;
	 dir[2]=12;
	 dir[3]=13;
	 dir[4]=14;
	 int [ ] ref =new int[] {23,24,25,2,36,45};// check if 25 is present in array and if yes then on which index?
	 System.out.println(dir.length);
	 System.out.println(ref.length);
	 for(int a:dir) {
		 System.out.println(a);
	 }
	 System.out.println("=====================================================================================");
	 for(int i=0;i<dir.length;i++) {
		 System.out.println(dir[i]);
	 }
	 for(int j=0;j<ref.length;j++) {
		 if(ref[j]==25) {
			 System.out.println(ref[j]+"is present at index no.:"+j);
		 }
		 
	 }
	 

	}

}
