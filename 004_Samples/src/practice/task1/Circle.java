package practice.task1;

public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
}
