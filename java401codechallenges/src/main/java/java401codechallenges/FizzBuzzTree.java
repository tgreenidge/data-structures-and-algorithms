package java401codechallenges;

public class FizzBuzzTree<String extends Comparable<String>>  {
    public FizzBuzzTree() {

    }

    public BinaryTree fizzBuzz(BinaryTree<String> tree) {
        if (tree.root != null)
            fizzBuzzHelper(tree.root);
        return tree;
    }

    public void fizzBuzzHelper(TreeNode<String> current){
        if(current == null) {
            return ;
        }
        try {
            Integer num = Integer.parseInt((java.lang.String) current.value);
            if (num % 15 == 0) {
                current.setValue((String) "FizzBuzz");
            } else if(num % 3 == 0) {
                current.setValue((String) "Fizz");
            } else if(num % 5 == 0) {
                current.setValue((String) "Buzz");
            }
        } catch(NumberFormatException e) {
            System.out.println("String cannot be converted to integer");
        }

        fizzBuzzHelper(current.left);
        fizzBuzzHelper(current.right);
    }
}
