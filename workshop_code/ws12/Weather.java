public class Weather
{
   enum Temperature {HOT, WARM, MILD, COOL, COLD}

   public static void main(String[] args)
   {
      Temperature currentTemp = Temperature.HOT;

      if (currentTemp.equals(Temperature.HOT))
      {
         System.out.println("Phew! It's " + currentTemp + 
                            " today");
      }
      else
      { 
         System.out.println("It's not too hot today, it's " 
                             + currentTemp);
      }

      currentTemp = Temperature.WARM;

      if (currentTemp == Temperature.HOT)
      {
         System.out.println("Phew! It's " + currentTemp +
                            " today");
      }
      else 
      {
         System.out.println("It's not too hot today, it's " 
                            + currentTemp);
      }
   }
}
