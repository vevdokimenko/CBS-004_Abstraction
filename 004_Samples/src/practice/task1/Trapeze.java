package practice.task1;

public class Trapeze extends Figure {
    double a;
    double b;
    double h;

    public Trapeze(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double square() {
        return (a + b) / 2 * h;
    }
}
