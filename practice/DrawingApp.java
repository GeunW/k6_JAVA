package practice;

public class DrawingApp {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        drawShape(circle);
        drawShape(square);
        drawShape(triangle);
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }
}