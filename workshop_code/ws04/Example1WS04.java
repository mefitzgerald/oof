public class Example1WS04
{
   public static void main(String[] args)
   {
      String dogName = "Harry";
      int dogAge = 6;
      double weight = 60;

      System.out.printf("My dog %s is %d years old and weighs %.2f kgs\n",
                         dogName, dogAge, weight);

      System.out.printf ("My dog %1$s is %2$d years old. I love %1$s.\n",
                         dogName, dogAge, weight);
   }
}
