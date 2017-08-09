package com.aviv871.edu.Math871;

import java.util.ArrayList;

public class Math871
{
    public static class Fibonacci
    {
        public static int findByPlace(int place)
        {
            if(place < 3) return 1;
            return findByPlace(place - 1) + findByPlace(place - 2);
        }

        public static int findByPlaceNoRecursion(int place)
        {
            int current = 1;
            int last = 1;
            int holder;
            place -= 2;

            for(;place > 0; place--)
            {
                holder = current;
                current = last + current;
                last = holder;
            }
            return current;
        }
    }

    public static class PascalTriangle
    {
        public static int findByPlace(int place)
        {
            if(place < 5) return 1;

            int row = 1;
            while(place > 0)
            {
                place -= row;
                row += 1;
            }

            return findByRowAndPlaceInRow(row - 1, place + (row - 1));
        }

        private static int findByRowAndPlaceInRow(int row, int place)
        {
            if(row < 3 || row == place || place == 1) return 1;
            return findByRowAndPlaceInRow(row-1, place) + findByRowAndPlaceInRow(row-1, place-1);
        }
    }

    public static int factorial(int n)
    {
        if(n < 0) return 0;

        int sum = 1;
        while(n > 1)
        {
            sum *= n;
            n -= 1;
        }
        return sum;
    }

    public static int digitSum(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static double howManyAreBiggerThanTheAverageInPercentage(int[] arr)
    {
        float avg = 0;
        for(int a: arr)
        {
            avg += a;
        }
        avg /= arr.length;

        int biggerCount = 0;
        for(int a: arr)
        {
            if(a > avg) biggerCount++;
        }

        return ((float)biggerCount / arr.length) * 100;
    }

    public static void throwPossiblePairsOfSumSeven(int[] arr)
    {
        ArrayList<Integer> blackList = new ArrayList<>();

        mainLoop:
        for(int i = 0; i <= arr.length-2; i++)
        {
            if(blackList.contains(arr[i])) continue;
            blackList.add(arr[i]);
            blackList.add(7 - arr[i]);

            for(int j = 1; j <= arr.length-1-i; j++)
            {
                if(arr[i] + arr[i+j] == 7)
                {
                    System.out.print(arr[i] + "," + arr[i+j] + " ");
                    continue mainLoop;
                }
            }
        }
    }

    public static double sigmoid(double value)
    {
        return (1d / (1 + Math.exp(-value)));
    }

    public static double sigmoidPrime(double value)
    {
        return value * (1 - value);
    }
}
