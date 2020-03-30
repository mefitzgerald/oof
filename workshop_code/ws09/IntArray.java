import java.util.*;
public class IntArray
{
   private int[] values;

   public IntArray(int size)
   {
      if (size > 0)
      {
         values = new int[size];
      }
      else
      {
         values = new int[10];
      }

      fillArray();
   }

   public void fillArray()
   {
      // random integers from 0 to 19 inclusive
      for (int i = 0; i < values.length; ++i)
      {
         values[i] = (int)(Math.random()*20);
      }
   }

   public void displayArray()
   {
      for (int i = 0; i < values.length; ++i)
      {
         System.out.print(values[i] + " ");
      }
      System.out.println();
   }

   public int search(int target)
   {
      return -1;
   }

   public int searchLast(int target)
   {
      return -1;
   }

   public void bubbleSort()
   {
   }

   private void swap(int index1, int index2)
   {
   }

   private int indexOfMaximum(int low, int high)
   {
      return 0;
   }

   public void selectionSort()
   {
   }

   // not required in the exercises
   public String toString()
   {
      String description = "IntArray: ";
      for (int i = 0; i < values.length; ++i)
      {
         description += values[i] + " ";
      }
      return description;
   }
}
