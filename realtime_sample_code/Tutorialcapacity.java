/*
Write a program for checking how full a student tutorial is. For this, ask user to enter an integer value of the
number of students in attendance using the
Scanner class.

The program should display the following results;

    If there is 0 students attending the program should display "The tutorial room is empty"
    If there is less than 10 students attending the program should display "The tutorial room is almost empty"
    If there is 10-30 students attending (inclusive) the program should display "The tutorial room has many students,
     but there are still seats available"
    If there are over 30 students attending the program should display "The tutorial room is full"

The program should only accept positive integers and display an error message if invalid input is received. 
*/

import java.util.Scanner;

class Tutorialcapacity
{
    public static void main(String[] args)
    {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter no of students attending");
        int students = kb.nextInt();

        if (students == 0)
        {
            System.out.println("The tutorial room is empty");
        }
        else if (students >= 0 && students < 10)
        {
            System.out.println("The tutorial room is almost empty");
        }
        else if (students >= 10 && students <= 30)
        {
            System.out.println("The tutorial room has many students, but there are still seats available");
        }
        else if (students > 30)
        {
            System.out.println("The tutorial room is full");
        }
        else
        {
            System.out.println("Error");
        }
    }
}