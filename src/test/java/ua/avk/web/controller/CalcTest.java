package ua.avk.web.controller;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ua.avk.web.domain.MyData;

import static org.junit.Assert.*;

public class CalcTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHandleAnyException() throws Exception {

    }

    @Test
    public void testGetData() throws Exception {
        MyData myData = new MyData(2,1);
        Calc calc = new Calc();
        Assert.assertEquals(calc.getData(2,1), myData);
        Assert.assertFalse(myData.equals(calc.getData(3,1)));
    }

}