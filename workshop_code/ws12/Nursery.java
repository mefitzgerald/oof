public class Nursery
{
   public static void main(String[] args)
   {
      MultiBirth[] mbValues = MultiBirth.values();

      for (int i = 0; i < mbValues.length; ++i)
      {
         System.out.println(mbValues[i].ordinal() + " " +
                            mbValues[i] + " " +
                            mbValues[i].getNumber());
      }
   }
}
