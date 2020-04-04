package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class chetnui_massiv {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      int N = scanner.nextInt();
      int i;
      int[] arr = new int[10];
      for (i = 0; i < N; i++)
         arr[i] = scanner.nextInt();
      for (i = 0; i < N ;i++)
         if (i % 2 == 0)
          System.out.println(arr[i]);
    }
}
