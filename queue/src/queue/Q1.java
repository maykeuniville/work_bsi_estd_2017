package queue;

public class Q1 {
	
	public Queue<Integer> q1 (Integer[] a, Integer[] b) {
		Queue<Integer> result = new ArrayQueue<>();
		
		for (Integer integer : a) {
			result.enqueue(integer);
		}
		
		for (Integer integer : b) {
			result.enqueue(integer);
		}
		
		return result;
	}

}
