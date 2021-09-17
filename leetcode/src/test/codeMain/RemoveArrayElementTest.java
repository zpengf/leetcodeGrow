package codeMain;

import codeMain.DeleteRepeatNum;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* RemoveArrayElement Tester. 
* 
* @author <Authors name> 
* @since <pre>09/17/2021</pre> 
* @version 1.0 
*/ 
public class RemoveArrayElementTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: removeElement(int[] nums, int val) 
* 
*/ 
@Test
public void testRemoveElement() throws Exception {
    int[] nums = {3,2,2,3};
    int val = 3;

    RemoveArrayElement removeArrayElement = new RemoveArrayElement();

    int res = removeArrayElement.removeElement(nums,val);

    System.out.println(res);

} 


} 
