package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ruslana on 03.09.16.
 */
public class PointTests {

    @Test
    public void testDistanceCalculation() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Assert.assertEquals(p1.distance(p2), 5.0);
    }



    }

