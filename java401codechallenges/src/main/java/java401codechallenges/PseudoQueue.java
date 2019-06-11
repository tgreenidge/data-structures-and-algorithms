package java401codechallenges;

public class PseudoQueue {
    Stack stack1;
    Stack stack2;

    public PseudoQueue(){
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }


    public void enqueue(int value) {
        while(stack1.top != null){
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while(stack2.top != null){
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        return stack1.pop();
    }
}
