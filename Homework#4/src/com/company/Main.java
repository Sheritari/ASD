package com.company;

/**
 * Homework #4
 *
 * @author Severgin Andrey (Sheritari)
 */
public class Main {

    public static void main(String[] args) {
	ChessCellCords b = new ChessCellCords(5,7);
	System.out.println(b);
	ChessCellCords a = new ChessCellCords();
        System.out.println(a);

        a.setX(5);
        System.out.println(a);

        a.setY(5);
        System.out.println(a);

        a.setXY(4,4);
        System.out.println(a);

        a.setX(8);
        System.out.println(a);
    }
}
