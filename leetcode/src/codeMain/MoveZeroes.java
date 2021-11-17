package codeMain;

/**
 * @ClassName: MoveZeroes
 * @Author: pengfeizhang
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @Date: 2021/11/16 下午6:32
 * @Version: 1.0
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int index = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index;i < nums.length;i++) {

            nums[i] = 0;

        }

    }

    public static void main(String[] args) {
        int[] arr = {0,0,1};
        moveZeroes(arr);

        for(int a : arr){
            System.out.println(a);

        }
    }
}
