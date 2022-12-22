package Transport;

public class Train extends Transport {
    public int tripPrice;
    public String timeOfTrip;
    public String departureStationName;
    public String endingStation;
    public int numberOfWagons;

    public Train(String brand, String model, int year, String country, String color, int maximumMovementSpeed, int tripPrice, String timeOfTrip,String departureStationName, String endingStation, int numberOfWagons) {
        super(brand, model, year, country, color, maximumMovementSpeed);
        this.tripPrice = tripPrice;
        this.timeOfTrip = timeOfTrip;
        this.departureStationName = departureStationName;
        this.endingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
        this.brand = brand;
        this.model = model;
        getYear();
        this.maximumMovementSpeed = maximumMovementSpeed;
        getCountry();
        this.color = color;

    }


    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        if(tripPrice <= 0){
            System.out.println("Информация не корректна");
        }else{
            this.tripPrice = tripPrice;
        }
    }

    public String getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(String timeOfTrip) {
        if(timeOfTrip == null || timeOfTrip.isBlank() || timeOfTrip.isEmpty()){
            System.out.println("информация не корректна");
        }else{
            this.timeOfTrip = timeOfTrip;
        }

    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if(departureStationName == null || departureStationName.isBlank() || departureStationName.isEmpty()){
            System.out.println("информация не корректна");
        }else{
            this.departureStationName = departureStationName;
        }

    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        if(endingStation == null || endingStation.isBlank() || endingStation.isEmpty()){
            System.out.println("информация не корректна");
        }else{
            this.endingStation = endingStation;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
    public Train(int tripPrice, String timeOfTrip, String departureStationName, String endingStation, int numberOfWagons){
        super(tripPrice, timeOfTrip, departureStationName, endingStation, numberOfWagons);

    }
    protected double fuelPercentage;

    @Override
    public void fuelPercentage() {
        fuelPercentage = 85.73;
        System.out.println("Количество топлива в процентах " + fuelPercentage);
    }
    private String refilDiesel;

    @Override
    public void refil() {
        refilDiesel = "Дизель";
        if(refilDiesel == null || refilDiesel.isEmpty() || refilDiesel.isBlank()){
            refilDiesel = "Не корректно";
        }
        refilDiesel = "Дизель";
        System.out.println("Заправка автобуса " + refilDiesel);

    }


    public void trip(){
        System.out.println("Поезд " + brand + " модель " + model + " год выпуска " + getYear() + " в " + getCountry() + " скорость передвижения " + maximumMovementSpeed + "отходит от " + departureStationName + " и следует до станции " + endingStation + " цена поездки " + tripPrice + " вагонов в поезде " + numberOfWagons);
    }



}
