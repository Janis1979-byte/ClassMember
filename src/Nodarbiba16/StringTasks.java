package Nodarbiba16;

import Nodarbiba16clases.StringUtils;

import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

String someText = scan.nextLine();
scan.close();
        System.out.printf("Text middle: %s \n", StringUtils.getMiddle(someText));
        System.out.printf("Text reverse: %s \n", StringUtils.getReverse(someText));
        System.out.printf("Is Palindrome: %s \n", StringUtils.isPalindrome(someText));
    }
}
