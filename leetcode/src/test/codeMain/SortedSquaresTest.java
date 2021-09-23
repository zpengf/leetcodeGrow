package test.codeMain; 

import codeMain.SortedSquares;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* SortedSquares Tester. 
* 
* @author <Authors name> 
* @since <pre>09/23/2021</pre> 
* @version 1.0 
*/ 
public class SortedSquaresTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sortedSquares(int[] nums) 
* 
*/ 
@Test
public void testSortedSquares() throws Exception {

    SortedSquares sortedSquares = new SortedSquares();


    int[] nums = {-7,-3,2,3,11};

    int[] result = sortedSquares.sortedSquares(nums);
    System.out.println(result);


} 


} 
