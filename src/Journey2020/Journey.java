package Journey2020;

import java.util.ArrayList;

public class Journey {
    private City destination;
    private Person roadLeader;
    private Car vehicle;
    private double distance;
    ArrayList<Person> registredPersons = new ArrayList<>();

    public Journey(City destination, Car vehicle, double distance) {
        this.destination = destination;
        this.vehicle = vehicle;
       if (distance < 0 ){
           System.out.println("The distance can not be less than zero");
       }else{
           this.distance = distance;
       }


        this.registredPersons = new ArrayList<>();
    }

    public Journey(City destination, Person roadLeader, Car vehicle, double distance) {
        this.destination = destination;
        this.roadLeader = roadLeader;
        this.vehicle = vehicle;
        if (distance < 0 ){
            System.out.println("The distance can not be less than zero");
        }else{
            this.distance = distance;
        }
        this.registredPersons = new ArrayList<>(); //we dont send  ArrayList registredPerson already we make emty ArrayList
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public Person getRoadLeader() {
        return roadLeader;
    }

    public void setRoadLeader(Person roadLeader) {
        this.roadLeader = roadLeader;
    }

    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car vehicle) {
        this.vehicle = vehicle;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if (distance < 0) {
            System.out.println("Distance can not be less than zero");
        } else {
            this.distance = distance;
        }
    }

    public ArrayList<Person> getRegistredPersons() {
        return registredPersons;
    }

    public void setRegistredPersons(ArrayList<Person> registredPersons) {
        this.registredPersons = registredPersons;
    }
    public double arriveTime (double speed){
        double time = distance / speed;
        return time ;
    }
    public void checkIn (Person p){
     registredPersons.add(p);
    }
    public void checkOut (Person p){
        registredPersons.remove(p);
    }
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacion name is :");
        sb.append(destination.getIme() +" "+ destination.getDrzava());
        sb.append(" \n");
        sb.append("Road leader is :");
        if (roadLeader == null) {
            sb.append("Road leader does not exist");
            sb.append("\n");
        } else {
            sb.append(roadLeader.getName() + " " + roadLeader.getLastname());
            sb.append("\n");
        }
        sb.append("He travel by car :");
        sb.append(vehicle.getBrand());
        sb.append(", ");
        sb.append(vehicle.getYearOfManufacture());
        sb.append(", ");
        sb.append(vehicle.getMiles());
        sb.append("\n");
        sb.append("Distance is :");
        sb.append(distance);
        sb.append("\n");
        int i = 0;
        if (registredPersons.isEmpty()) {
            sb.append("there is not checkin passengers for this trip");
        } else {
            for (Person passenger : registredPersons) {
                sb.append("Registered presons for the trip are  " +(i+1));
                sb.append(" ");
                sb.append(passenger.getName());
                 sb.append(" ");
                sb.append(passenger.getLastname());
                sb.append("\n");
                i++;
            }
        }
         return sb.toString();
    }
}
