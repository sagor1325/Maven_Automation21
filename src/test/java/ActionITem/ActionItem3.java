package ActionITem;

public class ActionItem3 {
    public static void main(String[] args) {

        //define string array
        String[] states = new String[4];
        states[0] = "New York";
        states[1] = "California";
        states[2] = "Ohio";
        states[3] = "Florida";

        for (int i = 0; i < states.length; i++) {
            if (states[i] == "New York") {
                System.out.println("My states is " + states[i]);
            } else if (states[i] == "California") {
                System.out.println("my state is " + states[i]);
            }// end of condition


        }// end of loop

    }// end of main


}// end of java
