package Day2_120521;

public class WhileLoopWithArray {
    public static void main(String[] args) {

        //iterate through all borough defined by dynamic array using while loop
        String[] borough = new String[6];
        borough[0] = "Brooklyn";
        borough[1] = "Queens";
        borough[2] = "Manhattan";
        borough[3] = "Bronx";
        borough[4] = "Staten Island";
        borough[5] = "Long Island";

        // declare and define the initial starting point
        int i = 0;
        // define while loop with your end point
        while(i<borough.length){
            System.out.println("My Current Borough is " + borough[i]);
            i = i+1; //if there is no incrementation, the while loop becomes an infinite loop
        }// end of while loop














    }// end of main












}// end of java
