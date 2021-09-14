package test.codeMain; 

import codeMain.SumTargetArray;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* SumTargetArray Tester. 
* 
* @author <Authors name> 
* @since <pre>09/14/2021</pre> 
* @version 1.0 
*/ 
public class SumTargetArrayTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: threeSumClosest(int[] nums, int target) 
* 
*/ 
@Test
public void testThreeSumClosest() throws Exception {
    SumTargetArray sumTargetArray = new SumTargetArray();
    int[] nums = {0,0,0};
    int target = 1;
    
    System.out.println(sumTargetArray.threeSumClosest1(nums,target));
} 


} 
