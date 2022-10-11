package bankApp;

public class Clerk extends Employee {
    public Clerk(String employeeName, int employeeId, String employeeDateOfBirth, String city) {
        super(employeeName, employeeId, Consts.CLERK_DEFAULT_SALARY, Consts.CLERK_Type, employeeDateOfBirth, city);
    }

    public void makeCall(String customerName) {
        System.out.println(String.format("Connected to the customer %s", customerName));
    }

    public void getCall(String customerName) {
        System.out.println(String.format("Answered to the customer %S", customerName));
    }

}