package lab29;

class Rectangle implements Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "rectangle; a = " + a + "; b = " + b + "; square = " + getArea() + ";\n";
    }
}