import java.util.Arrays;

public class SolutionTest {

    @org.junit.Test
    public void moveZeroes() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 3, 12};
        solution.moveZeroesQuickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}