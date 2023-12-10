import java.util.*;
import java.io.*;
public class Trebuchet {
    public static void main(String[] args) throws IOException {

        Scanner inFile = new Scanner(new File("input.txt"));

        int sum = 0;

        //go through each line sum the values of each line
        while (inFile.hasNextLine()) {
            String line = inFile.nextLine();
            sum += findValues(line);
        }
        System.out.println(sum);
    }

    public static int findValues (String line) {
        int sum = 0;
        int temp = 0;

        boolean firstFound = false;

        //go through string and find numbers
        for (int i = 0; i < line.length(); i++) {

            if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {

                temp = line.charAt(i) - '0';

                if (!firstFound) {
                    sum = 10 * (temp);
                    firstFound = true;
                }
            }
        }
        return sum + temp;
    }
}