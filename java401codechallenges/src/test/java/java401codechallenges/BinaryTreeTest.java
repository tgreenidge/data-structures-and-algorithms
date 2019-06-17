package java401codechallenges;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void testEmptyTreeConstructor() {
        BinaryTree<Integer> tree = new BinaryTree();
        assertNull("Root should be null", tree.root);
    }

    @Test
    public void testPreOrderTraversalOneNode() {
        BinaryTree<Integer> tree = new BinaryTree<>(12);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(12);;
        assertEquals("Should equal expected", expectedResult, tree.preOrder());
    }

    @Test
    public void testPreOrderTraversalLeftNode() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(12);
        expectedResult.add(13);
        assertEquals("Should equal expected", expectedResult, tree.preOrder());
    }

    @Test
    public void testPreOrderTraversalLeftNodeAndRightNode() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.setRight(new TreeNode<>(14));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(12);
        expectedResult.add(13);
        expectedResult.add(14);
        assertEquals("Should equal expected", expectedResult, tree.preOrder());
    }

    @Test
    public void testPreOrderTraversalMultipleLeftNodes() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.getLeft().setLeft(new TreeNode<>(15));
        newNode.setRight(new TreeNode<>(14));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(12);
        expectedResult.add(13);
        expectedResult.add(15);
        expectedResult.add(14);
        assertEquals("Should equal expected", expectedResult, tree.preOrder());
    }

    @Test
    public void testPreOrderTraversalMultipleLeftAndRightNodes() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.getLeft().setLeft(new TreeNode<>(15));
        newNode.setRight(new TreeNode<>(14));
        newNode.getRight().setLeft(new TreeNode<>(16));
        newNode.getRight().setRight(new TreeNode<>(17));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(12);
        expectedResult.add(13);
        expectedResult.add(15);
        expectedResult.add(14);
        expectedResult.add(16);
        expectedResult.add(17);
        assertEquals("Should equal expected", expectedResult, tree.preOrder());
    }


    @Test
    public void testInOrderTraversalOneNode() {
        BinaryTree<Integer> tree = new BinaryTree<>(12);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(12);;
        assertEquals("Should equal expected", expectedResult, tree.inOrder());
    }

    @Test
    public void testInOrderTraversalLeftNode() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(13);
        expectedResult.add(12);
        assertEquals("Should equal expected", expectedResult, tree.inOrder());
    }

    @Test
    public void testInOrderTraversalLeftNodeAndRightNode() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.setRight(new TreeNode<>(14));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(13);
        expectedResult.add(12);
        expectedResult.add(14);
        assertEquals("Should equal expected", expectedResult, tree.inOrder());
    }

    @Test
    public void testInOrderTraversalMultipleLeftNodes() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.getLeft().setLeft(new TreeNode<>(15));
        newNode.setRight(new TreeNode<>(14));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(15);
        expectedResult.add(13);
        expectedResult.add(12);
        expectedResult.add(14);
        assertEquals("Should equal expected", expectedResult, tree.inOrder());
    }

    @Test
    public void testinOrderTraversalMultipleLeftAndRightNodes() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.getLeft().setLeft(new TreeNode<>(15));
        newNode.setRight(new TreeNode<>(14));
        newNode.getRight().setLeft(new TreeNode<>(16));
        newNode.getRight().setRight(new TreeNode<>(17));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(15);
        expectedResult.add(13);
        expectedResult.add(12);
        expectedResult.add(16);
        expectedResult.add(14);
        expectedResult.add(17);
        assertEquals("Should equal expected", expectedResult, tree.inOrder());
    }

    @Test
    public void testPostOrderTraversalOneNode() {
        BinaryTree<Integer> tree = new BinaryTree<>(12);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(12);;
        assertEquals("Should equal expected", expectedResult, tree.postOrder());
    }

    @Test
    public void testPostOrderTraversalLeftNode() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(13);
        expectedResult.add(12);
        assertEquals("Should equal expected", expectedResult, tree.postOrder());
    }

    @Test
    public void testPostOrderTraversalLeftNodeAndRightNode() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.setRight(new TreeNode<>(14));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(13);
        expectedResult.add(14);
        expectedResult.add(12);
        assertEquals("Should equal expected", expectedResult, tree.postOrder());
    }

    @Test
    public void testPostOrderTraversalMultipleLeftNodes() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.getLeft().setLeft(new TreeNode<>(15));
        newNode.setRight(new TreeNode<>(14));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(15);
        expectedResult.add(13);
        expectedResult.add(14);
        expectedResult.add(12);
        assertEquals("Should equal expected", expectedResult, tree.postOrder());
    }

    @Test
    public void testPostOrderTraversalMultipleLeftAndRightNodes() {
        TreeNode<Integer> newNode = new TreeNode(12);
        newNode.setLeft(new TreeNode<>(13));
        newNode.getLeft().setLeft(new TreeNode<>(15));
        newNode.setRight(new TreeNode<>(14));
        newNode.getRight().setLeft(new TreeNode<>(16));
        newNode.getRight().setRight(new TreeNode<>(17));
        BinaryTree<Integer> tree = new BinaryTree<>(newNode);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(15);
        expectedResult.add(13);
        expectedResult.add(16);
        expectedResult.add(17);
        expectedResult.add(14);
        expectedResult.add(12);
        assertEquals("Should equal expected", expectedResult, tree.postOrder());
    }
}
