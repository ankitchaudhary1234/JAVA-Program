import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IJArrayList {
  public static void main(String[] args) {
   int arr[][] ;
  arr = new int[3][3];
    for (int i = 0; i <3; i++) {
      for (int j = 0; j < 3; j++) {
        arr[i][j] = 10;
      }
    }
    for (int i = 0; i <3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
    }

  }
