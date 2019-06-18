package java401codechallenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    @Test
    public void testEmptyTree() {
        BinaryTree<String>tree = new BinaryTree<>();
        FizzBuzzTree<String> fizzBuzzTree = new FizzBuzzTree<>();
        fizzBuzzTree.fizzBuzz(tree);
        assertNull("Root should be null", tree.root);
    }

    @Test
    public void testSingleNodeTreeFizzBuzzResult() {
        BinaryTree<String>tree = new BinaryTree<String>("30");
        FizzBuzzTree<String> fizzBuzzTree = new FizzBuzzTree<>();
        fizzBuzzTree.fizzBuzz(tree);
        assertEquals("Root should be FizzBuzz", "FizzBuzz", tree.root.value);
        assertNull("Root should be Null", tree.root.left);
        assertNull("Root should be Null", tree.root.right);
    }

    @Test
    public void testSingleNodeTreeFizzResult() {
        BinaryTree<String>tree = new BinaryTree<>("3");
        FizzBuzzTree<String> fizzBuzzTree = new FizzBuzzTree<>();
        fizzBuzzTree.fizzBuzz(tree);
        assertEquals("Root should be Fizz", "Fizz", tree.root.value);
        assertNull("Root should be Null", tree.root.left);
        assertNull("Root should be Null", tree.root.right);
    }

    @Test
    public void testSingleNodeTreeBuzzResult() {
        BinaryTree<String>tree = new BinaryTree<>("25");
        FizzBuzzTree<String> fizzBuzzTree = new FizzBuzzTree<>();
        fizzBuzzTree.fizzBuzz(tree);
        assertEquals("Root should be Buzz", "Buzz", tree.root.value);
        assertNull("Root should be Null", tree.root.left);
        assertNull("Root should be Null", tree.root.right);
    }

    @Test
    public void testSingleNodeTreeNotAFizzBuzzResult() {
        BinaryTree<String>tree = new BinaryTree<>("26");
        FizzBuzzTree<String> fizzBuzzTree = new FizzBuzzTree<>();
        fizzBuzzTree.fizzBuzz(tree);
        assertEquals("Root should be FizzBizz", "26", tree.root.value);
        assertNull("Root should be Null", tree.root.left);
        assertNull("Root should be Null", tree.root.right);
    }

    @Test
    public void testMultipleNodeTree() {
        TreeNode<String> newNode = new TreeNode("12");
        newNode.setLeft(new TreeNode<String>("13"));
        newNode.setRight(new TreeNode<String>("14"));
        newNode.getLeft().setLeft(new TreeNode<String>("15"));
        newNode.getLeft().setRight(new TreeNode<String>("10"));
        newNode.getRight().setRight(new TreeNode<String>("18"));
        newNode.getRight().setLeft(new TreeNode<String>("60"));
        BinaryTree<String> tree = new BinaryTree<>(newNode);
        FizzBuzzTree<String> fizzBuzzTree = new FizzBuzzTree<>();
        fizzBuzzTree.fizzBuzz(tree);
        assertEquals("Root should be Fizz", "Fizz", tree.root.value);
        assertEquals("Root should be 13", "13", tree.root.getLeft().value);
        assertEquals("Root should be 14", "14", tree.root.getRight().value);
        assertEquals("Root should be FizzBuzz", "FizzBuzz", tree.root.getLeft().getLeft().value);
        assertEquals("Root should be Buzz", "Buzz", tree.root.getLeft().getRight().value);
        assertEquals("Root should be Fizz", "Fizz", tree.root.getRight().getRight().value);
        assertEquals("Root should be FizzBuzz", "FizzBuzz", tree.root.getRight().getLeft().value);
    }
}

