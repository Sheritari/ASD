package com.company;

import java.util.concurrent.Callable;

/**
 * Класс, реализующий интерфейс Callable.
 * Реализует задание для его использования в потоках.
 * @see Callable
 * @see Matcher
 */
public class Task implements Callable<Integer> {

    /**
     * Пример входной строки.
     */
    private final String INPUT_STRING;

    /**
     * Шаблон поиска символов в строке.
     */
    private final String TEMPLATE;

    /**
     * Конструктор от двух аргументов.
     * @param inputString - Пример входной строки.
     * @param template - Шаблон поиска символов в строке.
     */
    Task(String inputString, String template) {
        this.INPUT_STRING = inputString;
        this.TEMPLATE = template;
    }

    @Override
    public Integer call() throws Exception {
        if (Matcher.match(INPUT_STRING, TEMPLATE)) {
            return 1;
        } else {
            return 0;
        }
    }
}