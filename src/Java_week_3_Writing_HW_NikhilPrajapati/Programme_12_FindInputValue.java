package Java_week_3_Writing_HW_NikhilPrajapati;

import java.util.Scanner;

/**
 * Write a Java program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {

    public static void main(String[] args) {
        // Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character : ");
        char ch = scanner.next().charAt(0);
        //Object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        // Closing the scanner
        scanner.close();
    }

    // Find the input value is ALPHABET, DIGIT or SYMBOL.
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}
