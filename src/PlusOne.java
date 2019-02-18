import java.util.Arrays;
import java.util.List;

public class PlusOne {
    /**
     * https://leetcode-cn.com/explore/learn/card/array-and-string/198/introduction-to-array/772/
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
//        String s = "";
//        for (int i : digits) {
//            s += i;
//        }
//        String sum = "" + (Integer.valueOf(s) + 1);
//        char[] charArray = sum.toCharArray();
//        int[] result = new int[charArray.length];
//        for (int i = 0; i < charArray.length; i++) {
//            result[i] = Integer.parseInt(String.valueOf(charArray[i]));
//        }
//        return result;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
