//COPY THE ARRAY
import java.io.*;
import java.util.*;
public class Copyarray {

	
   public static void main(String[] args) {

      // intializing the array
      boolean[] arr = new boolean[] {true, false};

      // printing the array
      System.out.println("Printing 1st array:");
      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);  
      }

      // copying array arr to arr1 
      boolean[] arr1 = Arrays.copyOf(arr, 4);
      arr1[2] = false;
      arr1[3] = true;

      // printing the array arr2
      System.out.println("Printing the new array:");
      for (int i = 0; i < arr1.length; i++) {
         System.out.println(arr1[i]);
      }
   }
}


