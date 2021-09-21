package codeMain;

import codeMain.SearchArray;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* SearchArray Tester. 
* 
* @author <Authors name> 
* @since <pre>09/21/2021</pre> 
* @version 1.0 
*/ 
public class SearchArrayTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: search(int[] nums, int target) 
* 
*/ 
@Test
public void testSearch() throws Exception {
    SearchArray searchArray = new SearchArray();

    int[] nums = {-1,0,3,5,9,12};

    int result = searchArray.search(nums,2);
    System.out.println(result);
} 


} 
