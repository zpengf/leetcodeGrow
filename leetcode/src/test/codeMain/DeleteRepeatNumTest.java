package codeMain;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* DeleteRepeatNum Tester. 
* 
* @author <Authors name> 
* @since <pre>09/16/2021</pre> 
* @version 1.0 
*/ 
public class DeleteRepeatNumTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: removeDuplicates(int[] nums) 
* 
*/ 
@Test
public void testRemoveDuplicates() throws Exception { 
//TODO: Test goes here...

    int[] nums = {1,1,1,1,2,2,2};
    
    DeleteRepeatNum deleteRepeatNum = new DeleteRepeatNum();

    int res = deleteRepeatNum.removeDuplicates(nums);
    
    System.out.println(res);
    
} 


} 
