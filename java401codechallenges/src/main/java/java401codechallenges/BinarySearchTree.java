package java401codechallenges;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
    TreeNode<T> root;
    public BinarySearchTree() {
       super();
    }

    public BinarySearchTree(T value) {
        this.root = new TreeNode<T>(value);
    }

    public void setRoot(T value) {
        this.root = new TreeNode<T>(value);
    }

    public void add(T value) {
        if(root == null) {
            setRoot(value);
        } else {
            addHelper(value, root);
        }
    }

    public void addHelper(T value, TreeNode current) {
        if(current == null){
            return ;
        } else if ( current.value.compareTo(value) > 0 || current.value.equals(value)){
            if(current.left == null) {
                current.setLeft(new TreeNode(value));
                current = current.left;
            }
            addHelper(value, current.left);

        } else {
            if(current.right == null) {
                current.setRight(new TreeNode(value));
                current = current.right;
            }
            addHelper(value, current.right);
        }
    }

    public Boolean contains(T value) {
        if(this.root == null){
            return false;
        }

        return containsHelper(value, root);
    }

    public Boolean containsHelper(T value, TreeNode<T> current) {
        if(current == null){
            return false;
        } else if(current.value.equals(value)) {
            return true;
        } else if (current.value.compareTo(value) < 0) {
            return containsHelper(value, current.right);
        } else {
            return containsHelper(value, current.left);
        }
    }
}
