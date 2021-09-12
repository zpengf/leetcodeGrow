package codeMain;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.WeakHashMap;

/** 
* MostWaterContainer Tester. 
* 
* @author <Authors name> 
* @since <pre>09/12/2021</pre> 
* @version 1.0 
*/ 
public class MostWaterContainerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: maxArea(int[] height) 
* 
*/ 
@Test
public void testMaxArea() throws Exception { 
    MostWaterContainer waterContainer = new MostWaterContainer();

    int[] arr = {1,8,6,2,5,4,8,3,7};
    int re = waterContainer.maxArea1(arr);

    System.out.println(re);

} 


} 
