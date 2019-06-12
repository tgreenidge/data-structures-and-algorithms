package java401codechallenges;

import java.util.ArrayList;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(T val) {
        Node<T> newNode = new Node(val);
        newNode.nextNode = head;
        head = newNode;
    }

    public boolean includes(T target) {
        Node<T> nextNode = head;

        while(nextNode != null) {
            if(nextNode.value == target)
                return  true;
            else
                nextNode = nextNode.nextNode;
        }

        return false;
    }

    public ArrayList<T> print() {
        ArrayList<T> nodeValues = new ArrayList<T>();

        Node<T> nextNode = head;

        while(nextNode != null){
            nodeValues.add(nextNode.value);
            nextNode = nextNode.nextNode;
        }

        return nodeValues;
    }

    public void append(T val) {
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

    public void insertBefore(T beforeVal, T newVal) {
        Node<T> current = head;

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

    public void insertAfter(T afterVal, T newVal){
        Node<T> current = head;

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

    public T kthValueFromEnd(int k) {
        if(k < 0) {
            throw new IllegalArgumentException("k is negative - should be positive");
        }

        if(head == null)
            throw new NullPointerException("List is empty");

        // tracks the length of the list
        int length = 0;

        LinkedList newList = new LinkedList();

        Node<T> current = head;

        while(current != null) {
            newList.insert(current.value);
            current = current.nextNode;
            length++;
        }

        // k cannot be more than the length
        if(k > length)
            throw new NullPointerException("List is not long enough to get kth value from the end");

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


        Node next1 = list1.head;
        Node next2 = list2.head;
        Node temp = next1.nextNode;

        while(next1 != null  && next2 != null) {
            temp = next1.nextNode;
            next1.nextNode = next2;
            next1 = temp;
            next2 = next2.nextNode;
        }

        System.out.println(next1.value);
        System.out.println(next1.value);
//        temp = next2.nextNode;
//        next1.nextNode = temp;
//        if(next1.nextNode == null) {
//            temp = next2.nextNode;
//            next1.nextNode = temp;
//        } else {
//
//            next2.nextNode = next1;
////            next1.nextNode.nextNode = temp;
//
////            next2.nextNode = next1.nextNode;
////            next1.nextNode = next2;
//        }
        return list1;
    }
}
