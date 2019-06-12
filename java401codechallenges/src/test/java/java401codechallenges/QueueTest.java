package java401codechallenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void testNewQueue() {
        Queue testQueue = new Queue();
        assertNull(testQueue.front);
        assertNull(testQueue.back);
    }

    @Test
    public void testEnqueueOnce() {
        Queue testQueue = new Queue();
        testQueue.enqueue(5);
        assertEquals("Front have value 5", 5, testQueue.front.value);
        assertEquals("Back have value 5", 5, testQueue.back.value);
    }

    @Test
    public void testEnqueueMultipleTimes() {
        Queue testQueue = new Queue();
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        testQueue.enqueue(7);
        testQueue.enqueue(8);
        assertEquals("Front have value 5", 5, testQueue.front.value);
        assertEquals("Back have value 8", 8, testQueue.back.value);
    }

    @Test(expected = NullPointerException.class)
    public void testDequeueEmpty() {
        Queue testQueue = new Queue();
        testQueue.dequeue();
    }

    @Test
    public void testDequeueOnceSingleNode() {
        Queue testQueue = new Queue();
        testQueue.enqueue(5);
        testQueue.dequeue();
        assertNull("Front should be null",  testQueue.front);
        assertNull("back should be null", testQueue.back);
    }

    @Test
    public void testDequeueMultipleTimes() {
        Queue testQueue = new Queue();
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        testQueue.enqueue(7);
        testQueue.enqueue(8);
        testQueue.dequeue();
        testQueue.dequeue();
        assertEquals("Front have value 7", 7, testQueue.front.value);
        assertEquals("Back have value 8", 8, testQueue.back.value);
    }

    @Test
    public void testPeekEmpty() {
        Queue testQueue = new Queue();
        assertNull(testQueue.peek());
    }

    @Test
    public void testPeekOnceSingleNode() {
        Queue<Integer> testQueue = new Queue();
        testQueue.enqueue(5);
        assertTrue("Front should be 5", testQueue.peek() == 5);
    }

    @Test
    public void testPeekMultipleNodes() {
        Queue<Integer> testQueue = new Queue();
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        testQueue.enqueue(7);
        testQueue.enqueue(8);
        assertTrue("Front should be 5", testQueue.peek() == 5);
    }
}
