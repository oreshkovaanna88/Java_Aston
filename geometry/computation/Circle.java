package Hw7.Geometry;

public class Circle implements ComputationPerimeterAndArea {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double computatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double computateArea() {
        return Math.PI * radius * radius;
    }

    public void getCircleInfo() {
        System.out.printf("Circle\nPerimeter: %.2f\nArea: %.2f\nFill color: %s\nBorder color: %s\n* * *\n",
                computatePerimeter(), computateArea(), fillColor, borderColor);
    }
}
