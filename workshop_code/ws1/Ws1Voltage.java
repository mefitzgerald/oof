import java.util.*;

public class Ws1Voltage {
    public static void main(String[] args){
    //Task 1.1
    int voltage = 0, power = 0;
    int current = 0, resistance = 0;
    System.out.println("Task1.1 voltage: " + voltage + " power: " + power + " current: " + current + " resistance: " + resistance);
    //Task 1.2
    current = 10;
    System.out.println("Task1.2 voltage: " + voltage + " power: " + power + " current: " + current + " resistance: " + resistance);
    //Task 1.3
    resistance = 1;
    System.out.println("Task1.3 voltage: " + voltage + " power: " + power + " current: " + current + " resistance: " + resistance);
    //Task 1.4
    resistance = resistance * 2;
    System.out.println("Task1.4 voltage: " + voltage + " power: " + power + " current: " + current + " resistance: " + resistance);
    //Task 1.5
    voltage = current * resistance;
    System.out.println("Task1.5 voltage: " + voltage + " power: " + power + " current: " + current + " resistance: " + resistance);
    //Task 1.6
    power = current * voltage;
    System.out.println("Task1.6 voltage: " + voltage + " power: " + power + " current: " + current + " resistance: " + resistance);
    //Task 1.7
    power = current * current * resistance;
    System.out.println("Task1.7 voltage: " + voltage + " power: " + power + " current: " + current + " resistance: " + resistance);    
    //Task 1.8
    System.out.println(power);
    power = 1 / 2 * power;
    System.out.println("Task1.8 voltage: " + voltage + " power: " + power + " current: " + current + " resistance: " + resistance);
        System.out.println(power);
    }
}