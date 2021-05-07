import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        Solution solution = new Solution();
        int reverse = solution.reverse(123);
        System.out.println(reverse);
    }
}