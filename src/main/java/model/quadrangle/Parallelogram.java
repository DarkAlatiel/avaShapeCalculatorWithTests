package model.quadrangle;

import model.ISquare;
import model.Validator;

public class Parallelogram extends Quadrangle implements ISquare {

    protected double height;

    public Parallelogram(double firstSide, double secondSide, double height) {
        super("Параллелограмм");
        if (Validator.isValidSideValue(firstSide)) {
            this.firstSide = firstSide;
            this.thirdSide = firstSide;
        } else {
            throw new IllegalArgumentException("Неверное значение первой стороны!");
        }
        if (Validator.isValidSideValue(secondSide)) {
            this.secondSide = secondSide;
            this.fourthSide = secondSide;
        } else {
            throw new IllegalArgumentException("Неверное значение второй стороны!");
        }
        if (Validator.isValidSideValue(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Неверное значение высоты!");
        }
    }

    @Override
    public double getPerimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(getName());
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nВысота: ").append(height);
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parallelogram that = (Parallelogram) o;

        if (Double.compare(that.firstSide, firstSide) != 0) return false;
        if (Double.compare(that.secondSide, secondSide) != 0) return false;
        if (Double.compare(that.thirdSide, thirdSide) != 0) return false;
        if (Double.compare(that.fourthSide, fourthSide) != 0) return false;
        return Double.compare(that.height, height) == 0;
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
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double getSquare() {
        return firstSide * height;
    }
}
