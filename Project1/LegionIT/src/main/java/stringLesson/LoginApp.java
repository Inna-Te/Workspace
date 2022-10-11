package stringLesson;

public class LoginApp {
    public String expectedUserName = "ADMIn";
    public String expectedPassword = "12345";

    public static void main(String[] args) {

        LoginApp loginApp = new LoginApp();

        boolean success = loginApp.verifyUser("ADMIn", "12345");
        System.out.println("Login success " + success);
        loginApp.stringsExamples();
    }

    public boolean verifyUser(String userName, String password) {
        userName = userName.toLowerCase();
        password = password.toLowerCase();

        boolean success = false;
        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("The username or password is empty");
        }

        if (userName == null || password == null) {
            System.out.println("The username or password is null");
        } else if (userName.length() == 0 || password.length() == 0) {
            System.out.println("The username or password is empty");
        } else if (userName.isBlank() || password.isBlank()) {
            System.out.println("The username or password is blank");
            //  } else if (!userName.equalsIgnoreCase(expectedUserName) || !password.equalsIgnoreCase(expectedPassword)) {
            System.out.println("The username or password does not match the expected values");
        } else {
            success = true;
        }
        return success;
    }

    public void stringsExamples() {
        String txt1 = "cat";
        String txt2 = "catalog";
        System.out.println(txt2.contains(txt1));
//
//        System.out.println(txt2.replace("cat", txt1));

//        System.out.println(txt1.charAt(0));
//        System.out.println(txt1.charAt(1));
//        System.out.println(txt1.charAt(txt1.length()-1));
    }

}


