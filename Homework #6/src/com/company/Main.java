package com.company;

/**
 * Homework #6
 *
 * @author Sheritari (Severgin Andrey)
 */
public class Main {
    public static void main(String[] args) {
        String path = "КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";
        FileNormalizer file = new FileNormalizer();
        System.out.println(file.getNormalizedPath(path));
    }
}
