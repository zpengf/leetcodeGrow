package codeMain;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumFourNumTest {

    @Test
    public void fourSum() {

        SumFourNum sumFourNum = new SumFourNum();
        int[] nums = {1,-2,-5,-4,-3,3,3,5};
        int target = -11;
        System.out.println(sumFourNum.fourSum(nums,target));

    }
}