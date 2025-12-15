package com.testng.Demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemo {

    @BeforeClass
    public void setUp() {
        System.out.println("Setup before tests");
    }

    @Test
    public void firstCase() {
        System.out.println("This is first case");
    }

    @Test
    public void firstCase1() {
        System.out.println("This is second case");
    }

    @Test
    public void firstCase2() {
        System.out.println("This is third case");
    }

    @Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("Slow test");
    }
}
