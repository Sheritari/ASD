package com.company;

/**
 * Класс-наследник класса Device, реализующий интерфейс PlayCD.
 * Реализует CD-проигрыватель.
 */
public class CDplayer extends Device implements PlayCD {
    /**
     * Метод для проигрывания композиции.
     * @param cd - CD носитель.
     */
    public void play(CD cd) {
        System.out.printf("%s '%s'%n ", "Воспроизводящее устройство", this);
        System.out.println(cd.getSongList().getSong());
    }

    @Override
    public String toString() {
        return "CD-проигрыватель";
    }

}