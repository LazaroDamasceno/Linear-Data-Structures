package withlist;

import java.util.ArrayList;
import java.util.List;

import javax.management.QueryEval;

public class Queue {

	private List<Object> queue = new ArrayList<>();
	
	public void add(Object object) {
        	queue.add(object);
	}
	
	public boolean isEmpty() {
        	return queue.size() == 0;
	}
	
	public int size() {
        	return queue.size();
	}
	
	public List<Object> print() {
       		return queue;
	}
	
	public Object get(int index) {
		try {
		    return queue.get(index);
		} catch (IndexOutOfBoundsException e) {
		    return "The given index is out of the bounds.";
		}
	}
	
	public void set(int index, Object object) {
		try {

		} catch (IndexOutOfBoundsException e) {
		    System.out.println("The given index is out of the bounds.");
		}
	}
	
	public void remove() {
		if (!isEmpty()) {
		    queue.remove(queue.get(0));
		} else {
		    System.out.println("The stack is empty.");
		}
	}
    
}
