package Day4_121221;

import java.util.Locale;

public class Lopp_Array_Conditions {

    public static void main(String[] args) {

       // Create a dynamic array for 4 different cities, iterate through the values but only print when city is
       //either Brooklyn or Queens
       String[] cities = new String[4];
       cities [0] = "Queens";
        cities [1] = "Manhattan";
        cities [2] = "Brooklyn";
        cities [3] = "Bronx";

        int i = 0;
        while (i <cities.length){
            //two if conditions
            if (cities[i] == "Brooklyn"){
                System.out.println("City Is " + cities[i]);
            } else if ((cities[i] == "Queens")) {
                System.out.println("city is " + cities[i]);
            }// end of conditions
            i++;
        }// end of while loop

        //when you are not sure if the value is upper case, lower case or mixed

        int j = 0;
        while (j < cities.length){
            if (cities[j].toLowerCase().equals("brooklyn")){
                System.out.println("city is " + cities[j]);
            } else if (cities[j].toUpperCase().equals("QUEENS")){
                System.out.println("City is " + cities[j]);
            }// end of condition
        }// end of loop
        i++;



    }// end of main




}// end of java class
