package test.codeMain; 

import codeMain.DeleteRepeatNum;
import codeMain.NextPermutation;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* NextPermutation Tester. 
* 
* @author <Authors name> 
* @since <pre>09/18/2021</pre> 
* @version 1.0 
*/ 
public class NextPermutationTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: nextPermutation(int[] nums) 
* 
*/ 
@Test
public void testNextPermutation() throws Exception { 
//TODO: Test goes here...
    int[] nums = {1,3,2};

    NextPermutation nextPermutation = new NextPermutation();

   nextPermutation.nextPermutation(nums);

    System.out.println(0);
} 


} 
