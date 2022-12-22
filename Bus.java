import Transport.Transport;

public class Bus extends Transport {
    public Bus(String brand,String model, int year, String country, String color, int maximumMovementSpeed){
        super(brand,model,year,country,color,maximumMovementSpeed);
    }
    protected double fuelPercentage;

    @Override
    public void fuelPercentage() {
        fuelPercentage = 64.75;
        System.out.println("Количество топлива в процентах " + fuelPercentage);
    }
    private String refilDiesel;
    @Override
    public void refil() {
        refilDiesel = "Дизель";
        if(refilDiesel == null || refilDiesel.isEmpty() || refilDiesel.isBlank()){
            refilDiesel = "Не корректно";
        }
        System.out.println("Заправка автобуса " + refilDiesel);


    }

}
