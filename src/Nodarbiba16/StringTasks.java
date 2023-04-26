package Nodarbiba16;

import Nodarbiba16clases.StringUtils;

import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

String someText = scan.nextLine();
scan.close();
        System.out.println(StringUtils.getMiddle(someText));

    }
}
