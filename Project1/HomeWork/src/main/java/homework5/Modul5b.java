package homework5;

import java.util.HashMap;
import java.util.Scanner;

public class Modul5b {

    public static void main(String[] args) {

        Modul5b toyStore = new Modul5b();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        int id = Integer.parseInt(scanner.next());
        System.out.println(toyStore.getToyById(id));

    }
    public String getToyById(int id) {

        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(12, "Batmobile");
        hashmap.put(45, "Light Saber");
        hashmap.put(6, "Wonder Woman");
        hashmap.put(201, "Hello Kitty");
        hashmap.put(56, "Junior QA Analyst Doll");

            String res = "";
            if (hashmap.containsKey(id)){
                System.out.println(hashmap.get(id));
            }
            else {
                System.out.println("No such toy");}
            return res;

        }
    }






