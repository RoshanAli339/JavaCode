package com.company;


class Circle2
{
    double x, y, r;
    double circumference()
    {
        return 2 * 3.14159 * r;
    }

    double area()
    {
        return 22/7 * r * r;
    }

    Circle2 (double x, double y, double r)
    {
        this.x = x; this.y = y; this.r = r;
    }

    Circle2 (double r)
    {
        this(0.0,0.0, r);
    }

    Circle2 (Circle2 c)
    {
        this(c.x, c.y, c.r);
    }

    Circle2 ()
    {
        this(0.0, 0.0, 1.0);
    }
}
public class CircleDemo7 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(3.0, 4.0, 5.0);
        Circle2 c2 = new Circle2(3.0);
        Circle2 c3 = new Circle2(c1);
        Circle2 c4 = new Circle2();

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
