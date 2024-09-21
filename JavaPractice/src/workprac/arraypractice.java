package workprac;

public class arraypractice {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]= 10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		int dir[] = new int[] {1,2,3,4,5,6};
		int ref[]= {9,8,7,6,5,4};
		System.out.println(dir.length);
		System.out.println(ref.length);
		System.out.println(a.length);
		for (int s=0;s < ref.length;s++) {
			System.out.println(ref[s]);
		}
		System.out.println("===========================================================");
        for (int x= ref.length-1;x>=0;x--) {
        	System.out.println(ref[x]);
        }
        for(int p:dir) {
        	System.out.println(p);
        }
        for (int r=0;r<dir.length;r++) {
        	if(dir[r]==4) {
        		System.out.println(dir[r]+"is present at index number:"+r);
        		
        	}
      for (int y:dir) {
    	   if (y==4) {
    		   System.out.println(y);// why this output is getting printed 3 times????
    		   break;
    	   }
    	  
    	   }
     
        }
	}

}
