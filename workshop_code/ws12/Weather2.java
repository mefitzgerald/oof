public class Weather2
{
   enum Temperature {HOT, WARM, MILD, COOL, COLD}

   public static void main(String[] args)
   {
      Temperature temp = Temperature.HOT;
      System.out.println(temp.ordinal() + " " + temp);
      temp = Temperature.WARM;
      System.out.println(temp.ordinal() + " " + temp);
      temp = Temperature.MILD;
      System.out.println(temp.ordinal() + " " + temp);
      temp = Temperature.COOL;
      System.out.println(temp.ordinal() + " " + temp);
      temp = Temperature.COLD;
      System.out.println(temp.ordinal() + " " + temp);
   }
}
