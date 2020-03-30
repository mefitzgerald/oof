public class Task2WS04
{
   public static void main(String[] args)
   {
      String name = "Suzie";
      String sport = "squash";
      char grade = 'B';
      int age = 22;
      double courtHire = 19.80;

      System.out.printf("%s plays %s.\n", name, sport);
      System.out.printf("%d year old %s plays %c grade %s\n", 
                        age, name, grade, sport);
      System.out.printf("Court hire is %f. %s must pay %1$f to play.\n", 
                        courtHire, name);
   }
}
