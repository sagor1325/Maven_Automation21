package Day8_122621;

import java.util.ArrayList;

public class Arraylist_Example {
    public static void main(String[] args) {
        //Arraylsit IS resizable array which means you dont need to add the lenth to add more array values


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");

        System.out.println("My city is " + cities.get(2));

        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(111);
        streetNumber.add(112);
        streetNumber.add(113);
        System.out.println("My third city is " + cities.get(2) + " add my third house number is " + streetNumber.get(2) );







    }// end of main

}//e nd of java
