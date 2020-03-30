public class Weather3
{
   enum Temperature {HOT, WARM, MILD, COOL, COLD}

   public static void main(String[] args)
   {
      Temperature t1 = Temperature.HOT;    
      Temperature t2 = Temperature.COOL;
      Temperature t3 = Temperature.WARM;   
      Temperature t4 = Temperature.WARM;

      comparison(t1, t2);
      comparison(t2, t3);
      comparison(t3, t4);
      comparison(t4, t1);
      comparison(t4, Temperature.MILD);
   }

   public static void comparison(Temperature temp1, Temperature temp2)
   {
      if (temp1.compareTo(temp2) == 0)
      {
         System.out.println("The temperatures are the same, they are both: " + 
                            temp1);
      }
      else if (temp1.compareTo(temp2) < 0)
      {
         System.out.println(temp1 + " is hotter than " + temp2);
      }
      else
      {
         System.out.println(temp1 + " is colder than " + temp2);
      }
   }
}
