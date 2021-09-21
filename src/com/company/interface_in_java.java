package com.company;
import java.util.*;
interface Bicycle{
    int a =45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle, HornBicycle{
    public void blowhorn(){
        System.out.println("HORN 1");
    }
    public void blowHornhn(){
        System.out.println("HORN 2");
    }
    void horn()
    {
        System.out.println("HORN HORN");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake and slow down");
    }
    public void speedUp(int increment){
        System.out.println("Applying accelerator and speeding");
    }
}
interface HornBicycle{
    void blowhorn();
    void blowHornhn();
}
public class interface_in_java {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(5);
        System.out.println(cycle.a);
        //properties in interfaces can't be modified because they are declared as final;
        //cycle.a = 54; this will give an error
        cycle.blowhorn();
        cycle.blowHornhn();
    }
}
