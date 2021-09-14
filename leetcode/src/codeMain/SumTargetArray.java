package codeMain;

import java.util.*;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumTargetArray {

    /**
     * 暴力破解
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        Map<Integer,int[]> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            int left = i + 1;
            int right = left + 1;
            while (right < nums.length && left < nums.length){
                int sum = nums[i] + nums[left] + nums[right];
                int[] arr = new int[3];
                arr[0] = nums[i];
                arr[1] = nums[left];
                arr[2] = nums[right];
                int value = Math.abs(sum - target);
                map.put(value,arr);
                right++;
                if(right == nums.length){
                    left++;
                    right = left + 1;
                }
            }

        }
        Set<Integer> set = map.keySet();
        Object[] obj = set.toArray();
        Arrays.sort(obj);
        int[] resuNums = map.get(obj[0]);
        return resuNums[0] + resuNums[1] + resuNums[2];
    }

    /**
     * 先排序 然后与target相比
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest1(int[] nums, int target) {
        Map<Integer,int[]> map = new HashMap<>();
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0;i < nums.length - 2;i++){
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result = sum;
                }
                if(sum > target){
                    right--;
                }else if(sum < target){
                    left++;
                }else if(sum == target){
                    return sum;
                }
            }

        }
        return result;
    }

}
