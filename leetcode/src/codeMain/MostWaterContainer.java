package codeMain;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MostWaterContainer {


    /**
     * 暴力破解 不可行
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        int result = 0;

        for (int i = 0;i < height.length;i++){

            for(int j = i + 1;j < height.length;j++){
                int water = 0;

                if(height[i] >= height[j]){

                    water = height[j] * (j - i);

                } else {

                    water = height[i] * (j - i);
                }
                if(result < water){
                    result = water;
                }
            }
        }

        return result;
    }

    /**
     *
     * @param height
     * @return
     */
    public int maxArea1(int[] height) {

        int result = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right){
            int water = 0;
            if(height[left] >= height[right]){

                water = height[right] * (right - left);
                right--;

            } else {

                water = height[left] * (right - left);
                left++;

            }
            if(result < water){
                result = water;
            }

        }

        return result;
    }

}
