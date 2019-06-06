package java401codechallenges;

import java.util.ArrayList;

public class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        newNode.nextNode = head;
        head = newNode;
    }

    public boolean includes(int target) {
        Node nextNode = head;

        while(nextNode != null) {
            if(nextNode.value == target)
                return  true;
            else
                nextNode = nextNode.nextNode;
        }

        return false;
    }

    public ArrayList<Integer> print() {
        ArrayList<Integer> nodeValues = new ArrayList<>();

        Node nextNode = head;

        while(nextNode != null){
            nodeValues.add(nextNode.value);
            nextNode = nextNode.nextNode;
        }

        return nodeValues;
    }

    public void append(int val) {
        if (head == null) {
            insert(val);
        } else {
            Node nodeToAppend = new Node(val);
            nodeToAppend.nextNode = null;
            Node next = head;

            while (next.nextNode != null){
                next = next.nextNode;
            }

            next.nextNode = nodeToAppend;
        }
    }

    public void insertBefore(int beforeVal, int newVal) {
        Node current = head;

        if(head != null && head.value == beforeVal) {
            insert(newVal);
            return;
        }

        while(head != null && current.nextNode != null  && current.nextNode.value != beforeVal) {
            current = current.nextNode;
        }

        if(current.nextNode == null) {
            throw new IllegalArgumentException("Value not found in list. Did not insert new val");
        } else {
            Node nodeToInsert = new Node (newVal);
            nodeToInsert.nextNode = current.nextNode;
            current.nextNode = nodeToInsert;
        }
    }

    public void insertAfter(int afterVal, int newVal){
        Node current = head;

        while(current != null  && current.value != afterVal) {
            current = current.nextNode;
        }

        if(current == null) {
            throw new IllegalArgumentException("Value not found in list. Did not insert new val");
        } else {
            Node nodeToInsert = new Node (newVal);
            nodeToInsert.nextNode = current.nextNode;
            current.nextNode = nodeToInsert;
        }
    }

    public int kthValueFromEnd(int k) {
        if(k < 0) {
            throw new IllegalArgumentException("k is negative - should be positive");
        }

        if(head == null)
            throw new IndexOutOfBoundsException("List is empty");

        // tracks the length of the list
        int length = 0;

        LinkedList newList = new LinkedList();

        Node current = head;

        while(current != null) {
            newList.insert(current.value);
            current = current.nextNode;
            length++;
        }

        // k cannot be more than the length
        if(k > length)
            throw new IndexOutOfBoundsException("List is not long enough to get kth value from the end");

        current = newList.head;

        //tracks up to K
        int i = 0;
        while(i < length) {
            if(i == k) {
                break;
            } else {
                i++;
                current = current.nextNode;
            }
        }

        return current.value;
    }

    public static LinkedList merge(LinkedList list1, LinkedList list2) {
        if(list1.head == null)
            return list2;
        else if(list2.head == null)
            return list1;

        Node temp;
        Node next1 = list1.head;
        Node next2 = list2.head;

        while(next1.nextNode != null  && next2.nextNode != null) {
            temp = next1.nextNode;
            next1.nextNode = next2;
            next1 = temp;
            next2 = next2.nextNode;
        }

        if(next1.nextNode == null) {
            temp = next2.nextNode;
            next1.nextNode = temp;
        } else {
            temp = next1.nextNode;
            next1.nextNode = next2;
            next1.nextNode.nextNode = temp;
        }
        return list1;
    }
}
