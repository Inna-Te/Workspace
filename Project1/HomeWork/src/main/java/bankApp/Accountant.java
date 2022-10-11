package bankApp;

public class Accountant extends Employee{
    public Accountant(String employeeName, int employeeId, String employeeDateOfBirth, String city) {
        super(employeeName, employeeId, Consts.ACCOUNTANT_DEFAULT_SALARY, Consts.ACCOUNTANT_Type, employeeDateOfBirth, city);
    }

    public void createReport(String employeeName){
        System.out.println(String.format("The accountant %s will prepare the Report", employeeName));
    }

    public void openNewAccount(String employeeName){
        System.out.println(String.format("New account was opened by %s", employeeName));
    }

    public void closeAccount(String employeeName){
        System.out.println(String.format("Account was closed by %s", employeeName));
    }
}
