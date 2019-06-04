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
            System.out.println("Value not found in list. Did not insert new val");
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
            System.out.println("Value not found in list. Did not insert new val");
        } else {
            Node nodeToInsert = new Node (newVal);
            nodeToInsert.nextNode = current.nextNode;
            current.nextNode = nodeToInsert;
        }
    }
}
