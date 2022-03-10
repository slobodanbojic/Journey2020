package Journey2020;

public class Person {
    private String name;
    private String lastname;
    private int years;
    private double height;

    public Person(String name, String lastname, int years, double height) {
        this.name = name;
        this.lastname = lastname;
        this.years = years;
        this.height = height;
    }
    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getLastname (){
        return lastname;
    }
    public void setLastname (String lastname){
        this.lastname = lastname;
    }
    public int getYears (){
        return years;
    }
    public void setYears(int years){
        this.years = years;
    }
    public double getHeight (){
        return height;
    }
    public void setHeight (double height){
        this.height=height;
    }
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime osobe je :");
        sb.append(getName());
        sb.append("Prezime osobe je :");
        sb.append(getLastname());
        sb.append("\n");
        sb.append("Osoba ima :");
        sb.append(getYears());
        sb.append(" godina");
        sb.append("\n");
        sb.append("Osoba je visoka ");
        sb.append(getHeight());
        sb.append("\n");
        return sb.toString();
    }
}
