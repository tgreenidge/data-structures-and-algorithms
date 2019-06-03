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
}
