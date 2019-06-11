package java401codechallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test
    public void testEnqueueOnce() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(5);
        assertEquals("Front have value 5", 5, testQueue.stack1.top.value);
    }

    @Test
    public void testEnqueueMultipleTimes() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        testQueue.enqueue(7);
        testQueue.enqueue(8);
        assertEquals("Front have value 5", 5, testQueue.stack1.top.value);
    }

    @Test(expected = NullPointerException.class)
    public void testDequeueEmpty() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.dequeue();
    }

    @Test
    public void testDequeueOnceSingleNode() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(5);
        testQueue.dequeue();
        assertNull("Front should be null",  testQueue.stack1.top);
    }

    @Test
    public void testDequeueMultipleTimes() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        testQueue.enqueue(7);
        testQueue.enqueue(8);
        testQueue.dequeue();
        testQueue.dequeue();
        assertEquals("Front have value 7", 7, testQueue.stack1.top.value);
    }
}
