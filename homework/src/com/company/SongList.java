package com.company;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Класс списка композиций.
 */
public class SongList {
    //Список композиций.
    private final ArrayList<Song> songs;

    //Номер композиции.
    private int index;

    /**
     * Конструктор по умолчанию.
     * Индекс начала списка композиций равен 0.
     */
    SongList() {
        songs = new ArrayList<Song>();
        index = 0;
    }

    /**
     * Метод для перехода на следующую композицию,
     * Если список закончился, то переход осуществляется на начало списка.
     */
    public void nextSong() {
        if (index < songs.size()-1) {
            index++;
        } else {
            index = 0;
        }
    }

    /**
     * Метод для перехода на предыдущую композицию.
     * Если список закончился, то переход не осуществляется.
     */
    public void previousSong() {
        if (index > 0) {
            index--;
        }
    }

    /**
     * Метод для перехода на композицию пользователя.
     * @param nameSong - название композиции, к которой хочет перейти пользователь.
     */
    public void UserSong(String nameSong) {
        boolean flag = false;
        for (int i = 0; i < songs.size(); i++) {
            if (Objects.equals(songs.get(i).getNameSong(), nameSong)) {
                index = i;
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Такой композиции нет в списке\n");
        }
    }

    /**
     * Метод для получения текущей композиции.
     * @return возвращает текущую композицию.
     * @see Song
     */
    public Song getSong() {
        return (songs.get(index));
    }

    /**
     * Метод для добавления композиции в список.
     * Композиция добавляется в конец списка.
     * @param song - добавляемая композиция.
     * @see Song
     */
    public void addSong(Song song) {
        songs.add(song);
    }

    /**
     * Метод для удаления композиции.
     * Удаляется текущая композиция.
     */
    public void removeSong() {
        songs.remove(index);
        previousSong();
    }

    @Override
    public String toString() {
        return "Список композиций";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof SongList)) {
            return false;
        }
        SongList other = (SongList) obj;
        return this.songs.equals(other.songs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }
}