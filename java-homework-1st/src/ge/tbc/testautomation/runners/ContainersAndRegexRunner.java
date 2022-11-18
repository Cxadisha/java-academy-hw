package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.abstractClassesInterfaces.figures.Circle;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainersAndRegexRunner {

    private static boolean phoneNumberValidation(String phoneNumber) {
        boolean found = false;

        // format phone number
        String formattedStr = phoneNumber.replace("-", "");

        // pattern
        Pattern pattern = Pattern.compile("555\\d{6}");

        // matcher
        Matcher matcher = pattern.matcher(formattedStr);

        if (matcher.find()) {
            found = true;
        }

        return found;
    }

    public static void main(String args) {

        // create list
        List<String> list = new ArrayList<>();

        // add to list
        list.add("555-542-231");
        list.add("555-887-987");
        list.add("555-161-143");
        list.add("555-189-67");

        // print using for
        for (int str = 0; str < list.size(); str++) {
            System.out.println(list.get(str));
        }

        // print using iterator
        Iterator it = list.iterator();
        System.out.println("------------");
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }

        // create hashmap
        HashMap<String, String> contacts = new HashMap<>();

        // add to hashmap
        contacts.put("Giorgi", list.get(0));
        contacts.put("Giga", list.get(1));
        contacts.put("Guga", list.get(2));
        contacts.put("Jemali", list.get(3));

        // custom print
        var keys = contacts.keySet();
        for (var key : keys) {
            if (contacts.get(key).contains("8")) {
                System.out.println(key);
            }
        }

        // treeset
        TreeSet<Circle> circleSet = new TreeSet<>();
        circleSet.add(new Circle(10));
        circleSet.add(new Circle(5));
        circleSet.add(new Circle(6));
        circleSet.add(new Circle(4));
        circleSet.add(new Circle(9));
        circleSet.add(new Circle(3));
        circleSet.add(new Circle(4));
        circleSet.add(new Circle(10));
        circleSet.add(new Circle(12));
        circleSet.add(new Circle(24));
        System.out.println("Tree set: " + circleSet);

        // hashset
        HashSet<Circle> circleSet2 = new HashSet<>();
        circleSet2.add(new Circle(10));
        circleSet2.add(new Circle(5));
        circleSet2.add(new Circle(6));
        circleSet2.add(new Circle(4));
        circleSet2.add(new Circle(9));
        circleSet2.add(new Circle(3));
        circleSet2.add(new Circle(4));
        circleSet2.add(new Circle(10));
        circleSet2.add(new Circle(12));
        circleSet2.add(new Circle(24));
        System.out.println("Hash set: " + circleSet2);

        // validate phone numbers
        for (var number : list) {
            System.out.println(phoneNumberValidation(number));
        }
    }
}
