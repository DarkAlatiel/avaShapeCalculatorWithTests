package model.quadrangle;

import model.ShapeBaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrangleTest extends ShapeBaseTest {

    Quadrangle quadrangle;

    @Before
    public void setUp() throws Exception {
        quadrangle = new Quadrangle(3, 4, 5, 6);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Четырёхугольник", quadrangle.getName());
    }

    @Test
    public void testGetPerimeter() {
        Assert.assertEquals(18, quadrangle.getPerimeter(), 0);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Четырёхугольник\nПервая сторона: 3.0\n" +
                        "Вторая сторона: 4.0\nТретья сторона: 5.0\nЧетвёртая сторона: 6.0",
                quadrangle.toString());
    }

    @Test
    public void testEquals() {
        Quadrangle quadrangle1 = new Quadrangle(3, 4, 5, 6);
        Assert.assertEquals(quadrangle, quadrangle1);
    }

}