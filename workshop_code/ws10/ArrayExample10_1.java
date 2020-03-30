/*
 * Class Name:    ArrayExample10_1
 *
 * Author:        Your Name
 * Creation Date: Wednesday, May 06 2015, 14:52 
 * Last Modified: Wednesday, May 06 2015, 20:15
 * 
 * Class Description:
 *
 * Demonstrates some features of arrays of primitive data types
 */

public class ArrayExample10_1
{
    private final int SIZE = 10;

    public static void main( String [ ] args )
    {
         ArrayExample10_1 ae = new ArrayExample10_1( );
    }

    public ArrayExample10_1( )
    {
         int [ ] intArray = new int[ SIZE ];

         System.out.println("\nAfter creating the int array");
         display( intArray );

         double [ ] doubleArray = new double[ SIZE ];

         System.out.println("\nAfter creating the double array");
         display( doubleArray );

         float [ ] floatArray = new float[ SIZE ];

         System.out.println("\nAfter creating the float array");
         display( floatArray );

         char [ ] charArray = new char[ SIZE ];

         System.out.println("\nAfter creating the char array");
         display( charArray );

         boolean [ ] boolArray = new boolean[ SIZE ];

         System.out.println("\nAfter creating the boolean array");
         display( boolArray );

         short [ ] shortArray = new short[ SIZE ];

         System.out.println("\nAfter creating the short array");
         display( shortArray );

         byte [ ] byteArray = new byte[ SIZE ];

         System.out.println("\nAfter creating the byte array");
         display( byteArray );
         
    }

    private void display( int [ ] ar )
    {
         System.out.println( "\n\tHere are the contents of the int array\n");
         System.out.print("\t");
         for( int n : ar )
         {
              // we could use printf here, would be a better idea
              System.out.print( n + " " );
         }

         System.out.println( );
    }

    private void display( double [ ] ar )
    {
         System.out.println( "\n\tHere are the contents of the double array\n");
         System.out.print("\t");
         for( double n : ar )
         {
              // we could use printf here, would be a better idea
              System.out.print( n + " " );
         }

         System.out.println( );
    }

    private void display( float [ ] ar )
    {
         System.out.println( "\n\tHere are the contents of the float array\n");
         System.out.print("\t");
         for( float n : ar )
         {
              // we could use printf here, would be a better idea
              System.out.print( n + " " );
         }

         System.out.println( );
    }

    private void display( char [ ] ar )
    {
         System.out.println( "\n\tHere are the contents of the char array ");
         System.out.println( "\tprinted as integers because the default for" +
                             " char array \n\tis the '\\0' end of " +
                             "string marker which doesn't print\n");
         System.out.print("\t");
         for( char n : ar )
         {
              // we could use printf here, would be a better idea
              System.out.print( (int) n + " " );
         }

         System.out.println( );
    }

    private void display( boolean [ ] ar )
    {
         System.out.println( "\n\tHere are the contents of the boolean array\n");
         System.out.print("\t");
         for( boolean n : ar )
         {
              // we could use printf here, would be a better idea
              System.out.print( n + " " );
         }

         System.out.println( );
    }

    private void display( short [ ] ar )
    {
         System.out.println( "\n\tHere are the contents of the short array\n");
         System.out.print("\t");
         for( short n : ar )
         {
              // we could use printf here, would be a better idea
              System.out.print( n + " " );
         }

         System.out.println( );
    }
    
    private void display( byte [ ] ar )
    {
         System.out.println( "\n\tHere are the contents of the byte array\n");
         System.out.print("\t");
         for( byte n : ar )
         {
              // we could use printf here, would be a better idea
              System.out.print( n + " " );
         }

         System.out.println( );
    }
}
