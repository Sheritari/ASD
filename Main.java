package com.company;

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i < 101; i++) {
            String s = Integer.toString(i);
            String f = "Fizz";
            String b = "Buzz";
            if (i % 3 != 0) {
                f = "";
            } else {
                s = "";
            }
            if (i % 5 != 0) {
                b = "";
            } else {
                s = "";
            }
            System.out.println(s + f + b);
        }
    }
}
