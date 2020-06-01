//Write a Java program to that will create a double array of length 5 and filled with random values.
//The array should be then displayed to screen.
//Then calculate average value of the array elements and display it to screen with 2 values after the decimal point.


class Averagevalue
{

    public static void main(String[] args)
    {
        double total = 0;

        double[] randomArr = new double[5];

        //fill array
        for (int i = 0; i < randomArr.length; i++)
        {
            randomArr[i] = Math.random();
        }
        //display array
        for (double r : randomArr)
        {
            System.out.print(r + " ");
            total = total + r;
        }
        //another way to display array
        //System.out.println(Arrays.toString(randomArr));

        System.out.printf("\nAverage: %.2f", total / randomArr.length);

    }
}
