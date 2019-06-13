package java401codechallenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultibracketValidatinTest {
    @Test
    public void testMatchingCurlyBrackets() {
        MultibracketValidation multibracketValidation = new MultibracketValidation();
        assertTrue(multibracketValidation.multiBracketValidation("{}"));
    }

    @Test
    public void testMatchingCurlyBracketsMultiple() {
        MultibracketValidation multibracketValidation = new MultibracketValidation();
        assertTrue(multibracketValidation.multiBracketValidation("{}(){}"));
    }

    @Test
    public void testMismatchedBrackets() {
        MultibracketValidation multibracketValidation = new MultibracketValidation();
        assertFalse(multibracketValidation.multiBracketValidation("{]"));
    }

    @Test
    public void testMatchingNestedBracketsMultiple() {
        MultibracketValidation multibracketValidation = new MultibracketValidation();
        assertTrue(multibracketValidation.multiBracketValidation("(){}[[]]"));
    }

    @Test
    public void testMatchingNestedBracketsWithOtherChars() {
        MultibracketValidation multibracketValidation = new MultibracketValidation();
        assertTrue(multibracketValidation.multiBracketValidation("()[[Extra Characters]]"));
    }

    @Test
    public void testSingleChar() {
        MultibracketValidation multibracketValidation = new MultibracketValidation();
        assertFalse(multibracketValidation.multiBracketValidation("]"));
    }

    @Test
    public void testMismatchedBrackets2() {
        MultibracketValidation multibracketValidation = new MultibracketValidation();
        assertFalse(multibracketValidation.multiBracketValidation("{(})"));
    }

}
