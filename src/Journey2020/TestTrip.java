package Journey2020;

public class TestTrip {
    public static void main(String[] args) {
        Person passenger1 = new Person("Michael","Owen",41,167);
        Person passenger2 = new Person("Thierry","Henry",44,167);
        Person passenger3 = new Person("Denis","Bergkamp",39,167);

        Car bmw = new Car("Bmw","Germany",2016,216000);
        Car Mercedes = new Car("Mercedes","Germany",2013,112334);

        City Belgrade = new City("Belgrade",2000000,"Serbia");
        City Stepojevac = new City("Stepojevac",2000,"Serbia");


        Journey trip1 = new Journey(Belgrade,passenger1,Mercedes,60);
        trip1.checkIn(passenger2);
        trip1.checkIn(passenger1);

        System.out.println(trip1);
        double averaggeSpeed = 60;
        System.out.println("You will arrive on your destination for "+trip1.arriveTime(averaggeSpeed)+"h");
    }
}
