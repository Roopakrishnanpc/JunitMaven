package com.junit.learning.JunitMaven;

import java.util.Arrays;

public class ArrayTesting {
public int[] sortingArray(int[] array)
{
	//Arrays.sort(array);
	//for(int i=0; i<array.length;i++){
	//System.out.println(array[i]);}
	for(int i=0; i<100000;i++)
	{
		Arrays.sort(array);	
	}
	return array;
}
}
