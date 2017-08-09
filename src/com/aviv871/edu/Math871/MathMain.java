package com.aviv871.edu.Math871;

import java.util.Scanner;

public class MathMain // Just for testing
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int inputHolder;

        System.out.print("Enter place for Fibonacci Sequence: ");
        inputHolder = s.nextInt();
        System.out.println( Math871.Fibonacci.findByPlaceNoRecursion(inputHolder) );
        System.out.println();

        int[] arr = {1,4,7,0,4,6,3,9,9,7,3,0,1,2,4,2,3,5,7,3,4,5,8,9,1,3,5,6,4};
        Math871.throwPossiblePairsOfSumSeven(arr);
        System.out.println();

        int[] arr2 = {1,4,2};
        System.out.println( Math871.howManyAreBiggerThanTheAverageInPercentage(arr2) );
        System.out.println();

        System.out.print("Enter number to digit sum: ");
        inputHolder = s.nextInt();
        System.out.println( Math871.digitSum(inputHolder) );
        System.out.println();

        System.out.print("Enter number to factorial: ");
        inputHolder = s.nextInt();
        System.out.println( Math871.factorial(inputHolder) );
        System.out.println();

        System.out.print("Enter place for Fibonacci Sequence: ");
        inputHolder = s.nextInt();
        System.out.println( Math871.Fibonacci.findByPlace(inputHolder) );
        System.out.println();

        System.out.print("Enter place for Pascal Triangle: ");
        inputHolder = s.nextInt();
        System.out.println( Math871.PascalTriangle.findByPlace(inputHolder) );
        System.out.println();
    }
}
