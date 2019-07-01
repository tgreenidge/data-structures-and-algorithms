package java401codechallenges;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
    TreeNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(T value) {
        this.root = new TreeNode<>(value);
    }

    public BinaryTree(TreeNode<T> root) {
        this.root = root;
    }

    protected void setRoot(T value) {
        this.root = new TreeNode<T>(value);
    }

    public ArrayList<T> preOrder(){
        ArrayList<T> preOrdered = new ArrayList<>();
        return preOrderHelper(root, preOrdered);
    }

    public ArrayList<T> preOrderHelper(TreeNode<T> current, ArrayList<T> preOrdered){
        if(current == null) {
            return null;
        }

        preOrdered.add(current.value);
        preOrderHelper(current.left, preOrdered);
        preOrderHelper(current.right, preOrdered);

        return preOrdered;
    }

    public ArrayList<T> inOrder(){
        ArrayList<T> inOrderedList = new ArrayList<>();
        return inOrderHelper(root, inOrderedList);
    }

    public ArrayList<T> inOrderHelper(TreeNode<T> current, ArrayList<T> inOrderedList){
        if(current == null) {
            return null;
        }

        inOrderHelper(current.left, inOrderedList);
        inOrderedList.add(current.value);
        inOrderHelper(current.right, inOrderedList);

        return inOrderedList;

    }

    public ArrayList<T> postOrder(){
        ArrayList<T> postOrderedList = new ArrayList<>();
        return postOrderHelper(root, postOrderedList);
    }

    public ArrayList<T> postOrderHelper(TreeNode<T> current, ArrayList<T> postOrderedList){
        if(current == null) {
            return null;
        }

        postOrderHelper(current.left, postOrderedList);
        postOrderHelper(current.right, postOrderedList);
        postOrderedList.add(current.value);

        return postOrderedList;

    }

    public static int findMaximumValue(BinaryTree<Integer> tree) {
        if(tree.root == null)
            throw new NullPointerException("Tree is empty");

        int maxVal = Integer.MIN_VALUE;
        Queue<TreeNode<Integer>> queue = new Queue<>();

        TreeNode<Integer> current = tree.root;
        queue.enqueue(current);

        while (queue.front != null) {
            current = queue.dequeue();
            maxVal = Math.max(current.value, maxVal);

            if(current.left != null)
                queue.enqueue(current.left);

            if(current.right != null)
                queue.enqueue(current.right);
        }
        return maxVal;
    }
}
