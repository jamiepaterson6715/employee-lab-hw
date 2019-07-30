package staff.techStaff;
import staff.Employee;

public class Developer extends Employee {
    Developer developer;

        public Developer(String name, String niNumber, int salery) {
            super(name, niNumber, salery);
        }

        public String getName() {
            return this.developer.getName();
        }

        public String getNiNumber() {
            return this.developer.getNiNumber();
        }

        public int getSalery() {
            return this.developer.getSalery();
        }
}
