package java401codechallenges;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
    TreeNode<T> root;
    public BinarySearchTree() {
       super();
    }

    public BinarySearchTree(T value) {
        this.root = new TreeNode<T>(value);
    }

    public void add(T value) {
        if(root == null){
            super.setRoot(value);
        } else if ( root.value.compareTo(value) < 0 || root.value.equals(value)){
            TreeNode current = root.getLeft();
            while(current.left != null) {
                current = current.left;
                if(current.left == null) {
                    current.setLeft(new TreeNode(value));
                    current = current.left;
                }
            }
        } else {
            TreeNode current = root.getRight();
            while(current.right != null) {
                current = current.right;
                if(current.right == null) {
                    current.setRight(new TreeNode(value));
                    current = current.right;
                }
            }
        }
    }

    public Boolean contains(T value) {
        if(this.root.value == null){
            return false;
        }

        return containsHelper(value,root);
    }

    public Boolean containsHelper(T value, TreeNode<T> current) {
        if(current == null){
            return null;
        } else if(current.value.equals(value)) {
            return true;
        } else if (current.value.compareTo(value) < 0) {
            return containsHelper(value, current.left);
        } else {
            return containsHelper(value, current.right);
        }
    }
}
