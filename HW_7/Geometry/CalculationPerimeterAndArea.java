package HW_7.Geometry;

public interface ComputaionPerimeterAndArea {
    //Находим периметр
    default double ComputatePerimeter() {
        return 0.0;
    }

    //Находим площадь
    default double ComputateArea() {
        return 0.0;
    }
}
