package de.learn.dynamic.programming;

import java.util.HashMap;

public class Fibonacci {

    public static HashMap<Integer, Integer> memoization = new HashMap<>();


    public static void main(String[] args) {
        System.out.println(fibonacci(50, memoization));
    }


    public static int fibonacci(int n, HashMap<Integer, Integer>memorization)
    {
        if(n <= 2)
        {
            return 1;
        }

        if(memorization.containsKey(n)){
            return memorization.get(n);
        }

        memorization.put(n, fibonacci(n-1, memorization) + fibonacci(n-2, memorization));
        return memorization.get(n);
    }
}
