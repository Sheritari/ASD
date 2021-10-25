package Croc;

import java.util.Arrays;
import java.util.Objects;

/**
 * Класс носителя.
 */
public class Carrier {
    String carrierName;

    //Массив песен на носителе
    Song[] song;

    /**
     * Конструктор от двух аргументов.
     * @param carrierName - название носителя.
     * @param song - массив песен на носителе.
     */
    public Carrier(String carrierName, Song[] song) {
        this.carrierName = carrierName;
        this.song = song;
    }

    /**
     * Метод для получения названия носителя.
     * @return возвращает название носителя.
     */
    public String getCarrier() {
        return this.carrierName;
    }

    /**
     * Метод, устанавливающий название носителя.
     * @param carrierName - новое название носителя.
     */
    public void setCarrier(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Метод для получения массива песен на носителе.
     * @return возвращает массив песен на носителе.
     */
    public Song[] getSong() {
        return this.song;
    }

    /**
     * Метод, устанавливающий массив песен на носителе.
     * @param song - новый массив песен на носителе.
     */
    public void setSong(Song[] song) {
        this.song = song;
    }

    /**
     * Метод возвращает значение true, если аргумент равен экземпляру текущего класса.
     * В противном случае возвращается значение false.
     * Если аргумент равен null, возвращается значение false.
     * @param obj - объект подлежащий сравнению.
     * @return возвращает True, если аргумент равен экземпляру текущего класса, и ложно в противоположном случае.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Carrier other = (Carrier) obj;
        if (!Objects.equals(this.getCarrier(), other.getCarrier())) {
            return false;
        }
        return Arrays.equals(this.getSong(), other.getSong());
    }

    /**
     * Метод для получения строкового представления объекта.
     * @return возвращает название носителя.
     */
    public String toString(){
        return String.format("Носитель: %s", this.carrierName);
    }
}
