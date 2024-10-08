import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MissingNumberFinderTest {
    @Test
    public void testFindMissingNumber() {
        int[] array = {1, 2, 4, 5};
        int missingNumber = MissingNumberFinder.findMissingNumber(array);
        assertEquals(3, missingNumber);
    }

    @Test
    public void testFindMissingNumber2() {
        int[] array = {3, 5, 6, 7};
        int missingNumber = MissingNumberFinder.findMissingNumber(array);
        assertEquals(4, missingNumber);
    }

    @Test
    public void testCompleteArray() {
        int[] array = {1, 2, 3, 4, 5};
        int missingNumber = MissingNumberFinder.findMissingNumber(array);
        assertEquals(0, missingNumber); // no missing number
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int missingNumber = MissingNumberFinder.findMissingNumber(array);
        assertEquals(0, missingNumber); // no missing number
    }

    @Test
    public void testSingleElementArray() {
        int[] array = {1};
        int missingNumber = MissingNumberFinder.findMissingNumber(array);
        assertEquals(0, missingNumber); // no missing number
    }
}