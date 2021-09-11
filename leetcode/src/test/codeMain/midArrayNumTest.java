package codeMain;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* midArrayNum Tester. 
* 
* @author <Authors name> 
* @since <pre>09/11/2021</pre> 
* @version 1.0 
*/ 
public class midArrayNumTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findMedianSortedArrays(int[] nums1, int[] nums2) 
* 
*/ 
@Test
public void testFindMedianSortedArrays() throws Exception { 
//TODO: Test goes here...

    int[] nums1 = {};
    int[] nums2 = {1};
    MidArrayNum test = new MidArrayNum();
    double result = test.findMedianSortedArrays(nums1,nums2);
    System.out.println(result);


} 


} 
