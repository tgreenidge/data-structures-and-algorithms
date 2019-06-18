package java401codechallenges;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class BinarySearchTreeTests {
    @Test
    public void testAddOnEmptyList() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(12);
        assertTrue("Should be true", tree.root.getValue().equals(12));
    }

    @Test
    public void testAddOnSingleNodeToRight() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(12);
        tree.add(15);
        assertTrue("Should equal expected", tree.root.getValue().equals(12));
        assertTrue("Should equal expected", tree.root.getRight().getValue() == 15);
        assertNull("Should equal expected", tree.root.getLeft());
    }

    @Test
    public void testAddOnSingleNodeToLeft() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(12);
        tree.add(1);
        assertTrue("Should equal expected", tree.root.getValue().equals(12));
        assertTrue("Should equal expected", tree.root.getLeft().getValue() == 1);
        assertNull("Should equal expected", tree.root.getRight());
    }

    @Test
    public void testAddMultipleNodesToLeft() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(12);
        tree.add(9);
        tree.add(8);
        tree.add(7);
        assertTrue("Root value should be 12", tree.root.getValue().equals(12));
        assertNull("root right should be null", tree.root.getRight());
        assertTrue("Root left  sh0uld be 9", tree.root.getLeft().getValue().equals(9));
        assertNull("root left's right should be null", tree.root.getLeft().getRight());
        assertTrue("Root left's left  should be 8", tree.root.getLeft().getLeft().getValue().equals(8));
        assertNull("root left's left's right should be null", tree.root.getLeft().getLeft().getRight());
        assertTrue("Root left left left's should be 7", tree.root.getLeft().getLeft().getLeft().getValue() == 7);
        assertNull("Root left left left left should be null", tree.root.getLeft().getLeft().getLeft().getLeft());
        assertNull("root left left left right should be null", tree.root.getLeft().getLeft().getLeft().getRight());
    }

    @Test
    public void testAddMultipleNodesToLeftAdHoc() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(12);
        tree.add(1);
        tree.add(9);
        tree.add(3);
        assertTrue("Root value should be 12", tree.root.getValue().equals(12));
        assertNull("root right should be null", tree.root.getRight());
        assertTrue("Root left  sh0uld be 1", tree.root.getLeft().getValue().equals(1));
        assertNull("Root left left should be null", tree.root.getLeft().getLeft());
        assertTrue("Root left's right should be 9", tree.root.getLeft().getRight().getValue() == 9);
        assertTrue("Root left  right left  should be 3", tree.root.getLeft().getRight().getLeft().getValue().equals(3));
        assertNull("Root left right right should be null", tree.root.getLeft().getRight().getRight());
        assertNull("Root left right left left should be null", tree.root.getLeft().getRight().getLeft().getLeft());
    }

    @Test
    public void testAddMultipleNodesToRight() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(12);
        tree.add(13);
        tree.add(14);
        tree.add(15);
        assertTrue("Root value should be 12", tree.root.getValue().equals(12));
        assertNull("root left should be null", tree.root.getLeft());
        assertTrue("Root right  sh0uld be 13", tree.root.getRight().getValue().equals(13));
        assertNull("root right left  should be null", tree.root.getRight().getLeft());
        assertTrue("Root right right  should be 14", tree.root.getRight().getRight().getValue().equals(14));
        assertNull("Root right right left right should be null", tree.root.getRight().getRight().getLeft());
        assertTrue("Root right right right's should be 15", tree.root.getRight().getRight().getRight().getValue() == 15);
        assertNull("Root right right right right should be null", tree.root.getRight().getRight().getRight().getRight());
        assertNull("Root right right right left should be null", tree.root.getRight().getRight().getRight().getLeft());
    }

    @Test
    public void testAddMultipleNodesToRightAdHoc() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(12);
        tree.add(16);
        tree.add(14);
        tree.add(17);
        assertTrue("Root value should be 12", tree.root.getValue().equals(12));
        assertNull("root left should be null", tree.root.getLeft());
        assertTrue("Root right  sh0uld be 16", tree.root.getRight().getValue().equals(16));
        assertTrue("Root right left  sh0uld be 14", tree.root.getRight().getLeft().getValue().equals(14));
        assertTrue("Root right right  sh0uld be 17", tree.root.getRight().getRight().getValue().equals(17));
        assertNull("root right right right should be null", tree.root.getRight().getRight().getRight());
        assertNull("root right right left should be null", tree.root.getRight().getRight().getLeft());
        assertNull("root right left right should be null", tree.root.getRight().getLeft().getRight());
        assertNull("root right left left should be null", tree.root.getRight().getLeft().getLeft());
    }

    @Test
    public void testAddMultipleNodesToRightAndLeftAdHoc() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(12);
        tree.add(10);
        tree.add(16);
        tree.add(14);
        tree.add(11);
        tree.add(2);
        tree.add(17);
        assertTrue("Root value should be 12", tree.root.getValue().equals(12));
        assertTrue("root left should be 10", tree.root.getLeft().getValue().equals(10));
        assertTrue("root left left should be 2", tree.root.getLeft().getLeft().getValue().equals(2));
        assertTrue("root left right should be 11", tree.root.getLeft().getRight().getValue().equals(11));
        assertNull("root left left right should be null", tree.root.getLeft().getLeft().getRight());
        assertNull("root left left left should be null", tree.root.getLeft().getLeft().getLeft());
        assertNull("root left right left should be null", tree.root.getLeft().getRight().getLeft());
        assertNull("root left right right should be null", tree.root.getLeft().getRight().getRight());
        assertTrue("Root right  sh0uld be 16", tree.root.getRight().getValue().equals(16));
        assertTrue("Root right left  sh0uld be 14", tree.root.getRight().getLeft().getValue().equals(14));
        assertTrue("Root right right  sh0uld be 17", tree.root.getRight().getRight().getValue().equals(17));
        assertNull("root right right right should be null", tree.root.getRight().getRight().getRight());
        assertNull("root right right left should be null", tree.root.getRight().getRight().getLeft());
        assertNull("root right left right should be null", tree.root.getRight().getLeft().getRight());
        assertNull("root right left left should be null", tree.root.getRight().getLeft().getLeft());
    }

    @Test
    public void testContainsEmptyTree() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        assertFalse(tree.contains(12));
    }

    @Test
    public void testContainsValueInTree() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(11);
        tree.add(15);
        tree.add(2);
        tree.add(12);
        tree.add(13);
        assertTrue(tree.contains(12));
    }

    @Test
    public void testContainsValueNotInTree() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        assertFalse(tree.contains(12));
    }

}
