package ActionITem;

public class ActionItem1 {
    public static void main(String[] args) {
       //create a string dynamic array for zipcode
        String[] zipcode = new String[4];
        zipcode[0] = "11218";
        zipcode[1] = "11219";
        zipcode[2] = "11216";
        zipcode[3] = "11208";

        //create a integer dynamic array for streetnumber
        int[] streetNumber = new int[4];
        streetNumber[0] = 19;
        streetNumber[1] = 20;
        streetNumber[2] = 16;
        streetNumber[3] = 17;

        //declare and define initial starting point
        int i = 0;
        // define while loop with your and point (condition)
        while(i<zipcode.length){
            System.out.println("My zipcode is "+ zipcode[i] + " and my street number is " + streetNumber[i]);
        i = i+1;
        }// end of while loop


    } // end of main






} // end of java
