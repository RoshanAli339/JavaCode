package com.company;

class Circle
{
    double x, y, r;
    double circumference()
    {
        return 2*3.14159*r;
    }

    double area()
    {
        return (22/7)*r*r;
    }

    Circle(double a, double b, double c)
    {
        x = a;
        y = b;
        r = c;
    }
}
public class CircleDemo4 {
    public static void main(String[] args) {
        Circle c = new Circle(3.0, 4.0, 5.0);
        System.out.println("Circumference: " + c.circumference());
        System.out.println("Area: " + c.area());
    }
}
