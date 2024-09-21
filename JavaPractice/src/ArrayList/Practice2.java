package ArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Practice2 {

	public static void main(String[] args) {
		ArrayList<String> rev = new ArrayList<String>();
		rev.add("yellow");
		rev.add("pink");
		rev.add("green");
		System.out.println(rev);
		System.out.println(rev.size());
		System.out.println(rev.get(0));
		System.out.println(rev.get(2));
        System.out.println(rev.contains("yellow"));
        rev.set(0,"pivla");
        System.out.println(rev);
        Collections.sort(rev);
        System.out.println(rev);
        rev.forEach(a-> {
        	System.out.println(a);
        });
        Iterator itr= rev.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	  }
        if (rev.contains("pivla")) {
        	rev.remove("pivla");
        }
        System.out.println(rev);
        rev.add(0,"hirva");
        PriorityQueue ref = new PriorityQueue();
        ref.add(123);
        ref.add(234);
        ref.add(345);
        ref.add(456);
        System.out.println(ref);
        ref.add(99);
        System.out.println(ref);
        System.out.println(ref.element());
        System.out.println(ref.peek());
        for(Object obj:ref) {
        	System.out.println(obj);
        }
        
        Iterator jr = ref.iterator();
        while(jr.hasNext()) {
  System.out.println(jr.next());        	
        }
        
        
	}

}
