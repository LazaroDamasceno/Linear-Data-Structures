package witharray;

import java.util.stream.Stream;
import java.util.List;

public class Queue {

	private Object[] queue = new Object[0];
	
	public void add(Object object) {
		Object[] newQueue = new Object[queue.length+1];
		for (int i = 0; i < queue.length; i++) {
			newQueue[i] = queue[i];
		}
		newQueue[newQueue.length-1] = object;
		queue = newQueue;
	}
	
	public boolean isEmpty() {
		return queue.length == 0;
	}
	
	public int size() {
		return queue.length;
	}
	
	public List<Object> print() {
		return Stream.of(queue).toList();
	}
	
	public Object get(int index) {
		try {
			return queue[index];
		} catch (IndexOutOfBoundsException ioofbe) {
			return "The given index is out the bounds.";
		}
	}
	
	public void set(int index, Object object) {
		try {
			queue[index] = object;
		} catch (IndexOutOfBoundsException ioofbe) {
			System.out.println("The given index is out the bounds.");
		}
	}
	
	public void remove() {
		if (isEmpty()) {
			System.out.println("The queue is empty.");
		} else {
			Object[] newQueue = new Object[queue.length-1];
			for (int i = 1; i < queue.length; i++) {
				newQueue[i-1] = queue[i];
			}
			queue = newQueue;
		}
	}
	
}
