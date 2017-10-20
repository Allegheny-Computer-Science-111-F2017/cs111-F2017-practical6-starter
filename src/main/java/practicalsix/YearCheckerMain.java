package practicalsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class YearCheckerMain {

  public static String getHumanReadableAnswer(boolean truthValue) {
    if (truthValue) {
      return "Yes";
    }
    return "No";
  }

  public static void main(String[] args) {

    // Step One: Declare the starting file and scanner
    File yearInputFile = null;
    Scanner scanner = null;

    // Step Two: Connect the scanner to the input file
    try {
      yearInputFile = new File("inputs/year_input.txt");
      scanner = new Scanner(yearInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the file.");
    }

    // Step Three: Display a welcome message
    System.out.println("Gregory M. Kapfhammer " + new Date());
    System.out.println();

    // Step Four: Read in the year from the file
    System.out.println("I will read in a year between 1000 and 3000.");

    // Step Five: Construct an instance of the YearChecker class

    // Step Six: Call a method to see if it is a leap year and produce output

    // Step Seven: Call a method to see if it is an emergence year and produce output

    // Step Eight: Call a method to see if it is sunspot year and produce output

    // Step Nine: Display the closing message

  }

}
