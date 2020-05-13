package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// FORMAT NUMBERS IN JAVA. NumberFormat is an abstract class. you cant create objects with the 'new' keyword
      //  String percent = NumberFormat.getPercentInstance().format(0.2);
      //  System.out.println(percent);//shift + f6 to rename
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age ");
        byte age = scanner.nextByte();
        System.out.println("you are" + age);
    }
}
