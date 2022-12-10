package Transport;

public class Train {
    public int tripPrice;
    public String timeOfTrip;
    public String departureStationName;
    public String endingStation;
    public int numberOfWagons;

    public Train(String brand, String model, int year, String country, String color, int maximumMovementSpeed) {
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
        setTripPrice(tripPrice);
        setTimeOfTrip(timeOfTrip);
        setDepartureStationName(departureStationName);
        setEndingStation(endingStation);
        setNumberOfWagons(numberOfWagons);
    }



}
