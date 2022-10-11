package homework4;

public class Modul4a {
    public static void main(String[] args) {

        Modul4a homework4 = new Modul4a();
        homework4.compareStrings("underdog", "dog");
    }

    public void compareStrings(String a, String b) {

        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        } else if (a.equals(b)) {
            System.out.println("The Strings are the same");
        } else if (a.contains(b)) {
            System.out.println("The " + b + " is the part of " + a);
        }
    }

}

