package codeMain;

import codeMain.MinSubArrayLen;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MinSubArrayLen Tester. 
* 
* @author <Authors name> 
* @since <pre>09/25/2021</pre> 
* @version 1.0 
*/ 
public class MinSubArrayLenTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: minSubArrayLen(int target, int[] nums) 
* 
*/ 
@Test
public void testMinSubArrayLen() throws Exception {

    MinSubArrayLen minSubArrayLen = new MinSubArrayLen();

    //1 2 2 3 3 4
    int[] nums = {1,2,3,4,5};
    int target = 11;

    //2 4 12 12 25 25 25 25 26 28 83
//    int[] nums1 = {12,28,83,4,25,26,25,2,25,25,25,12};
//    int target1 = 213;
//
//    int re1 = minSubArrayLen.minSubArrayLen(target1,nums1);


    int re = minSubArrayLen.minSubArrayLen(target,nums);
    
    System.out.println(re);
}


} 
