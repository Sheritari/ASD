package com.company;

import java.util.Arrays;
import java.util.Objects;

/**
 * Абстрактный класс носителя.
 */
public abstract class Carrier {
    //Список музыки на носителе
    private final SongList songList;
    /**
     * Конструктор по умолчанию.
     */
    Carrier() {
        this.songList = new SongList();
    }

    /**
     * Метод для получения списка музыки на носителе.
     * @return songList - возвращающая список музыкальных композиций.
     * @see SongList
     */
    public SongList getSongList() {
        return songList;
    }

    @Override
    public String toString() {
        return "Музыкальный носитель";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Carrier)) {
            return false;
        }
        Carrier other = (Carrier) obj;
        return this.songList.equals(other.songList);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this);
    }
}
