package edu.upc.dsa.Ejemplo1;

/**
 * Created by Jordi on 01/10/2015.
 */

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppConstructorsTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppConstructorsTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppConstructorsTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
