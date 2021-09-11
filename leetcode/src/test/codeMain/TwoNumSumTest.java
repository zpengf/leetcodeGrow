package codeMain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
* TwoNumSum Tester. 
* 
* @author <Authors name> 
* @since <pre>09/11/2021</pre> 
* @version 1.0 
*/ 
public class TwoNumSumTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String args[]) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: twoSum(int[] nums, int target) 
* 
*/ 
@Test
public void testTwoSum() throws Exception {
    TwoNumSum test = new TwoNumSum();

    int[] nums ={3,3};
    int target = 6;
    int[] result = test.twoSum(nums,target);
    for(int a : result){
        System.out.print(a+",");
    }


//TODO: Test goes here... 
} 


} 
