public enum MultiBirth
{
   TWINS (2),
   TRIPLETS (3),
   QUADRUPLETS (4),
   QUINTUPLETS (5),
   SEXTUPLETS (6);

   private int numberOfBabies;

   MultiBirth(int number)
   {
      numberOfBabies = number;
   }
   public int getNumber()
   {
      return numberOfBabies;
   }
}
