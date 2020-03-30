public class Task3WS04
{
   public static void main(String[] args)
   {
      System.out.println("Unformatted answer");
      int count = 1;
      while (count <= 10)
      {
         System.out.print(count + " ");
         count++;
      }
      System.out.println();

      count = 1;
      while (count <= 10)
      {
         System.out.print((int)Math.pow(count,3) + " ");
         count++;
      }
      System.out.println();
      System.out.println();

      // to format output
      System.out.println("Formatted answer");
      count = 1;
      while (count <= 10)
      {
         System.out.printf("%5d", count);
         count++;
      }
      System.out.println();

      count = 1;
      while (count <= 10)
      {
         System.out.printf("%5d", (int)Math.pow(count,3));
         count++;
      }
      System.out.println();
   }
}
