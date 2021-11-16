package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Класс, реализующий подсчёт слов в файле.
 */
public class WordCounter {

    /**
     * Метод для получения количества слов в зааданном файле.
     */
    int getWordCount(File file) throws FileNotFoundException{
        Scanner in = new Scanner(file);
        int counter = 0;
        while (in.hasNext()) {
            // Проверка, осталась ли подстрока пустой после удаления всех символов, кроме букв Юникода.
            // В случае, если подстрока не пуста - считаем, что мы нашли слово, иначе пропускаем подстроку.
            if (!"".equals((in.next().replaceAll("[^\\p{L}]+", "")))) {
                counter++;
            }
        }
        return counter;
    }
}
