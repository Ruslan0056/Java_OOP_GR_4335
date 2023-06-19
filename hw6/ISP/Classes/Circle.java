package ISP.Classes;

import ISP.Interfaces.ShapeArea;

public class Circle implements ShapeArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

}

