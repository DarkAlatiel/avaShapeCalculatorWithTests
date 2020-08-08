package model.triangle;

import model.ShapeBaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest extends ShapeBaseTest {

    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(3, 4, 5);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Треугольник", triangle.getName());
    }

    @Test
    public void testGetPerimeter() {
        Assert.assertEquals(12, triangle.getPerimeter(), 0);
    }

    @Test
    public void testGetSquare() {
        Assert.assertEquals(6, triangle.getSquare(), 0);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Треугольник\nПервая сторона: 3.0\n" +
                "Вторая сторона: 4.0\nТретья сторона: 5.0", triangle.toString());
    }

    @Test
    public void testEquals() {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Assert.assertEquals(triangle, triangle1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor(){
        new Triangle(1, 2, 3);
    }
}