public class Task4WS04
{
   public static void main(String[] args)
   {
      int anInt = 12;
      double aDouble = 34.5678;
      String aString = "Howdy!";
      int anotherInt = 2 * anInt;

      System.out.println("---Example a)---");
      System.out.println(anInt + " " + aDouble + " " + aString); 
      System.out.println();

      System.out.println("---Example b) and c)---");
      System.out.printf("This is an int: %d.", anInt);   
      System.out.printf("This is an int: %d.\n", anInt); 
      System.out.println();

      System.out.println("---Example d)---");
      System.out.printf("%d, %d\n", anInt, anInt);
      System.out.println();

      System.out.println("---Example e)---");
      System.out.printf("%d, %d\n", anInt, anotherInt);  
      System.out.println();

      System.out.println("---Example f)---");
      System.out.printf("%1$d, %2$d, %1$d, %3$d\n", 
                        anInt, anotherInt, anInt * 3);
      System.out.println();

      System.out.println("---Example g)---");
      System.out.printf("%10d, %1d\n", anInt, anotherInt);
      System.out.println();

      System.out.println("---Example h)---");
      System.out.printf("%10d, %10d|\n", anInt, anotherInt);
      System.out.println();

      System.out.println("---Example i)---");
      System.out.printf("%-10d, %-10d|\n", anInt, anotherInt);
      System.out.println();

      System.out.println("---Example j)---");
      System.out.printf("%010d, %010d|\n", anInt, anotherInt); 
      System.out.println();

      System.out.println("---Example k)---");
      System.out.printf("%10f, %10f|\n", (double) anInt, aDouble); 
      System.out.println();

      System.out.println("---Example l)---");
      System.out.printf("%10.2f, %10.2f|\n", 
                        (double) anInt, aDouble); 
      System.out.println();

      System.out.println("---Example m)---");
      System.out.printf("%10.2f, %10.2f|\n", 
                        (double) anInt * 10000, aDouble * 10000); 
      System.out.println();

      System.out.println("---Example n)---");
      System.out.printf("%,10.2f, %,10.2f|\n", 
                        (double) anInt * 10000, aDouble * 10000);
      System.out.println();

      System.out.println("---Example o)---");
      System.out.printf("%,10.2f, %,10.2f|\n", 
                        (double) anInt * 1000000, aDouble * 1000000); 
      System.out.println();

      System.out.println("---Example p)---");
      System.out.printf("%+10f, %+10f|\n", 
                        (double) anInt, aDouble); 
      System.out.println();

      System.out.println("---Example q)---");
      System.out.printf("%10s, %10s, %10s\n", 
                        aString, "Hi There", "Hello"); 
      System.out.println();

      System.out.println("---Example r)---");
      System.out.printf("%3$10s, %1$10s, %2$10s\n", 
                        aString, "Hi There", "Hello"); 
      System.out.println();

      System.out.println("---Example s)---");
      System.out.printf("%2$10s, %3$10s, %1$10s\n", 
                        aString, "Hi There", "Hello"); 
      System.out.println();

      System.out.println("---Example t)---");
      System.out.printf("%2$-10s, %3$-10s, %1$-10s\n", 
                        aString, "Hi There", "Hello"); 
      System.out.println();
   }
}
