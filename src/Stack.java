import java.util.List;
import java.util.stream.Stream;

public class Stack {
	
	private Object[] stack = new Object[0];
	
	public void add(Object object) {
		Object[] newStack = new Object[stack.length+1]; 
		newStack[0] = object;
		for (int index = 1; index < newStack.length; index++) {
			newStack[index] = stack[index-1];
		}
		stack = newStack;
	}
	
	public boolean isEmpty() {
		return stack.length == 0;
	}
	
	public int size() {
		return stack.length;
	}
	
	public List<Object> print() {
		return Stream.of(stack).toList();
	}
	
	public Object get(int index) {
		try {
			return stack[index];
		} catch (IndexOutOfBoundsException ioofbe) {
			return "The given index is out the bounds.";
		}
	}
	
	public void set(int index, Object object) {
		try {
			stack[index] = object;
		} catch (IndexOutOfBoundsException ioofbe) {
			System.out.println("The given index is out the bounds.");
		}
	}
	
	public void remove() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
		} else {
			Object[] newQueue = new Object[stack.length-1];
			for (int i = 1; i < stack.length; i++) {
				newQueue[i-1] = stack[i];
			}
			stack = newQueue;
		}
	}

}
