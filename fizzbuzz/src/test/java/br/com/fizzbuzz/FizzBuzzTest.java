package br.com.fizzbuzz;


import br.com.fizzbuzz.FizzBuzz;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class FizzBuzzTest 
    extends TestCase
{

    public FizzBuzzTest( String testName )
    {
        super( testName ); 
    }


    public static Test suite()
    {
        return new TestSuite( FizzBuzzTest.class );
    }


    public void testNumber()
    {
    	int expectedNumber = 2;
    	assertEquals("2", new FizzBuzz().doFizzBuzz(expectedNumber));
    }
    
    public void testNumberNegative()
    {
    	int expectedNumber = -2;
    	assertEquals("-2", new FizzBuzz().doFizzBuzz(expectedNumber));
    }
    
    public void testFizz()
    {
    	int expectedNumber = 6;
    	assertEquals("Fizz", new FizzBuzz().doFizzBuzz(expectedNumber));
    }
    
    public void testBuzz()
    {
    	int expectedNumber = 10;
    	assertEquals("Buzz", new FizzBuzz().doFizzBuzz(expectedNumber));
    }
    
    public void testFizzBuzz()
    {
    	int expectedNumber = 15;
    	assertEquals("FizzBuzz", new FizzBuzz().doFizzBuzz(expectedNumber));
    }
}
