package com.log4jdemo.log4jdemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.Test
 */
public class log4jexample 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public log4jexample( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( log4jexample.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
