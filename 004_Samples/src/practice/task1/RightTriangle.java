package practice.task1;

public class RightTriangle extends Figure {
    double a;
    double b;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return 0.5 * a * b;
    }
}
