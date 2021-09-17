package codeMain;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayElement {
    public int removeElement(int[] nums, int val) {
        if(nums==null){
            return 0;
        }
        List<Integer> list = new ArrayList();
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){
                list.add(nums[i]);
            }
        }
        for(int i = 0;i < list.size();i++){
            nums[i] = list.get(i);
        }

        return list.size();
    }



    public int removeElement1(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
