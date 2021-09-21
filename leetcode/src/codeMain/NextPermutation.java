package codeMain;


import java.util.Arrays;

/**
 *
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 题干的意思是：找出这个数组排序出的所有数中，刚好比当前数大的那个数
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {

        if (nums.length == 1) {
            return;
        }
        int j = nums.length - 1;
        while (j >= 1) { // 从后往前找到后面的比前面大的，再往前面一位就是待交换位
            if (nums[j] > nums[j - 1]) {
                break;
            }
            j--;
        }
        if (j == 0) { // 特殊情况，已经是最大排列
            Arrays.sort(nums);
            return;
        }
        int k = nums.length - 1;
        while (k > j - 1) { // 从后往前找到第一个比待交换位大的
            if (nums[k] > nums[j - 1]) {
                break;
            }
            k--;
        }

        int temp = nums[j - 1]; // 交换
        nums[j - 1] = nums[k];
        nums[k] = temp;

        Arrays.sort(nums, j, nums.length); // 排序剩下的
    }

}
