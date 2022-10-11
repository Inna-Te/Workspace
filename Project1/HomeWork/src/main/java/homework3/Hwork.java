package homework3;

public class Hwork {
    public static void main(String[] args) {

        Hwork loops = new Hwork();
        loops.numberSummary (3, 6);

    }

    public void numberSummary (int a, int b){

        int totalSum = 0;
        for (int i = 3; i <= 6; i++){
            totalSum = totalSum + i;}

            System.out.println(totalSum);
        }
    }

