package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
public static void main(String[] args) {

       ArrayList dir = new ArrayList();
       List ref = new ArrayList();
      
	dir.add("girish");
	dir.add(1234);
	dir.add("vikas");
	dir.add("selenium");
	dir.add(null);
	System.out.println("total elements in list are:"+dir.size());
	System.out.println("element at perticular index is:"+dir.get(2));
	 for(int i=1;i<dir.size();i++) {
		 System.out.println("all the elements in the list are:"+dir.get(i));
	 }
	 for(Object obj:dir) {
		 System.out.println(dir);
	 }
	// dir.remove(1);
	// System.out.println("updated List elements:"+dir.size());
      dir.set(1,"django");//removes the previous element and puts the new..
      for(Object obj:dir) {
 		 System.out.println(dir);
 	 }
    System.out.println(dir);
    System.out.println("size of the elements:"+dir.size());
    ArrayList l2 = new ArrayList();
    l2.add("welcome");
    l2.add("to");
    l2.add("selenium");
    l2.add("session");
    System.out.println(l2);
    System.out.println("no.of elements:"+l2.size());
    System.out.println("element at index 1 is:"+l2.get(1));
	 System.out.println("pert. element at which index:"+l2.indexOf("welcome"));
	 l2.add(2,"automation");
	 System.out.println(l2);
	 l2.addAll(dir);
	 System.out.println(l2);
	 l2.removeAll(dir);
	 System.out.println(l2);
	 
	 
	}

}
