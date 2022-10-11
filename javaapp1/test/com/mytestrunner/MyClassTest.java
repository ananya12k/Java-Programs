package com.mytestrunner;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testadd() {
    MyClass tester=new MyClass();
    assertEquals("10+2 must be 12",12,tester.add(10,2));
    }
}