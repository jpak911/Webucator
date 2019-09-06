package additionalEmployees;

public class ContractEmployee extends Employee {
	 
    private double hours;
     
    public ContractEmployee() {
    }
    public ContractEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public ContractEmployee(String firstName, String lastName, int dept) {
        super(firstName, lastName, dept);
    }
    public ContractEmployee(String firstName, String lastName,
                double payRate, double hours) {
        super(firstName, lastName, payRate);
        setHours(hours);
    }
    public ContractEmployee(String firstName, String lastName, int dept,
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
        return "Contract Employee " + getId() + " dept " + getDept() +
                     " " + getFirstName() + " " + getLastName() +
                     " paid " + getPayRate() * hours;
    }
}
