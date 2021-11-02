package com.company;

/**
 * Класс-наследник класса Device, реализующий интерфейс PlayFlashDrive.
 * Реализует флеш-проигрыватель.
 */
public class FlashDrivesPlayer extends Device implements PlayFlashDrive {
    /**
     * Метод для проигрывания композиции.
     * @param flash - флеш носитель.
     */
    public void play(FlashDrive flash) {
        System.out.printf("%s '%s'%n ", "Воспроизводящее устройство", this);
        System.out.println(flash.getSongList().getSong());
    }

    @Override
    public String toString(){
        return "Флеш-проигрыватель";
    }
}