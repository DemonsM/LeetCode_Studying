import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxSubArray() {
        Solution solution = new Solution();
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum = solution.maxSubArray(arr);
        System.out.println(sum);
    }
}