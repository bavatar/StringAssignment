//package com.company;
public class Main {

    // Used this pgm for string assignment exercise as well
    // Write a Java program that assigns your name to a variable and prints the variable to the console.
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Start time: " + startTime);
        //String is recommended if you don't plan to modify the contents
        //of your variable very often
        String s = "Dave";
        System.out.println(s);  // String assignment
        //StringBuilder is faster but not good for multi-threaded applications
        //StringBuilder s = new StringBuilder("Dave");

        //StringBuffer is good for multi-threaded applications
        // where you are performing two or more tasks simultaneously
        //StringBuffer s = new StringBuffer("Dave");

        //perform a bunch of operations on the string to see the difference in time

        StringBuilder strBld = new StringBuilder("Dave");
        StringBuffer sBuf = new StringBuffer("Dave");
        // Normal string operations
        for(int i=0; i< 50000; i++)
        {
            //s += " Wolf";
            //s.append(" Wolf");
            //System.out.println(s);

            // StringBuilder case
            //strBld.append(" Wolf");

            // StringBuffer case
            sBuf.append(" Wolf");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total time for 50K string buffer operations ====== " + (endTime - startTime) + "ms");
    }
}
