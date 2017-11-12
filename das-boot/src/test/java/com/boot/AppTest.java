package com.boot;


import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.boot.controller.HomeController;
import com.boot.model.Shipwreck;

import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
	
	@InjectMocks
	HomeController controller = new HomeController();
	
	@Mock
	Shipwreck reck;
	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
}
