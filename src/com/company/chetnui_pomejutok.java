package com.company;
import java.util.Scanner;
public class chetnui_pomejutok {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i;
        for (i = a;i <= b;i++) {
           if (i % 2 == 0)
               System.out.println(i);
       }

    }
}