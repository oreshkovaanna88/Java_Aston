package Hw7.geometry;

public class Rectangle implements ComputationPerimeterAndArea {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public void getRectangleInfo() {
        System.out.printf("Rectangle\nPerimeter: %.2f\nArea: %.2f\nFill color: %s\nBorder color: %s\n* * *\n",
                computatePerimeter(), computateArea(), fillColor, borderColor);
    }
}
