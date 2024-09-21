package PracticeDay1;

public class ArrayPractice {

	public static void main(String[] args) {
	  int [] array = {10,20,23,50,40};
	  int  min, max;
	  min = 10;
	  for(int i=1;i<array.length;i++) {
		  if (min >array[i]) {
			  min = array[i];
		  }
	  }
	  System.out.println("the min value of the element is :"+min);
	  max =10;
	  for (int j =1;j<array.length;j++) {
		  if (max <array[j]) {
			  max =array[j];
			  System.out.println("maximum value in iteration "+j+" is "+max);
		  }
	  }
	  System.out.println("the max value of the  element is :"+max);
	}

}
