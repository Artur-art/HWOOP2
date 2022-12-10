import Transport.Cars;
import Transport.Train;
import Transport.Transport;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        /*Cars ford = new Cars("ford", "kuga",1.6, "blue",2022,"USA","variator","crossover","A123BN23",4,"summer");
        Cars.Key keyFord = new Cars.Key(true,true);
        Cars.Key.Insurance insuranceFord = new Cars.Key.Insurance(LocalDate.now(),1500,"123333666");
        ford.motor();
        Cars nissan = new Cars("Nissan", "Murano",1,"black", 2021,"Japan","robot","crossover","B345MV21",4,"autumn");
        Cars.Key keyNissan = new Cars.Key(true,true);
        Cars.Key.Insurance insuranceNissan = new Cars.Key.Insurance(LocalDate.now(),1000,"124567891");
        nissan.motor();
        Cars mitsubishi = new Cars("Mitsubishi","Lancer",1.6,"mint",2022,"Japan","automatic","Sedan","J789K7",4,"winter");
        Cars.Key keyMitsubishi = new Cars.Key(true,true);
        Cars.Key.Insurance insuranseMitsubishi = new Cars.Key.Insurance(LocalDate.now(),1000,"123789456");
        mitsubishi.motor();*/
        Cars ford = new Cars("ford","kuga",2022,"USA","blue",200);
        ford.motor();
        Transport lastochka = new Transport("Ласточка"," B-901",2011,"Россия","зеленый",300,3500,"11 часов","Белорусский вокзал","Минск пассажирский",8);
        lastochka.trip();






    }

}
