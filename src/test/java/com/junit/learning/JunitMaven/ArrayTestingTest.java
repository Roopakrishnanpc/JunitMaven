package com.junit.learning.JunitMaven;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayTestingTest {

	@Test
	void testArrays() {
		//fail("Not yet implemented");
		int[] expected= {2,4,6,8};
		int[] actual= {4,8,6,2}; // both has same no of elements 4 and 4, same elemts with different order
		Arrays.sort(actual); //with this order of elements also became same, already no of elements same and also same elements/values
		assertArrayEquals(expected, actual);
	}
	@Test
	void testArraysException() {
		try
		{
		ArrayTesting test=new ArrayTesting();
		int unsorted[]={18,99,3,6};
		int[] sortedarray=test.sortingArray(unsorted);
		//this logic mentioned in our class itself
//		for(int i=0; i<sortedarray.length;i++)
//		{
//			System.out.println(sortedarray[i]);
//		}
			System.out.println("done");
//		int unsortednull[]=null;
//		int[] sortedarray_null=test.sortingArray(unsortednull);
//		for(int i=0; i<sortedarray_null.length;i++)
//		{
//			System.out.println(sortedarray_null[i]);
//		}
			//uncomment fail to so even if logic correct will fail as our motive is to check the exception created or not, not logic
		//fail("failed"); //-> Through this even if our test case logic is correct but exception not created so above catch giving as fail
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			System.out.println("exception created");
		}
	}
	@Test
	void testArraysExceptionthroughAssert() {
	
			ArrayTesting test=new ArrayTesting();
			int unsorted[]={18,99,3,6};
			//it will fail because exception not created onlu if we pass null it will pass test case
			//assertThrows(NullPointerException.class, ()-> test.sortingArray(unsorted));
			int unsortednull[]=null;
			//pass here as pass null
			assertThrows(NullPointerException.class, ()-> test.sortingArray(unsortednull));
		
	}
	@Test
	//in junit 5 this is not there in previous versions Junit 4 it was available -> @Test(timeout=10)
	void testArraysExceptionthroughtimeout() {
	
			ArrayTesting test=new ArrayTesting();
			int unsorted[]={18,99,3,6};
			assertTimeout(Duration.ofMillis(10), ()-> test.sortingArray(unsorted));
	}

}
