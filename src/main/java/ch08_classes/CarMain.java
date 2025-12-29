package ch08_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "red";
        myCar.speed = 160;
        myCar.drive();

        Car yourCar = new Car();
        yourCar.color = "yellow";
        yourCar.speed = 180;
        yourCar.brake();

        myCar.displayInfo();
        yourCar.displayInfo();
    }
}
