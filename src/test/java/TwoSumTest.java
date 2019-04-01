import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    @org.junit.jupiter.api.Test
    void twoSum() {
        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 18));
    }
}