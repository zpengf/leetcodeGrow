package codeMain;

import codeMain.SumZeroArray;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* SumZeroArray Tester. 
* 
* @author <Authors name> 
* @since <pre>09/13/2021</pre> 
* @version 1.0 
*/ 
public class SumZeroArrayTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: threeSum(int[] nums) 
* 
*/ 
@Test
public void testThreeSum() throws Exception { 
//TODO: Test goes here...
    SumZeroArray sumZeroArray = new SumZeroArray();
    int[] nums = {-1,0,1,2,-1,-4};
    List<List<Integer>> result = sumZeroArray.threeSum1(nums);
    System.out.println(result);
} 


} 
