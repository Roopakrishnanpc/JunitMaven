package com.junit.learning.JunitMaven;

/**
 * Hello world!
 *
 */
public class App 
{//LaunchCalc
	//basic testing
    public static void main( String[] args )
    {
    			// TODO Auto-generated method stub
    			Calc c=new Calc();
    			System.out.println(c.divide(10, 7));
    			System.out.println(c.multiple(10, 0));
    			if(c.divide(10, 5)==2)
    			{
    				System.out.println("Test case passed");
    			}
    			else
    			{
    				System.out.println("Test case Failed");
    			}
    }

    	
    
}
