package com.company;

/**
 * Интерфейс реализации возможности проигрывания флеш носителя.
 */
public interface PlayFlashDrive {
    /**
     * Метод для проигрывания композиции.
     * @param flash - флеш носитель носитель.
     * @see FlashDrive
     */
    public void play(FlashDrive flash);
}