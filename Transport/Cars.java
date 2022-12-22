package Transport;


import java.time.LocalDate;

public class Cars extends Transport {
    public Cars(String brand, String model, int year, String country, String color, int maximumMovementSpeed) {
        super(brand, model, year, country, color, maximumMovementSpeed);
    }
    protected double fuelPercentage;

    @Override
    public void fuelPercentage() {
        fuelPercentage = 57.49;
        System.out.println("Количество топлива в процентах " + fuelPercentage);

    }
    private String refilBenz;
    private String refilDiesel;
    private String specialParking;

    @Override
    public void refil() {
        refilBenz = " ";
        //refilDiesel = "Дизель";
        //specialParking = "Специальные парковки";
        //refilBenz = "Дизель";
        if(refilBenz == null || refilBenz.isEmpty() || refilBenz.isBlank()){
            refilBenz = "Не корректно";
        }
        System.out.println("зарядка автомобиля происходит " + refilBenz);
    }


    /*public void motor() {
        System.out.println("Марка " + brand + " модель " + model + " год выпуска " + year + " страна производства " + country + " цвет кузова " + " Максимальная скорость движения " + maximumMovementSpeed);
    }*/

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
        /*public Cars(String brand, String model, double engineVolume, String color, int year, String country,String transmission,String bodyType,String registrationNumber,int numberOfSeats, String rubber) {
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
        }*/


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

    }


