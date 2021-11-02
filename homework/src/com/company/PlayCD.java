package com.company;

/**
 * Интерфейс реализации возможности проигрывания CD.
 */
public interface PlayCD {
    /**
     * Метод для проигрывания композиции.
     * @param cd - CD носитель.
     * @see CD
     */
    public void play(CD cd);
}
