package com.company;

/**
 * Класс-наследник класса Device, реализующий интерфейсы PlayFlashDrive, PlayVinyl, PlayCD
 * Реализует универсальный проигрыватель
 */
public class UniversalPlayer extends Device implements PlayFlashDrive, PlayVinyl, PlayCD {
    /**
     * Метод для проигрывания композиции.
     * @param vinyl - носитель виниловая пластинка.
     */
    public void play(Vinyl vinyl) {
        System.out.printf("%s '%s'%n ", "Воспроизводящее устройство", this);
        System.out.println(vinyl.getSongList().getSong());
    }

    /**
     * Метод для проигрывания композиции.
     * @param flash - флеш носитель.
     */
    public void play(FlashDrive flash) {
        System.out.printf("%s '%s'%n ", "Воспроизводящее устройство", this);
        System.out.println(flash.getSongList().getSong());
    }

    /**
     * Метод для проигрывания композиции.
     * @param cd - CD носитель.
     */
    public void play(CD cd) {
        System.out.printf("%s '%s'%n ", "Воспроизводящее устройство", this);
        System.out.println(cd.getSongList().getSong());
    }

    @Override
    public String toString(){
        return "Универсальный проигрыватель";
    }
}