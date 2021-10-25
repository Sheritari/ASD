package com.company;
/**
 * Homework #1
 *
 * @author Severgin Andrey (Sheritari)
 */
public class Main {
     /**
     * Метод для определения кратности.
     *
     * @param a - делимое.
     * @param b - возможное кратное.
     * @param s - вывод при случаи кратности.
     * @return возвращает 1 или 0 в зависимости от кратности.
     */
    public static byte checkMulti(byte a, byte b, String s) {
        if (a % b == 0) {
            System.out.print(s);
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
	   for (byte i = 1; i < 101; i++) {
            //Проверка кратности i на 3 и 5. Если ни одна из проверок не вернёт 1, то выводится i
            if (checkMulti(i, (byte) 3, "Fizz") + checkMulti(i, (byte) 5, "Buzz") == 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
