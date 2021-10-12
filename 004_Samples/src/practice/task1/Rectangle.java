package practice.task1;

public class Rectangle extends Figure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }
}
