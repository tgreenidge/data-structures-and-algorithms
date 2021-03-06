package java401codechallenges;

import org.junit.Test;
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
        expectedHead.nextNode = new Node(4);
        expectedHead.nextNode = new Node(3);

        LinkedList testLinkedList  = new LinkedList();
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

    @Test
    public void testAddToEndOfLikedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(3);
        testLinkedList.insert(4);
        testLinkedList.insert(5);
        testLinkedList.append(6);
        Node currentNode = testLinkedList.head;
        while(currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        assertEquals("Can successfully add a node to the end of the linked list", 6, currentNode.value);
    }


    @Test
    public void testMutipleNodesToEndOfLinkedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(3);
        expectedOutput.add(4);
        expectedOutput.add(5);
        assertEquals("Can successfully add multiple nodes to the end of a linked list", expectedOutput, testLinkedList.print());

    }

    @Test
    public void testinsertNodeBeforeTomiddleOfLinkedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        testLinkedList.insertBefore(4, 7);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(3);
        expectedOutput.add(7);
        expectedOutput.add(4);
        expectedOutput.add(5);

        assertEquals("Can successfully insert a node before a node located in the middle of a linked list", expectedOutput, testLinkedList.print());
    }

    @Test
    public void testinsertNodeBeforeFirstNodeOfLinkedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        testLinkedList.insertBefore(3, 7);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(7);
        expectedOutput.add(3);
        expectedOutput.add(4);
        expectedOutput.add(5);

        assertEquals("Can successfully insert a node before the first node of a linked list", expectedOutput, testLinkedList.print());
    }


    @Test
    public void testinsertNodeAfterNodeInMiddleOfLinkedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        testLinkedList.insertAfter(4, 7);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(3);
        expectedOutput.add(4);
        expectedOutput.add(7);
        expectedOutput.add(5);
        assertEquals( "Can successfully insert after a node in the middle of the linked list", expectedOutput, testLinkedList.print());
    }

    @Test
    public void testinsertNodeAfterLastNodeOfLinkedList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        testLinkedList.insertAfter(5, 7);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(3);
        expectedOutput.add(4);
        expectedOutput.add(5);
        expectedOutput.add(7);
        assertEquals( "Can successfully insert a node after the last node of the linked list", expectedOutput, testLinkedList.print());
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testKthNodeFromEndShortList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        testLinkedList.kthValueFromEnd(7);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testKthNodeFromEndKSameAsLength() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        testLinkedList.kthValueFromEnd(3);
    }

    @Test (expected = NullPointerException.class)
    public void testKthNodeFromEndKIsNotPositive() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        testLinkedList.kthValueFromEnd(-1);
    }

    @Test
    public void testKthNodeFromEndLinkedListSize1() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        assertEquals("Where the linked list is of a size 1, k is 0", 3, testLinkedList.kthValueFromEnd(0));
    }

    @Test (expected = NullPointerException.class)
    public void testKthNodeFromEndLinkedListSize1KNot0() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.kthValueFromEnd(1);
    }

    @Test
    public void testKthNodeFromEndKInMiddleOfList() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(3);
        testLinkedList.append(4);
        testLinkedList.append(5);
        assertEquals("“Happy Path” where k is not at the end, but somewhere in the middle of the linked list", 3, testLinkedList.kthValueFromEnd(2));
        assertEquals("“Happy Path” where k is not at the end, but somewhere in the middle of the linked list", 4, testLinkedList.kthValueFromEnd(1));

    }

    @Test
    public void testMerge2EmptyLists() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        assertNull("Should return empty list", LinkedList.merge(list1, list2).head);
    }

    @Test
    public void testMergeList1Empty() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list2.head = new Node(2);
        assertEquals("Should return list2", list2, LinkedList.merge(list1, list2));
    }

    @Test
    public void testMergeList2Empty() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.head = new Node(2);
        assertEquals("Should return list1", list1, LinkedList.merge(list1, list2));
    }

    @Test
    public void testMerge2SingleNodeLists() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.head = new Node(2);
        list2.head = new Node(3);
        LinkedList expectedList = new LinkedList();
        expectedList.head = new Node(2);
        expectedList.head.nextNode = new Node(3);
        assertEquals("Should return list1", expectedList.print(), LinkedList.merge(list1, list2).print());
    }

    @Test
    public void testMerge2NodeListsUnequalLength1() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.head = new Node(2);
        list1.head.nextNode = new Node(4);
        list2.head = new Node(3);
        LinkedList expectedList = new LinkedList();
        expectedList.head = new Node(2);
        expectedList.head.nextNode = new Node(3);
        expectedList.head.nextNode.nextNode = new Node(4);
        assertEquals("Should return list1", expectedList.print(), LinkedList.merge(list1, list2).print());
    }

//    @Test
//    public void testMerge2NodeListsUnequalLength2() {
//        LinkedList list1 = new LinkedList();
//        LinkedList list2 = new LinkedList();
//        list1.head = new Node(2);
//        list1.head.nextNode = new Node(4);
//
//        list2.head = new Node(3);
//        list2.head.nextNode = new Node(5);
//        list2.head.nextNode.nextNode = new Node(6);
//        LinkedList expectedList = new LinkedList();
//        expectedList.head = new Node(2);
//        expectedList.head.nextNode = new Node(3);
//        expectedList.head.nextNode.nextNode = new Node(4);
//        expectedList.head.nextNode.nextNode.nextNode = new Node(5);
//        expectedList.head.nextNode.nextNode.nextNode.nextNode = new Node(6);
//        assertEquals("Should return ExpectedList", expectedList.print(), LinkedList.merge(list1, list2).print());
//    }

}
