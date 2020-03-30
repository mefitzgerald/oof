public class Weather4
{
   enum Temperature {HOT, WARM, MILD, COOL, COLD}

   public static void main(String[] args)
   {
      Temperature t1 = Temperature.valueOf("HOT");
      System.out.println(t1);
      Temperature t2 = Temperature.valueOf("Cold");
      System.out.println(t2);
   }
}
