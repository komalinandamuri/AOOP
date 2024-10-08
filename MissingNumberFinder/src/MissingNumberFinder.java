public class MissingNumberFinder {
    public static int findMissingNumber(int[] array) {
        int expectedSum = (array[0] + array[array.length - 1]) * (array.length + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}