import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     * 示例:
     * 输入: 5
     * 输出:
     * [
     * [1],
     * [1,1],
     * [1,2,1],
     * [1,3,3,1],
     * [1,4,6,4,1]
     * ]
     */
    /*public static void *//*List<List<Integer>>*//* generate(int numRows) {
        //int=1
        List<Integer> rows1 = new ArrayList<>(1);
        rows1.add(1);
        System.out.println(rows1);

        //int = 2;
        List<Integer> rows2 = new ArrayList<>(2);
        rows2.add(1);
        rows2.add(1);
        System.out.println(rows2);

        //int = 3;[1,2,1]
        List<Integer> rows3 = new ArrayList<>(3);
        rows3.add(1);
        rows3.add(rows2.get(0) + rows2.get(2 - 1));
        rows3.add(1);
        System.out.println(rows3);

        //int = 4;[1,3,3,1]
        List<Integer> rows4 = new ArrayList<>(4);
        rows4.add(1);
        rows4.add(rows3.get(0) + rows3.get(1));
        rows4.add(rows3.get(1) + rows3.get(2));
        rows4.add(1);
        System.out.println(rows4);

        //int = 5;[1,4,6,4,1]
        List<Integer> rows5 = new ArrayList<>(5);
        rows5.add(1);
        rows5.add(rows4.get(0) + rows4.get(1));
        rows5.add(rows4.get(1) + rows4.get(2));
        rows5.add(rows4.get(2) + rows4.get(3));
        rows5.add(1);
        System.out.println(rows5);
    }*/

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++ ){
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = triangle.get(rowNum-1);

            row.add(1);

            for (int i = 1; i < rowNum; i++) {
                row.add(preRow.get(i-1)+preRow.get(i));
            }

            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }

    @Test
    public void test() {
        //generate(5);
        System.out.println(generate(3));
    }
}
