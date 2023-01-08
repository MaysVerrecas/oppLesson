package hw.transport;

public class Car {
    private final String BRAND;
    private final String MODEL;
    private double engineVolume;
    private String color;
    private final int YEAR;
    private final String COUNTRY;
    private Property property;
    private Key keys;

    public class Property {

        private String transmission; //коробка передач
        private final String BODY_TYPE; // тип кузова
        private String registrationNumber; //Регистрационный номер
        private final int SEATS; //Количество мест
        private boolean tires; // резина

        public Property(String transmission, String BODY_TYPE, String registrationNumber, int SEATS, boolean tires) {
            if (!transmission.isBlank() || !transmission.isEmpty()) {
                this.transmission = transmission;
            } else {
                this.transmission = "Механика";
            }

            if (!BODY_TYPE.isEmpty() || !BODY_TYPE.isBlank()) {
                this.BODY_TYPE = BODY_TYPE;
            } else {
                this.BODY_TYPE = "Седан";
            }

            if (!registrationNumber.isBlank() || !registrationNumber.isEmpty()) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "Не зарегистрирован";
            }
            if (SEATS > 0) {
                this.SEATS = SEATS;
            } else {
                this.SEATS = 4;
            }
            this.tires = tires;
        }
        public String getTransmission() {
            return transmission;
        }

        public String getBODY_TYPE() {
            return BODY_TYPE;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public int getSEATS() {
            return SEATS;
        }

        public boolean isTires() {
            return tires;
        }
        public void setTransmission(String transmission) {
            this.transmission = transmission;
        }

        public void setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public void setTires(boolean tires) {
            /*
             * true - зима
             * false - лето
             */
            this.tires = tires;
        }
        public String getTires() {
            if (isTires()) {
                return "Зимняя";
            } else {
                return "Летняя";
            }
        }
        public void changeTires(int mounth) {
            if (mounth >= 4 && mounth <= 11) {
                setTires(false);
            } else if (mounth == 12 || mounth >= 1 && mounth < 4) {
                setTires(true);
            } else {
                System.out.println("Введен некорректный месяц");
            }
        }

        public String toStringProperty() {
            return " Коробка передач - " + transmission +
                    ", Тип кузова - " + BODY_TYPE +
                    ", Регистрационный номер - " + registrationNumber +
                    ", Мест - " + SEATS +
                    ", Резина - " + getTires();
        }
    }

    public class Key{
        private final boolean REMOTE_LAUNCH;
        private final boolean KEYLESS_ACCESS;

        public Key(boolean remote_launch, boolean keyless_access) {
            REMOTE_LAUNCH = remote_launch;
            KEYLESS_ACCESS = keyless_access;
        }

        public boolean isRemoteLaunch() {
            return REMOTE_LAUNCH;
        }

        public boolean isKeylessAccess() {
            return KEYLESS_ACCESS;
        }
    }


    public Car(String BRAND, String MODEL, double engineVolume, String color, int YEAR, String COUNTRY) {
        if (BRAND.isEmpty() || BRAND.isBlank()) {
            this.BRAND = "default";
        } else {this.BRAND = BRAND;}

        if (MODEL.isEmpty() || MODEL.isBlank()) {
            this.MODEL = "default";
        } else {this.MODEL = MODEL;}

        if (color.isEmpty() || color.isBlank()) {
            this.color = "Белый";
        } else {this.color = color;}

        if (COUNTRY.isEmpty() || COUNTRY.isBlank()) {
            this.COUNTRY = "default";
        } else {this.COUNTRY = COUNTRY;}

        if (YEAR <= 0) {
            this.YEAR = 2000;
        } else {this.YEAR = YEAR;}

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {this.engineVolume = engineVolume;}



    }



    @Override
    public String toString() {
        if (property == null) {
            return "Бренд - " + BRAND + ", Модель - " + MODEL + ", Объем двигателя - " + engineVolume + ", Цвет кузова - " +
                    color + ", Год выпуска - " + YEAR + ", Страна выпуска - " + COUNTRY;
        } else {
            return "Бренд - " + BRAND + ", Модель - " + MODEL + ", Объем двигателя - " + engineVolume + ", Цвет кузова - " +
                    color + ", Год выпуска - " + YEAR + ", Страна выпуска - " + COUNTRY + property.toStringProperty();
        }

    }

    public String getBRAND() {
        return BRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYEAR() {
        return YEAR;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }




    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
