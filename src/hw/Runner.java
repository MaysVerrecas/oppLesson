package hw;

import hw.transport.Car;

public class Runner {
    private static final Car[] CARS = new Car[10];
    public static void main(String[] args) {
        // String BRAND, String MODEL, double engineVolume, String color, int YEAR, String COUNTRY,
        //    String transmission, String BODY_TYPE, String registrationNumber, int SEATS, boolean tires

        CARS[0] = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        CARS[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        CARS[2] = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        CARS[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        CARS[4] = new Car("Hyundai", "Avante", 1.6, "Оранджевый", 2016, "Южная Корея");
        CARS[5] = new Car("", " ", -1., " ", 0, " ");
        printAllCars();
        Car.Property car0 = CARS[0].new Property("Механника", "Седан", "343М32", 4, false);
        CARS[0].setProperty(car0);
        System.out.println(CARS[0].toString());

    }
    private static void printAllCars() {
        for (int i = 0; i < CARS.length; i++) {
            if (CARS[i] != null) {
                System.out.println(CARS[i].toString());
            }
        }
    }
}
