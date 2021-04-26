package lab29;

class Circle implements Shape  {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area * 100) / 100.0;
    }

    @Override
    public String toString() {
        return "circle; radius = " + radius + "; square = " + getArea() + ";\n";
    }
}