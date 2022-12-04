import withlist.Queue;

public class Main {

	public static void main(String[] args) {
		var queue = new withlist.Queue();
		queue.add('2');
		queue.add(2);
		queue.add("2");
		System.out.println(queue.print());
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println(queue.print());
		queue.remove();
	}

}
