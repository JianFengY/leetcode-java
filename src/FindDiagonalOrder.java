import java.util.Arrays;

public class FindDiagonalOrder {

    /**
     * https://leetcode-cn.com/explore/learn/card/array-and-string/199/introduction-to-2d-array/774/
     * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
     * 输入:
     * [
     * [ 1, 2, 3 ],
     * [ 4, 5, 6 ],
     * [ 7, 8, 9 ]
     * ]
     * 输出:  [1,2,4,7,5,3,6,8,9]
     *
     * @param matrix
     * @return
     */
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }
        int count = matrix.length * matrix[0].length;
        int[] result = new int[count];
        int a = 0, b = 0;
        for (int i = 0; i < count; i++) {
            result[i] = matrix[a][b];
            if ((a + b) % 2 == 0) {
                if (b < matrix[0].length - 1) {
                    a = a == 0 ? a : a - 1;
                    b += 1;
                } else {
                    a += 1;
                }
            } else {
                if (a < matrix.length - 1) {
                    a += 1;
                    b = b == 0 ? b : b - 1;
                } else {
                    b += 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] nums = {};
        System.out.println(Arrays.toString(findDiagonalOrder(nums)));
    }
}
