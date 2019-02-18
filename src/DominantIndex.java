import java.util.Arrays;

public class DominantIndex {
    /**
     * https://leetcode-cn.com/explore/learn/card/array-and-string/198/introduction-to-array/771/
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     * 如果是，则返回最大元素的索引，否则返回-1。
     *
     * @param nums
     * @return
     */
    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        if (nums.length == 1 || max >= second * 2) {
            return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0};
        System.out.println(dominantIndex(nums));
    }
}
