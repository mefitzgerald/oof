import java.util.*;
public class IntArrayTest
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      IntArray a = new IntArray(8);
      a.displayArray();

      System.out.print("Enter search value: ");
      int value = keyboard.nextInt();
      System.out.println("Search first occurrence: " + a.search(value));
      System.out.println("Search last occurrence: " + a.searchLast(value));
      
      a.bubbleSort();
      System.out.println("After bubble sort:");
      a.displayArray();

      System.out.println("Refilling array:");
      a.fillArray();
      a.displayArray();
      a.selectionSort();
      System.out.println("After selection sort:");
      a.displayArray();
   }
}
