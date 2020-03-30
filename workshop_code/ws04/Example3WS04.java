public class Example3WS04
{
   public static void main(String[] args)
   {
      String s1 = "Hello Out There!";
      String s2 = "hi";                   
      int n1 = 13;
      double d1 = 123.4567;                           

      System.out.printf("s1: %s, s2: %s, n1: %d d1: %f\n",
                        s1, s2, n1, d1);
      System.out.printf("s1: %10s, s2: %10s, n1: %10d d1: %10f\n",
                        s1, s2, n1, d1);
      System.out.printf("s1: %-10s, s2: %-10s, n1: %-10d d1: %-10f\n",
                        s1, s2, n1, d1);
      System.out.printf("s1: %10.3s, s2: %10.3s, n1: %10d d1: %10.3f\n",
                        s1, s2, n1, d1);
      System.out.printf("s1: %3.10s, s2: %3.10s\n", s1, s2);
   }
}
