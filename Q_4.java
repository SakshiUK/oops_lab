// A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s demand. Each Vehicle instance has a method called move, which prints on the console the nature of movement of the vehicle. For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track. Write a program that accepts input from the user on the kind of vehicle the user wants to order, and the system should print out nature of movement. Implement all Java coding best practices to implement this program.

import java.util.Scanner;

class Vehicle {
    public void move() {
        System.out.println("Vehicle moves");
    }
}

class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("Helicopter flies in the air");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car drives on the road");
    }
}

class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("Train runs on the track");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of vehicle you want to order (helicopter/car/train):");
        String vehicleType = scanner.nextLine().toLowerCase();

        Vehicle vehicle;
        switch (vehicleType) {
            case "helicopter":
                vehicle = new Helicopter();
                break;
            case "car":
                vehicle = new Car();
                break;
            case "train":
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid vehicle type entered.");
                return;
        }

        vehicle.move();
    }
}
