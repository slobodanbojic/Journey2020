package Journey2020;



public class Car {
    private String brand;
    private String country;
    private int yearOfManufacture;
    private double miles;
    private Person owner;

    public Car(String brand, String country, int yearOfManufacture, double miles) {
        this.brand = brand;
        this.country = country;
        this.yearOfManufacture = yearOfManufacture;
        this.miles = miles;
    }

    public Car(String brand, String country, int yearOfManufacture, double miles, Person owner) {
        this.brand = brand;
        this.country = country;
        this.yearOfManufacture = yearOfManufacture;
        this.miles = miles;
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        if(yearOfManufacture > 2022){
            System.out.println("Car can't be build in future");
        }else {
            this.yearOfManufacture = yearOfManufacture;
        }
        }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
