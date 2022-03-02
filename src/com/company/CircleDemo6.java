package com.company;

class Circle1
{
    double x, y, r;
    double circumference()
    {
        return 2* (3.14159)*r;
    }
    double area()
    {
        return (22/7.0) * r * r;
    }
    Circle1 (double x, double y, double r)
    {
        this.x  = x;
        this.y = y;
        this.r = r;
    }

    Circle1 (double r)
    {
        x = 0.0;
        y = 0.0;
        this.r = r;
    }

    Circle1 (Circle1 c)
    {
        x = c.x;
        y = c.y;
        r = c.r;
    }

    Circle1()
    {
        x = y = 0.0;
        r = 1.0;
    }
}
public class CircleDemo6 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(3.0, 4.0, 5.0);
        Circle1 c2 = new Circle1(3.0);
        Circle1 c3 = new Circle1(c1);
        Circle1 c4 = new Circle1();

        System.out.println("Circumference 1: " + c1.circumference());
        System.out.println("Area 1: " + c1.area());
        System.out.println("Circumference 2: " + c2.circumference());
        System.out.println("Area 2: " + c2.area());
        System.out.println("Circumference 3: " + c3.circumference());
        System.out.println("Area 3: " + c3.area());
        System.out.println("Circumference 4: " + c4.circumference());
        System.out.println("Area 4: " + c4.area());
    }
}
