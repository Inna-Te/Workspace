package homework5;

import java.util.ArrayList;
import java.util.HashSet;

public class Modul5c {
    public static void main(String[] args) {
        Modul5c withOutDuplicates = new Modul5c();
        withOutDuplicates.arrayListWithOutDuplicates();
    }

    public void arrayListWithOutDuplicates() {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Steve");
        nameList.add("Tim");
        nameList.add("Lucy");
        nameList.add("Steve");
        nameList.add("Pat");
        nameList.add("Angela");
        nameList.add("Tom");
        nameList.add("Tim");
        nameList.add("Anna");
        nameList.add("Lucy");

        HashSet<String> newList = new HashSet<>(nameList);

        newList.clear();
        newList.addAll(nameList);

        System.out.println(newList);

    }
}


