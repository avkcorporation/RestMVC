package ua.avk.web.domain;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDataTest {

    @Test
    public void testEquals(){
        MyData myData1 = new MyData(2,1);
        MyData myData2 = new MyData(2,1);
        MyData myData3 = new MyData(3,1);

        Assert.assertTrue(myData1.equals(myData2));
        Assert.assertTrue(myData2.equals(myData1));
        Assert.assertFalse(myData1.equals(myData3));
        Assert.assertFalse(myData3.equals(myData2));

    }
}