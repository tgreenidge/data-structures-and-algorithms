package java401codechallenges;

public class Queue<T> {
    Node<T> front;
    Node<T> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(T val) {
        Node<T> newNode = new Node(val);
        if(front == null) {
            front = newNode;
            back = newNode;
        } else {
            back.nextNode = newNode;
            back = back.nextNode;
        }

    }

    public T dequeue() {
        if(front == null) {
            throw new NullPointerException("empty list");
        }

        T result = front.value;


        if(front == back) {
            back = null;
            front = null;
        } else {
            front = front.nextNode;
        }

        return result;
    }

    public T peek() {
        if(front == null) {
            //throw exception instead
            return null;
        } else {
            return front.value;
        }
    }
}
