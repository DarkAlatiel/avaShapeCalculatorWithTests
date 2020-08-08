package model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void isValidSideValue() {
        Assert.assertTrue(Validator.isValidSideValue(1));
        Assert.assertTrue(Validator.isValidSideValue(1.2));
        Assert.assertTrue(Validator.isValidSideValue(Double.MAX_VALUE));
        Assert.assertTrue(Validator.isValidSideValue(Double.MIN_VALUE));
        Assert.assertFalse(Validator.isValidSideValue(0));
        Assert.assertFalse(Validator.isValidSideValue(-1));
        Assert.assertFalse(Validator.isValidSideValue(-1.2));
    }

    @Test
    public void isNotValidSideValues() {
        Assert.assertTrue(Validator.isNotValidSideValues(1,1,1));
        Assert.assertFalse(Validator.isNotValidSideValues(1,2,3));
        Assert.assertFalse(Validator.isNotValidSideValues(1,2,4));
    }
}