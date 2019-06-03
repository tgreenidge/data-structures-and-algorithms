package java401codechallenges;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testEmptyLinkedList() {
        LinkedList newLinkedList = new LinkedList();
        assertNull("Can successfully instantiate an empty linked list", newLinkedList.head);
    }


    @Test
    public void testProperlyInsertIntoLinkedListOneNode() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(3);
        ArrayList <Integer> expectedNodes = new ArrayList<>();
        expectedNodes.add(3);
        assertEquals("Can properly insert into the linked list the value 3" , expectedNodes, testLinkedList.print());
    }

    @Test
    public void testProperlyInsertIntoLinkedListMultipleNodes() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(3);
        testLinkedList.insert(4);
        testLinkedList.insert(5);

        ArrayList <Integer> expectedValues = new ArrayList<>();
        expectedValues.add(5);
        expectedValues.add(4);
        expectedValues.add(3);
        assertEquals("Can properly insert multiple nodes into the linked list", expectedValues, testLinkedList.print() );
    }

    @Test
    public void testHead() {
        Node expectedHead = new Node(2);
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(3);
        testLinkedList.insert(4);
        testLinkedList.insert(2);
        assertEquals("The head property will properly point to the first node in the linked list", expectedHead.value, testLinkedList.head.value);
    }




    @Test
    public void testValueFoundInLinkedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(3);
        testLinkedList.insert(4);
        testLinkedList.insert(5);
        testLinkedList.insert(6);
        assertTrue("Will return true when finding a value within the linked list that exists", testLinkedList.includes(4));
    }


    @Test
    public void testValueNotFoundInLinkedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(3);
        testLinkedList.insert(4);
        testLinkedList.insert(5);
        testLinkedList.insert(6);
        assertFalse("Will return false when searching for a value in the linked list that does not exist", testLinkedList.includes(1));
    }


    @Test
    public void testReturnsCollectionOfAllValues() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(3);
        testLinkedList.insert(4);
        testLinkedList.insert(5);

        ArrayList <Integer> expectedValues = new ArrayList<>();
        expectedValues.add(5);
        expectedValues.add(4);
        expectedValues.add(3);
        assertEquals("Can properly return a collection of all the values that exist in the linked list", expectedValues, testLinkedList.print() );
    }
}
