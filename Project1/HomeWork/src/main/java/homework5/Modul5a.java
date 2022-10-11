package homework5;

import java.util.ArrayList;

public class Modul5a {
    public static void main(String[] args) {

        Modul5a weekDays = new Modul5a();
        System.out.println(weekDays.getDay(2));
    }

    public String getDay(int day) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        String result=(days.get(day-1));
        return result;

    }
}


