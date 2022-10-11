package bankApp;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;
    private String position;
    private String dateOfBirth;
    private String city;

    public Employee(String employeeName, int employeeId, double employeeSalary, String employeePosition, String employeeDateOfBirth, String city){
        this.name = employeeName;
        this.id = employeeId;
        this.salary = employeeSalary;
        this.position = employeePosition;
        this.dateOfBirth = employeeDateOfBirth;
        this.city = city;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        String txt = String.format("Employee name: %s, ID: %d, position: %s, salary: %f, Date of birth: %s, city: %s", name, id, position, salary, dateOfBirth, city);
        return txt;

    }

    public void receiveSalary(String employeeName){
        System.out.println(String.format("The salary was sent to %s bank account",employeeName));
    }

}

