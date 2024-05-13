package Hw7.geometry;

public class Triangle implements ComputationPerimeterAndArea {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double computatePerimeter() {
        return side1 + side2 + side3;
    }

    
    @Override
    public double calculateArea() {
        double s = computatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void getTriangleInfo() {
        System.out.printf("Triangle\nPerimeter: %.2f\nArea: %.2f\nFill color: %s\nBorder color: %s\n* * *\n",
                computatePerimeter(), computateArea(), fillColor, borderColor);
    }
}
