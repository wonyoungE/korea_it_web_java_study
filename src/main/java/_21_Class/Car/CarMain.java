package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("제네시스");
        System.out.println(car2.carName);
        Car car3 = new Car("제네시스", 2024, "silver");

        car3.startCar();
        car3.drive();
    }
}
