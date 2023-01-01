package hw;

import hw.transport.Car;

public class Runner {
    private static final Car[] CARS = new Car[10];
    public static void main(String[] args) {
        // String BRAND, String MODEL, double engineVolume, String color, int YEAR, String COUNTRY,
        //    String transmission, String BODY_TYPE, String registrationNumber, int SEATS, boolean tires

        CARS[0] = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия",
               " ", "Хэтчбек", "2486M34N", 4, true );
        CARS[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия",
                "Автомат", "Седан", "244f3427d", 5, false);
        CARS[2] = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия",
                "","","",4, false);
        CARS[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея",
                " ", "", "fnd32", 2, false);
        CARS[4] = new Car("Hyundai", "Avante", 1.6, "Оранджевый", 2016, "Южная Корея",
                "", "", "", 3, false);
        CARS[5] = new Car("", " ", -1., " ", 0, " ",
                "", "", "", 4, false);
        printAllCars();
    }
    private static void printAllCars() {
        for (int i = 0; i < CARS.length; i++) {
            if (CARS[i] != null) {
                System.out.println(CARS[i].toString());
            }
        }
    }
}
