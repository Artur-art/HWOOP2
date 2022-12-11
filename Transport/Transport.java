package Transport;

public class Transport{
    public String brand;
    public String model;
    public int year; // private
    public String country; // private
    public String color;
    int maximumMovementSpeed;

    public Transport(int tripPrice, String timeOfTrip, String departureStationName, String endingStation, int numberOfWagons) {
        this.brand = brand;
        this.model = model;
        this.country = country;
        this.maximumMovementSpeed = maximumMovementSpeed;
        this.year = year;
        this.color = color;



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

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if(maximumMovementSpeed <= 0){
            System.out.println("Информация не корректна");
        }else{
            this.maximumMovementSpeed = maximumMovementSpeed;
        }


    }
    public Transport (String brand, String model, int year, String country, String color,  int maximumMovementSpeed){

    }
    void motor(){
        System.out.println("Марка " + brand + " модель " + model + " год выпуска " + year + " страна производства " + country + " цвет кузова " + " Максимальная скорость движения " + maximumMovementSpeed );
    }
}
