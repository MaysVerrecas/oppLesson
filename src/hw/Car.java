package hw;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;


    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand.equals(" ") || brand.equals("null")) {
            this.brand = "default";
        } else {this.brand = brand;}
        if (model.equals(" ") || model.equals("null")) {
            this.model = "default";
        } else {this.model = model;}
        if (color.equals(" ") || color.equals("null")) {
            this.color = "Белый";
        } else {this.color = color;}
        if (country.equals(" ") || country.equals("null")) {
            this.country = "default";
        } else {this.country = country;}
        if (year <= 0) {
            this.year = 2000;
        } else {this.year = year;}
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {this.engineVolume = engineVolume;}

    }

    @Override
    public String toString() {
        return
                "Марка : " + brand +
                ", Модель : " + model +
                ", Объем двигателя : " + engineVolume +
                ", Цвет кузова : " + color +
                ", Год выпуска : " + year +
                ", Страна сборки : " + country;
    }
}
