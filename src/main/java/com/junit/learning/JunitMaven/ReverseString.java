package com.junit.learning.JunitMaven;
public class ReverseString {

	public static String reverseString(String name)
	{
		char[] characterArray=name.toCharArray();
		//"hellow world"
		int left=0;
		int right=name.length()-1;
		while(left<right) 
		{
		char temp = characterArray[left];
		characterArray[left]=characterArray[right];
		//System.out.println(characterArray[left]);
		characterArray[right]=temp;
		//System.out.println(characterArray[right]);
		left++;
		right--;
		}
		//System.out.println(characterArray[left]);
		//System.out.println(characterArray[right]);
		return new String(characterArray);
	}
//	public static void main(String[] args) {
//		reverseString("hello rooopa");
//		System.out.println(reverseString("hello roopa"));
//	}
}
