package com.company;

/**
 * Класс-наследник класса Device, реализующий интерфейс PlayVinyl.
 * Реализует виниловую вертушку.
 */
public class VinylTurntable extends Device implements PlayVinyl {
    /**
     * Метод для проигрывания композиции.
     * @param vinyl - носитель виниловая пластинка.
     */
    public void play(Vinyl vinyl) {
        System.out.printf("%s '%s'%n ", "Воспроизводящее устройство", this);
        System.out.println(vinyl.getSongList().getSong());
    }

    @Override
    public String toString(){
        return "Виниловая вертушка";
    }
}