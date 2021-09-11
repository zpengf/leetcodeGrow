package codeMain;

import java.text.DecimalFormat;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 *
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * 示例 3：
 *
 * 输入：nums1 = [0,0], nums2 = [0,0]
 * 输出：0.00000
 * 示例 4：
 *
 * 输入：nums1 = [], nums2 = [1]
 * 输出：1.00000
 * 示例 5：
 *
 * 输入：nums1 = [2], nums2 = []
 * 输出：2.00000
 */
public class MidArrayNum {

    public  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sumArray = new int[nums1.length+nums2.length];

        int i = 0,j = 0,k = 0;

        //两个数组合并
        while (i < nums1.length && j < nums2.length){
            if(nums1[i]>=nums2[j]){
                sumArray[k++] = nums2[j++];
            } else {
                sumArray[k++] = nums1[i++];
            }
        }

        while (j < nums2.length){
            sumArray[k++] = nums2[j++];
        }

        while (i < nums1.length){
            sumArray[k++] = nums1[i++];
        }

        int index = 0;
        int index1 = 0;

        if(sumArray.length % 2 == 0){
            index = sumArray.length/2;
            index1 = index - 1;
            return (double)(sumArray[index] + sumArray[index1]) / 2;
        }else {
            index = sumArray.length/2;
            return sumArray[index];
        }
    }
}
