import java.util.Arrays;

public class PivotIndex {
    /**
     * https://leetcode-cn.com/explore/learn/card/array-and-string/198/introduction-to-array/770/
     * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
     * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
     * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
     * @param nums
     * @return
     */
    public static int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int sum = Arrays.stream(Arrays.copyOfRange(nums, 0, nums.length)).reduce((a, b) -> a + b).getAsInt();
        if ((sum - nums[0]) == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (Arrays.stream(Arrays.copyOfRange(nums, 0, i)).reduce((a, b) -> a + b).getAsInt() == (sum - nums[i]) / 2.0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
