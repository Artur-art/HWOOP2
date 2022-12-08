package Transport;

import java.time.LocalDate;

public class Cars {
    public static class Key{
        private boolean remoteEngineStart;
        private boolean keylessAccess;
        public Key (boolean remoteEngineStart , boolean keylessAccess){
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public static class Insurance{
            LocalDate termOfInsurance;
            private int priceOfInsurance;
            private String numberOfInsurance;
            public Insurance (LocalDate termOfInsurance, int priceOfInsurance, String numberOfInsurance){
                setNumberOfInsurance(numberOfInsurance);
                setTermOfInsurance(termOfInsurance);
            }
            public LocalDate getTermOfInsurance() {
                return termOfInsurance;
            }
            public void setTermOfInsurance(LocalDate termOfInsurance) {
                if(termOfInsurance == null){
                    this.termOfInsurance = LocalDate.now().plusDays(365);
                }else{
                    this.termOfInsurance = termOfInsurance;
                }
            }
            public String getNumberOfInsurance() {
                return numberOfInsurance;
            }
            public int getPriceOfInsurance() {
                return priceOfInsurance;
            }
            public void setPriceOfInsurance(int priceOfInsurance) {
                if(priceOfInsurance == 0){
                    System.out.println("Данные не корректны");
                } else {
                    this.priceOfInsurance = priceOfInsurance;
                }
            }

            public void setNumberOfInsurance(String numberOfInsurance) {
                if(numberOfInsurance == null){
                    this.numberOfInsurance = "123456789";
                }else{
                    this.numberOfInsurance = numberOfInsurance;
                }


            }
        }
        }



        private String brand;
        private String model;
        double engineVolume;
        String color;
        private int year;
        private String country;
        String transmission;
        private String bodyType;
        String registrationNumber;
        private int numberOfSeats;
        String rubber;
        public Cars(String brand, String model, double engineVolume, String color, int year, String country,String transmission,String bodyType,String registrationNumber,int numberOfSeats, String rubber) {
            setBrand(brand);
            setModel(model);
            setEngineVolume(engineVolume);
            setColor(color);
            setYear(year);
            setCountry(country);
            setTransmission(transmission);
            setBodyType(bodyType);
            setRegistrationNumber(registrationNumber);
            setNumberOfSeats(numberOfSeats);
            setRubber(rubber);
        }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
            if(brand == null || brand.isEmpty()|| brand.isBlank()){
                System.out.println("информация не корректна");
            }else  {
                this.brand = brand;
            }
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
            if(model == null || model.isEmpty() || model.isBlank()){
                System.out.println("информация не корректна");

            }else{
                this.model = model;
            }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
            if(color == null || color.isEmpty() || color.isBlank()){
                System.out.println("информация не корректна");
            } else{
                this.color = color;
            }
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
            if(engineVolume <= 0){
                this.engineVolume = 1.6;
            } else{
                this.engineVolume = engineVolume;
            }
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
            if(year < 2000){
                this.year = 2000;
        } else{
                this.year = year;
            }
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
            if(country == null || country.isEmpty() || country.isBlank()){
                this.country = "Russia";
            } else{
                this.country = country;
            }
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        if (transmission == "mehanic" || transmission == "automatic" || transmission == "robot") {
            this.transmission = transmission;
        } else{
            this.transmission = "incorrect";
        }
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {
            if(bodyType == "Sedan" || bodyType ==  "hatchback" || bodyType == "coupe" || bodyType == "crossover"){
                this.bodyType = bodyType;
            } else{
                this.bodyType = "incorrect";
            }
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
            if(registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()){
                this.registrationNumber = "incorrect";
            }else {
                this.registrationNumber = registrationNumber;
            }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
            if(numberOfSeats <= 0){
                System.out.println("не корректные данные");
            } else{
                this.numberOfSeats = numberOfSeats;
            }
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
            if(rubber == "Summer" || rubber == "winter"){
                this.rubber = rubber;
            } else{
                this.rubber = "incorrect";
            }
    }
    public void motor(){
            System.out.println("Марка машины "+ brand);
            System.out.println("Модель машины "+ model);
            System.out.println("Движок " + engineVolume);
            System.out.println("Год выпуска "+ year);
            System.out.println("страна выпуска "+ country);
            System.out.println("коробка передач " + transmission);
            System.out.println("тип кузова " + bodyType);
            System.out.println("Регистрационный номер " + registrationNumber);
            System.out.println("количество мест " + numberOfSeats);
            System.out.println("тип резины " + rubber);
    }
    }

