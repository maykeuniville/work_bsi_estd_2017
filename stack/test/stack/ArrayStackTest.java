package stack;

import org.junit.Assert;
import org.junit.Test;

public class ArrayStackTest {

	@Test
	public void pushTest() {
		
		Stack<String> stack = new ArrayStack<>();
		
		Assert.assertEquals(0, stack.getSize());
		Assert.assertTrue(stack.isEmpty());
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3, stack.getSize());
		Assert.assertFalse(stack.isEmpty());
	}

	@Test
	public void topTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3, stack.getSize());
		Assert.assertEquals("C", stack.top());
		Assert.assertEquals("C", stack.top());
		Assert.assertEquals(3, stack.getSize());
	}
	
}
