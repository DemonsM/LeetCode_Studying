import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void plusOne() {
        int[] arr = {9,9};
        Solution solution = new Solution();
        int[] plusOne = solution.plusOne2(arr);
        System.out.println(Arrays.toString(plusOne));
    }
}