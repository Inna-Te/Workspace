package homework5;

import java.util.HashMap;

public class example {
    public static void main(String[] args) {
        example getToyById = new example();
        System.out.println(getToyById.getToyById(12));
    }
    public String getToyById(int id) {

        HashMap<Integer, String> getToy = new HashMap();

        getToy.put(12, "Batmobile");
        getToy.put(45, "Light Saber");
        getToy.put(6, "Wonder Woman");
        getToy.put(201, "HelloKitty Bag");
        getToy.put(56, "Junior QA Analyst Doll");

        if (getToy.get(id) != null) {

            return getToy.get(id);
        } else {
            return "No such Toy";
        }


    }
}
