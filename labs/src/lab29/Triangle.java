package lab29;

class Triangle implements Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 1.0 / 2 * base * height;
    }

    @Override
    public String toString() {
        return "triangle; height = " + height + "; base = " + base + "; square = " + getArea() + ";\n";
    }
}