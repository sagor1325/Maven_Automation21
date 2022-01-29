package ActionITem;

public class ActionItem1forloop {
    public static void main(String[] args) {
        // create dynamuc array for zipcode
        String[] zipcode = new String[4];
        zipcode[0] = "11218";
        zipcode[1] = "11219";
        zipcode[2] = "11214";
        zipcode[3] = "11216";

        //create dynamic array for streetnumber
        int[] streetmumber = new int[4];
        streetmumber[0] = 22;
        streetmumber[1] = 23;
        streetmumber[2] = 24;
        streetmumber[3] = 25;

        //define for loop
        for (int i=0; i <streetmumber.length; i++){
            System.out.println("my zipcode is " + zipcode[i] +" and my street number is " + streetmumber[i] );

        }// end of loop





    }// end ofmain



} // end of java
