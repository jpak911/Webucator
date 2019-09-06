package additionalEmployees;

public class NonExemptEmployee extends Employee {
	 
    private double hours;
     
    public NonExemptEmployee() {
    }
    public NonExemptEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public NonExemptEmployee(String firstName, String lastName, int dept) {
        super(firstName, lastName, dept);
    }
    public NonExemptEmployee(String firstName, String lastName,
                double payRate, double hours) {
        super(firstName, lastName, payRate);
        setHours(hours);
    }
    public NonExemptEmployee(String firstName, String lastName, int dept,
                double payRate, double hours) {
        super(firstName, lastName, dept, payRate);
        setHours(hours);
    }  
 
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
 
    public String getPayInfo() {
        return "Non-Exempt Employee " + getId() + " dept " + getDept() +
                     " " + getFirstName() + " " + getLastName() +
                     " paid " + getPayRate() * hours;
    }
}