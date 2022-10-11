package homework3;

public class Modul3a {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number" + " " + i + " " + "is divisible by two and three");
            }
            else if (i % 3 == 0) {
                System.out.println("The number" + " " + i + " " + " is divisible by three");
            }
            else if (i % 2 != 0) {
                System.out.println("The number" + " " + i + " " + "is odd");
            }
            else {
                System.out.println("The number" + " " + i + " " + "is even");
            }

        }
    }
}




