package java401codechallenges;

public class PseudoQueue<T> {
    Stack<T> stack1;
    Stack<T> stack2;

    public PseudoQueue(){
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }


    public void enqueue(T value) {
        while(stack1.top != null){
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while(stack2.top != null){
            stack1.push(stack2.pop());
        }
    }

    public T dequeue() {
        return stack1.pop();
    }
}
