package lesson_3.examples;

public class Circle {

    double PI;
    double radius;
    double diameter;


    public Circle (double PI, double radius, double diameter){
        this.PI = PI;
        this.radius = radius;
        this.diameter = diameter;
    }

    double radius(){
        return radius;
    }

    double findArea() {
        return PI * radius * radius;
    }

    double findCircumference() {
        return diameter * PI * radius;
    }
        public static void main(String[] args) {
        Circle circle = new Circle(3.14, 5.0, 10.0);
        System.out.printf("Radius of circle %f\n", circle.radius());
        System.out.printf("Area of circle %f\n", circle.findArea());
        System.out.printf("Circumference of circle %f\n", circle.findCircumference());

        //%d represents an integer; you want to use %f for a double.
    }

}

