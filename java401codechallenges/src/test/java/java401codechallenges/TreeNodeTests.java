package java401codechallenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeNodeTests {

    @Test
    public void testNewNode() {
        TreeNode<Integer> newTreeNode = new TreeNode<>(12);
        Integer nodeVal = newTreeNode.getValue();
        assertTrue("Node value should be 12", nodeVal == 12);
        assertNull("Node right should be null", newTreeNode.getRight());
        assertNull("Node left should be null", newTreeNode.getLeft());
    }

    @Test
    public void testNewNodeWithLeftChildOnly() {
        TreeNode<Integer> newTreeNode = new TreeNode<>(12);
        TreeNode<Integer> leftTreeNode = new TreeNode<>(13);
        newTreeNode.setLeft(leftTreeNode);
        assertTrue("Node value should be 12", newTreeNode.getValue() == 12);
        assertTrue("Node left value should be 13", newTreeNode.getLeft().getValue() == 13);
        assertNull("Node right should be null", newTreeNode.getRight());
    }

    @Test
    public void testNewNodeWithRightChildOnly() {
        TreeNode<Integer> newTreeNode = new TreeNode<>(12);
        TreeNode<Integer> rightTreeNode = new TreeNode<>(14);
        newTreeNode.setRight(rightTreeNode);
        assertTrue("Node value should be 12", newTreeNode.getValue() == 12);
        assertTrue("Node right value should be 14", newTreeNode.getRight().getValue() == 14);
        assertNull("Node right should be null", newTreeNode.getLeft());
    }

    @Test
    public void testNewNodeWithLeftChildAndRightChild() {
        TreeNode<Integer> newTreeNode = new TreeNode<>(12);
        TreeNode<Integer> leftTreeNode = new TreeNode<>(13);
        TreeNode<Integer> rightTreeNode = new TreeNode<>(14);
        newTreeNode.setRight(rightTreeNode);
        newTreeNode.setLeft(leftTreeNode);
        assertTrue("Node value should be 12", newTreeNode.getValue() == 12);
        assertTrue("Node left value should be 13", newTreeNode.getLeft().getValue() == 13);
        assertTrue("Node right value should be 14", newTreeNode.getRight().getValue() == 14);
    }
}
