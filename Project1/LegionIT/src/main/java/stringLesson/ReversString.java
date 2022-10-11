package stringLesson;

public class ReversString {

    // dog --> god
    // get the last letter (lehgth-1) add it as a first letter of the word

    public static void main(String[] args) {
        ReversString reversString = new ReversString();
        reversString.reversString("");

    }
    public void reversString(String textToRevers){
        if(textToRevers == null || textToRevers.isBlank()){
            System.out.println("The string is null or empty");
        }
        else {
            System.out.println(String.format("The input string is %s ", textToRevers));
            String result = "";
            int lastLetter = textToRevers.length()-1;
            for (int i = lastLetter; i>=0; i--){
                result = result + textToRevers.charAt(i);
            }
            System.out.println(result);
            }

    }
}
