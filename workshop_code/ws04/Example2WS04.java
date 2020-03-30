public class Example2WS04
{
   public static void main(String[] args)
   {
      int number1 = 23;
      int number2 = -145;
      double number3 = 12321.345;
      double number4 = -99.9;

      System.out.printf("1: %d, 2: %d, 3: %f, 4: %f\n",
                        number1, number2, number3, number4);
      System.out.printf("2: %-10d, 2: %-10d, 3: %-10f, 4: %-10f\n",
                        number1, number2, number3, number4);
      System.out.printf("3: %+d, 2: %+d, 3: %+f, 4: %+f\n",
                        number1, number2, number3, number4);
      System.out.printf("4: % d, 2: % d, 3: % f, 4: % f\n",
                        number1, number2, number3, number4);
      System.out.printf("5: %010d, 2: %010d, 3: %010f, 4: %010f\n",
                        number1, number2, number3, number4);
      System.out.printf("6: %,d, 2: %,d, 3: %,f, 4: %,f\n",
                        number1, number2, number3, number4);
      System.out.printf("7: %(d, 2: %(d, 3: %(f, 4: %(f\n",
                        number1, number2, number3, number4);
      System.out.printf("8: %+(d, 2: %+(d, 3: %+(f, 4: %+(f\n",
                        number1, number2, number3, number4);
      System.out.printf("9: %(+d, 2: %(+d, 3: %(+f, 4: %(+f\n",
                        number1, number2, number3, number4);
   }
}
