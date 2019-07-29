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

    public void raiseSalery(int raise) {
        this.salery += raise;
    }

    public double getBonus() {
        return this.salery * 0.01;
    }


    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public int getSalery() {
        return this.salery;
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

}
