package com.yubico.base.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.yubico.base.Modhex;

public class ModhexTest extends TestCase
{
    public static void main(String[] args) throws Exception
    {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() throws Exception
    {
        return new TestSuite(ModhexTest.class);
    }

    public void testScenario1() throws Exception
    {
	String s = Modhex.encode("test".getBytes());
	assertEquals(s, "ifhgieif");
	byte[] b = Modhex.decode(s);
	assertEquals(new String(b), "test");
    }
}