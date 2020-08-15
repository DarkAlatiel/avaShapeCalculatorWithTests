package model.quadrangle;

import model.IPerimeter;
import model.ShapeBase;
import model.Validator;

public class Quadrangle extends ShapeBase implements IPerimeter {

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;
    protected double fourthSide;

    protected Quadrangle(String name) {
        super(name);
    }

    public Quadrangle(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super("Четырёхугольник");
        if (Validator.isValidSideValue(firstSide)) {
            this.firstSide = firstSide;
        } else {
            throw new IllegalArgumentException("Неверное значение первой стороны!");
        }
        if (Validator.isValidSideValue(secondSide)) {
            this.secondSide = secondSide;
        } else {
            throw new IllegalArgumentException("Неверное значение второй стороны!");
        }
        if (Validator.isValidSideValue(thirdSide)) {
            this.thirdSide = thirdSide;
        } else {
            throw new IllegalArgumentException("Неверное значение третьей стороны!");
        }
        if (Validator.isValidSideValue(fourthSide)) {
            this.fourthSide = fourthSide;
        } else {
            throw new IllegalArgumentException("Неверное значение четвёртой стороны!");
        }
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide + fourthSide;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(getName());
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nТретья сторона: ").append(thirdSide);
        builder.append("\nЧетвёртая сторона: ").append(fourthSide);
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quadrangle that = (Quadrangle) o;

        if (Double.compare(that.firstSide, firstSide) != 0) return false;
        if (Double.compare(that.secondSide, secondSide) != 0) return false;
        if (Double.compare(that.thirdSide, thirdSide) != 0) return false;
        return Double.compare(that.fourthSide, fourthSide) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(firstSide);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(secondSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(thirdSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fourthSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
