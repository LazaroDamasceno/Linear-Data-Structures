package withlist;

import java.util.List;
import java.util.ArrayList;

public class Stack {
	
	private List<Object> stack = new ArrayList<>();
	
	public void add(Object object) {
		stack.add(0, object);
	}
	
	public boolean isEmpty() {
        return stack.size() == 0;
	}
	
	public int size() {
        return stack.size();
	}
	
	public List<Object> print() {
        return stack;
	}
	
	public Object get(int index) { 
        try {
            return stack.get(index);    
        } catch (IndexOutOfBoundsException e) {
            return "The given index is out of the bounds.";
        }
	}
	
	public void set(int index, Object object) {
        try {
            stack.set(index, object);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The given index is out of the bounds.");
        }
	}
	
	public void remove() {
        if (!isEmpty()) {
            stack.remove(stack.get(0));
        } else {
            System.out.println("The stack is empty.");
        }
	}

}
