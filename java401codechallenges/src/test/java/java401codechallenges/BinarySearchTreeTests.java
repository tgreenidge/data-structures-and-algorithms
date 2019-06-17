package java401codechallenges;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class BinarySearchTreeTests {
    @Test
    public void testAddOnEmptyList() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(12);
        assertTrue("Should equal expected", tree.root.getValue() == 12);
    }

    @Test
    public void testAddOnSingleNodeList() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(12);
        tree.add(15);
        assertTrue("Should equal expected", tree.root.getValue() == 12);
        assertTrue("Should equal expected", tree.root.getRight().getValue() == 15);
        assertNull("Should equal expected", tree.root.getLeft());

    }

}
