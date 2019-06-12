package java401codechallenges;

public class Stack<T> {
    Node<T> top;

    public Stack() {
        top = null;
    }

    public void push(T val) {
        Node<T> newNode = new Node(val);
        if(top == null)
            top = newNode;
        else {
            newNode.nextNode = top;
            top = newNode;
        }
    }

    public T pop() {
        if(top == null) {
            throw new NullPointerException("Empty List");
        }
        Node<T> temp = top;
        top = top.nextNode;
        return temp.value;
    }

    public T peek() {
        if(top == null)
            return null;
        else
            return top.value;
    }


}
