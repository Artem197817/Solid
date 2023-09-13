package task2;

public class MainOne {
    /**
     * Переписать код SpeedCalculation в соответствии с
     * Open-Closed Principle:
     * public class SpeedCalculation {
     * public double calculateAllowedSpeed(Vehicle vehicle) {
     * if (vehicle.getType().equalslgnoreCase("Car")) {
     * return vehicle.getMaxSpeedQ * 0.8;
     * } else if (vehicle.getType().equalslgnoreCase("Bus")) { return vehicle.getMaxSpeed() * 0.6;
     * }
     * return 0.0;
     * }
     * }
     * public class Vehicle { int maxSpeed;
     * String type;
     * public Vehicle(int maxSpeed, String type) { this.maxSpeed = maxSpeed; this.type = type;
     * }
     * public int getMaxSpeed() { return this.maxSpeed;
     * }
     * public String getType() { return this.type;
     * }
     * }
     * Подсказка: создайте два дополнительных класса Саг и Вus (наследников Vehicle), напишите метод calculateAllowedSpeed().
     * Использование этого метода позволит сделать класс SpeedCalculation соответствующим ОСР
     */
    public static void main(String[] args) {

        Vehicle car1 = new Car(125,"Car");
        Vehicle bus1 = new Bus(90,"bus");
        SpeedCalculation speedCalculation = new SpeedCalculation();
        System.out.println("Allowed speed - " + speedCalculation.calculateAllowedSpeed(car1));
        System.out.println();
        System.out.println("Allowed speed - " + speedCalculation.calculateAllowedSpeed(bus1));
    }
}
