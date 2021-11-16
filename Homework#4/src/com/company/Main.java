package com.company;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Homework #4
 *
 * @author Sheritari (Severgin Andrey)
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Если аргумент не задан, вызываем исключение IllegalArgumentException.
        // Путь к файлу задается первым аргументом командной строки.
        // Если файла по данному пути нет, то обрабатываем исключение FileNotFoundException.
        if (args.length == 0) {
            throw new IllegalArgumentException();
        }
        try {
            File file = new File(args[0]);
            System.out.printf("Количество слов: %d%n", new WordCounter().getWordCount(file));
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
