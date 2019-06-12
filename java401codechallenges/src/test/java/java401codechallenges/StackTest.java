package java401codechallenges;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class StackTest {
    @Test
    public void testNewStack() {
        Stack testStack = new Stack();
        assertNull(testStack.top);

    }

    @Test
    public void testPushOnce() {
        Stack testStack = new Stack();
        testStack.push(5);
        assertEquals("Front have value 5", 5, testStack.top.value);
    }

    @Test
    public void testPushMultipleTimes() {
        Stack testStack = new Stack();
        testStack.push(5);
        testStack.push(6);
        testStack.push(7);
        testStack.push(8);
        assertEquals("Top should have value 8", 8, testStack.top.value);
    }

    @Test(expected = NullPointerException.class)
    public void testPopEmpty() {
        Stack testStack = new Stack();
        testStack.pop();
    }

    @Test
    public void testPopOnceSingleNode() {
        Stack testStack = new Stack();
        testStack.push(5);
        assertEquals( "Should return 5" , 5, testStack.pop());
        assertNull("Front should be null",  testStack.top);
    }

    @Test
    public void testPopMultipleTimes() {
        Stack testStack = new Stack();
        testStack.push(5);
        testStack.push(6);
        testStack.push(7);
        testStack.push(8);
        testStack.pop();
        assertEquals( "Should return 7" , 7, testStack.pop());
        assertEquals("Top should have value 6", 6, testStack.top.value);
    }

    @Test
    public void testPeekEmpty() {
        Stack testStack = new Stack();
        assertNull("Front should be null", testStack.peek());
    }

    @Test
    public void testPeekOnceSingleNode() {
        Stack<Integer> testStack = new Stack();
        testStack.push(5);
        assertTrue("Should return 5", testStack.peek() == 5);
    }

    @Test
    public void testPeekPushMultipleTimes() {
        Stack<Integer> testStack = new Stack();
        testStack.push(5);
        testStack.push(6);
        testStack.push(7);
        testStack.push(8);
        assertTrue("Top should have value 8",  testStack.peek() == 8);
    }

}
