import java.util.*;
import java.io.*;
public class Trebuchet {
    public static void main(String[] args) throws IOException {

        Scanner inFile = new Scanner(new File("input.txt"));

        int sum = 0;

        //go through each line sum the values of each line
        while (inFile.hasNextLine()) {
            String line = inFile.nextLine();
            line = StringPrep(line);
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

            if (line.charAt(i) >= '0' && line.charAt(i) <= '9') { //remove after finished stringprep

                temp = line.charAt(i) - '0';

                if (!firstFound) {
                    sum = 10 * (temp);
                    firstFound = true;
                }
            }
        }
        return sum + temp;
    }

    public static String StringPrep (String line) {

        //this order is specific to avoid overriding numbers
        if (line.contains("one")) {
            line = line.replaceFirst("one","one1one");
        }
        if (line.contains("two")) {
            line = line.replaceFirst("two", "two2two");
        }
        if (line.contains("three")) {
            line = line.replaceFirst("three","three3three");
        }
        if (line.contains("four")) {
            line = line.replaceFirst("four", "four4four");
        }
        if (line.contains("five")) {
            line = line.replaceFirst("five","five5five");
        }
        if (line.contains("six")) {
            line = line.replaceFirst("six", "six6six");
        }
        if (line.contains("seven")) {
            line = line.replaceFirst ("seven", "seven7seven");
        }
        if (line.contains("eight")) {
            line = line.replaceFirst("eight", "eight8eight");
        }
        if (line.contains("nine")) {
            line = line.replaceFirst("nine","nine9nine");
        }

        return line;
    }
}