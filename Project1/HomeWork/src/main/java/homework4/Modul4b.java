package homework4;
public class Modul4b {
    public static void main(String[] args) {

        Modul4b palindrom = new Modul4b();
        boolean success = palindrom.textIsPalindrom("racecar");
        System.out.println(success);}

    public boolean textIsPalindrom(String textToReverse) {
        boolean success = false;

        if (textToReverse == null || textToReverse.isBlank() || textToReverse.isEmpty()) {
            System.out.println("The text is empty or null");}
        else {
            String result = "";
            int lastLetter = textToReverse.length() - 1;
            for (int i = lastLetter; i >= 0; i--) {
                result = result + textToReverse.charAt(i);
                if (textToReverse.equals(result)) {
                    success = true;}
            }
        }
        return success;
    }
    }
    
