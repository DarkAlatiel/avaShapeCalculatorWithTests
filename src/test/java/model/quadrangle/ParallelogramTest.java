package model.quadrangle;

import model.ShapeBaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParallelogramTest extends ShapeBaseTest {

    Parallelogram parallelogram;

    @Before
    public void setUp() throws Exception {
        parallelogram = new Parallelogram(5, 4, 3);
    }

    @Test
    public void testGetPerimeter() {
        Assert.assertEquals(18, parallelogram.getPerimeter(), 0);
    }

    @Test
    public void testGetSquare() {
        Assert.assertEquals(15, parallelogram.getSquare(), 0);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Параллелограмм\nПервая сторона: 5.0\n" +
                "Вторая сторона: 4.0\nВысота: 3.0", parallelogram.toString());
    }

    @Test
    public void testEquals() {
        Parallelogram parallelogram1 = new Parallelogram(5, 4, 3);
        Assert.assertEquals(parallelogram, parallelogram1);
    }

    @Test
    public void testHashCode() {
        Parallelogram parallelogram1 = new Parallelogram(5, 4, 3);
        Assert.assertEquals(parallelogram.hashCode(), parallelogram1.hashCode());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Параллелограмм", parallelogram.getName());
    }
}