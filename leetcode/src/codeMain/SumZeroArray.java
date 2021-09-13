package codeMain;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumZeroArray {

    /**
     * 暴力破解法
     * @param nums
     * @return
     */

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                for(int a = j+1;a < nums.length;a++){
                    if(nums[i] + nums[j] + nums[a] == 0){
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[a]);
                        Collections.sort(res);
                        result.add(res);
                    }
                }
            }
        }
        result = result.stream().distinct().collect(Collectors.toList());
        return result;
    }

    /**
     * 随便 找个值
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3) return result;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length;i++){
            if (nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if( sum == 0){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[left]);
                    res.add(nums[right]);
                    result.add(res);
                    while (nums[right] == nums[right - 1] && right > left){
                        right--;
                    }
                    while (nums[left] == nums[left + 1] && left < right){
                        left++;
                    }
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right--;
                }
            }
        }
        return result;
    }
    public <T extends Comparable<T>> boolean isEquals(List<T> list1, List<T> list2){
        if (list1 == null && list2 == null) {
            return true;
        }
        //Only one of them is null
        else if(list1 == null || list2 == null) {
            return false;
        }
        else if(list1.size() != list2.size()) {
            return false;
        }

        //copying to avoid rearranging original lists
        list1 = new ArrayList<T>(list1);
        list2 = new ArrayList<T>(list2);

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
