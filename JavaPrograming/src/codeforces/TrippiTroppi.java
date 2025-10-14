package codeforces;

import java.util.Scanner;

public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For input

        int t = scanner.nextInt(); // Read number of test cases
        scanner.nextLine(); // Consume the remaining newline

        while (t-- > 0) {
            String line = scanner.nextLine(); // Read a full line like "hello world code"
            String[] words = line.split(" ");  // Split the line into 3 words

            // Use StringBuilder to build the output
            StringBuilder result = new StringBuilder();
            result.append(words[0].charAt(0)); // First letter of first word
            result.append(words[1].charAt(0)); // First letter of second word
            result.append(words[2].charAt(0)); // First letter of third word

            System.out.println(result.toString()); // Print the result
        }

        scanner.close(); // Always close the scanner
    }
}