package codeMain;

public class TwoNumSum {
    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，
     * 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。
     * 但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     *
     *  示例 1：
     *
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * 示例 2：
     *
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     * 示例 3：
     *
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     *
     * @param args
     */
    public static void main (String args[]){
        int[] nums ={3,3};
        int target = 6;
        int[] result = twoSum(nums,target);
        for(int a : result){
            System.out.print(a+",");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int result[]  = new int[2];

        if (nums == null){
            return result;
        }

        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }


        // 建立k-v ，一一对应的哈希表
//        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
//        for(int i = 0; i < nums.length; i++){
//            if(hash.containsKey(nums[i])){
//                indexs[0] = i;
//                indexs[1] = hash.get(nums[i]);
//                return indexs;
//            }
//            // 将数据存入 key为补数 ，value为下标
//            hash.put(target-nums[i],i);
//        }



        return result;
    }

}
