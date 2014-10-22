package classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListClass {
	public void arrayListDifference() {
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		
		al.add("Tom"); // X
		al.add("Nora"); // 1
		al.add("Rosa"); // 2
		al.set(0, "Ron"); // 0
		
		ll.add("Tom"); // 1
		ll.add("Nora"); // 2
		ll.add("Rosa"); // 3
		ll.addFirst("Ron"); // 0
		
		System.out.println(ll.getFirst());
		System.out.println(al.get(0));
	}
}
