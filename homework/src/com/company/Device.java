package com.company;

import java.util.Objects;

/**
 * Класс воспроизводящего устройства.
 */
public abstract class Device {
    /**
     * Конструктор по умолчанию.
     */
    Device() {

    }

    /**
     * Функция проигрывания музыкальной композиции.
     * @param carrier - любой музыкальный носитель.
     * @see Carrier
     */
    public void play(Carrier carrier) {
        System.out.println("Невозможно воспроизвести композицию\n");
    }

    /**
     * Метод для установки следующей музыкальной композиции.
     * @param carrier - музыкальный носитель.
     * @see Carrier
     */
    public void playNext(Carrier carrier) {
        carrier.getSongList().nextSong();
    }

    /**
     * Метод для установки предыдущей музыкальной композиции.
     * @param carrier - музыкальный носитель.
     * @see Carrier
     */
    public void playPrevious(Carrier carrier) {
        carrier.getSongList().previousSong();
    }

    /**
     * Метод для установки музыкальной композиции по названию.
     * @param carrier - музыкальный носитель.
     * @param nameSong - название композиции.
     */
    public void playUserSong(Carrier carrier, String nameSong) {
        carrier.getSongList().UserSong(nameSong);
    }

    @Override
    public String toString(){
        return "Воспроизводящее устройство";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }
}
