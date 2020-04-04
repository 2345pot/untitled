package com.company;
import java.util.Scanner;
public class boch {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
int a = scanner.nextInt();
 int c = a % 100;
if (c > 5 || c < 21)
    System.out.println(a + " bochek");
   else {
if (c == 1)
    System.out.println(a + " bochka");
else {
if (c < 5)
    System.out.println(a + " bochki");
else
    System.out.println(a + " bochek");
}
   }
    }
}
