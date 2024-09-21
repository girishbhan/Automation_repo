package workprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListPrac {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("rupa");
		list.add("shraddha");
		list.add("girish");
		list.add(12234);
		list.add(456);
		System.out.println("print the elements in list:" + list);
		list.add(0, "vikas");
		System.out.println(list);
		list.remove(4);
		System.out.println(list.size());
		list.set(4, 2345);
		System.out.println(list);
		list.add(23466);
		System.out.println(list);
		// Collections.sort(list);
		list.forEach(t -> {
			System.out.println(t);
		});

		Iterator jn = list.iterator();// need to impoer iterator package
		System.out.println(jn.hasNext());
		System.out.println(jn.next());
		jn.next();
		jn.next();
		jn.next();
		jn.next();
		jn.next();
		Iterator deng = list.iterator();
		while (deng.hasNext()) {
			System.out.println(deng.next());

		}
		ArrayList ref = new ArrayList();
		ref.add(2344);
		ref.add(4553);
		ref.add(54666);
		System.out.println(ref);
		list.addAll(ref);
		System.out.println(list);
		list.removeAll(ref);
		System.out.println(list);

	}
}