package codeMain;

/**
 * @ClassName: TotalFruit
 * @Author: pengfeizhang
 * @Description: 求只包含两种元素的最长连续子序列
 * @Date: 2021/10/8 下午9:53
 * @Version: 1.0
 */
public class TotalFruit {
    public int totalFruit(int[] fruits) {

        int result = 0;
        int left = 0;
        int num1;
        int num2;

        for(int right = 1;right < fruits.length;right++){
            num1 = fruits[left];
            if(num1 == fruits[right]){
                result = right - left +1;

            }
            if(num1 != fruits[right]){
                num2 = fruits[right];


            }


        }




        return result;

    }
}
