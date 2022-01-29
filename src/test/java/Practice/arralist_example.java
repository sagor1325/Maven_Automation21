package Practice;

import java.util.ArrayList;

public class arralist_example {

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add ("Bangladesh");
        countries.add ("India");
        countries.add ("USA");
        countries.add ("China");

        System.out.println(" my first country " + countries.get(0));

        ArrayList<Integer> housenumbers = new ArrayList<>();
        housenumbers.add(351);
        housenumbers.add(678);
        housenumbers.add(871);
        housenumbers.add(301);

        System.out.println("my first country is " + countries.get(0) + " my housenumber is " + housenumbers.get(0));






    }// end of main




}// end of java
