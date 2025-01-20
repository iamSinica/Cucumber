package cucumber.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static org.junit.Assert.*;

public class GeometrySteps {
    // Переменные для фигур
    private double circleRadius;
    private double triangleSide1, triangleSide2, triangleSide3;
    private double rectangleLength, rectangleWidth;

    private double circleArea, circleCircumference;
    private double triangleArea;
    private boolean isEquilateralTriangle;
    private double rectangleArea;
    private boolean isSquare;

    // Для Circle (Круг)
    @Когда("я передаю радиус {int}")
    public void я_передаю_радиус(int radius) {
        this.circleRadius = radius;
        // Площадь круга
        circleArea = Math.PI * Math.pow(radius, 2);
        // Длина окружности
        circleCircumference = 2 * Math.PI * radius;
    }

    @Тогда("площадь круга равна {double}")
    public void площадь_круга_равна(double expectedArea) {
        assertEquals(expectedArea, circleArea, 0.01);
    }

    @Тогда("длина окружности равна {double}")
    public void длина_окружности_равна(double expectedCircumference) {
        assertEquals(expectedCircumference, circleCircumference, 0.01);
    }

    @Когда("я передаю стороны {double}, {double} и {double}")
    public void я_передаю_стороны_и(double side1, double side2, double side3) {
        this.triangleSide1 = side1;
        this.triangleSide2 = side2;
        this.triangleSide3 = side3;

        double s = (side1 + side2 + side3) / 2;
        triangleArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        isEquilateralTriangle = (side1 == side2) && (side2 == side3);
    }

    @Тогда("площадь треугольника равна {double}")
    public void площадь_треугольника_равна(double expectedArea) {
        assertEquals(expectedArea, triangleArea, 0.0001);
    }

    @Тогда("треугольник равносторонний")
    public void треугольник_равносторонний() {
        assertTrue(isEquilateralTriangle);
    }

    @Когда("я передаю длину {double} и ширину {double}")
    public void я_передаю_длину_и_ширину(double length, double width) {
        this.rectangleLength = length;
        this.rectangleWidth = width;
        rectangleArea = length * width;

        isSquare = (length == width);
    }

    @Тогда("площадь прямоугольника равна {double}")
    public void площадь_прямоугольника_равна(double expectedArea) {
        assertEquals(expectedArea, rectangleArea, 0.0001);
    }

    @Тогда("прямоугольник является квадратом")
    public void прямоугольник_является_квадратом() {
        assertTrue(isSquare);
    }
}