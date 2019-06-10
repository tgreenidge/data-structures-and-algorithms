package java401codechallenges;

public class Queue {
    Node front;
    Node back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if(front == null) {
            front = newNode;
            back = newNode;
        } else {
            back.nextNode = newNode;
            back = back.nextNode;
        }

    }

    public Integer dequeue() {
        if(front == null) {
            throw new NullPointerException("empty list");
        }

        int result = front.value;


        if(front == back) {
            back = null;
            front = null;
        } else {
            front = front.nextNode;
        }

        return result;
    }

    public Integer peek() {
        if(front == null) {
            return null;
        } else {
            return front.value;
        }
    }
}
