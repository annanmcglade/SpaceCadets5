import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;  // Import the Scanner class

import static java.lang.Integer.parseInt;

public class UserInput {
    public static ArrayList<String[]> getInput(){
        ArrayList<String[]> output = new ArrayList<String[]>();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("How many Spirals do u want to make:");
        String amountS = myObj.nextLine();
        int amount = parseInt(amountS);
        if(amount == 0){
            return output;
        }
        for (int i = 0; i < amount; i++){
            String[] spiral = new String[5];
            System.out.println("Outer Circle Radius:");
            spiral[0] = myObj.nextLine();
            System.out.println("Inner Circle Radius:");
            spiral[1] = myObj.nextLine();
            System.out.println("Offset Amount:");
            spiral[2] = myObj.nextLine();
            System.out.println("Spiral Thickness:");
            spiral[3] = myObj.nextLine();
            System.out.println("Spiral Colour(in HEX):");
            spiral[4] = "#" + myObj.nextLine();
            output.add(spiral);
        }
        return output;
    }
}
