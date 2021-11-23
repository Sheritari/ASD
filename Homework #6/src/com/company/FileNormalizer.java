package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * Класс, реализующий "нормализацию" файла.
 */
public class FileNormalizer {

    /**
     * Функция для нормализации пути.
     * @param path изначальный путь.
     * @return вовзращает "нормализованный" путь.
     */
    String getNormalizedPath(String path) {

        // Создаем список для хранения названий директорий
        List<String> list = List.of(path.split("/"));
        Deque<String> stack = new ArrayDeque<>();

        for (String s : list) {
            // Поднимаеся вверх
            if (s.equals("..")) {
                // Если невозможно подняться выше или или нужно поднятся ещё выше - добавляем в путь директорию
                if (stack.isEmpty() || stack.getLast().equals("..")) {
                    stack.addLast(s);
                } else {
                    stack.removeLast();
                }
            } else if (!s.equals(".")){
                stack.addLast(s);
            }
        }

        // Преобразование стека в строку
        StringBuilder newPathBuilder = new StringBuilder();
        for (String s : stack) {
            newPathBuilder.append(s).append("/");
        }
        String newPath = newPathBuilder.toString();

        // Удаление лишнего '/'
        newPath = newPath.substring(0, newPath.length() - 1);
        return newPath;
    }
}
