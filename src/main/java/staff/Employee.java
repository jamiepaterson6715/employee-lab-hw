package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salery;


    public Employee(String name, String niNumber, int salery) {
        this.name = name;
        this.salery = salery;
        this.niNumber = niNumber;

    }

    public String getName() {
        return name;
    }

    public String getSalery() {
        return getSalery;
    }

    public String getNiNumber() {
         return getNiNumber;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public void raiseSalery(int amount) {
        this.salery += amount;
    }

    public double Bonus() {
        return this.salery * 0.01;
    }




}
