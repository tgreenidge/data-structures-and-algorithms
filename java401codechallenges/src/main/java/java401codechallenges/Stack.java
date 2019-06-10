package java401codechallenges;

public class Stack {
    Node top;

    public Stack() {
        top = null;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if(top == null)
            top = newNode;
        else {
            newNode.nextNode = top;
            top = newNode;
        }
    }

    public int pop() {
        if(top == null) {
            throw new NullPointerException("Empty List");
        }
        Node temp = top;
        top = top.nextNode;
        return temp.value;
    }

    public Integer peek() {
        if(top == null)
            return null;
        else
            return top.value;
    }


}
