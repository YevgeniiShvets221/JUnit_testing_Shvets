package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test

    public void getPerimeter(){
        com.company.Triangle triangle = new Triangle(3,4,5);
        Assert.assertEquals( 12,triangle.getPerimeter());
    }
    @Test
       public void getMedian() {

       }
    @Test
       public void getSemiPer(){
        com.company.Triangle triangle = new Triangle(4,5,3);
        Assert.assertEquals( 6,triangle.getSemiPer());
    }
    @Test
        public void getArea() {

    }
    @Test
    public void getHeight () {

    }

}
