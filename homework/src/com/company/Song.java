package com.company;

import java.util.Objects;

/**
 * Класс композиции.
 */
public class Song {
    private String namePerformer;

    private String nameSong;

    /**
     * Конструктор по умолчанию.
     */
    public Song() {
        this.namePerformer = "Indefinite";
        this.nameSong = "Indefinite";
    }

    /**
     * Конструктор от одного аргумента.
     * @param nameSong - название композиции.
     */
    public Song(String nameSong) {
        this.namePerformer = "Indefinite";
        this.nameSong = nameSong;
    }

    /**
     * Конструктор от двух аргументов.
     * @param namePerformer - имя исполнителя.
     * @param nameSong - название композиции.
     */
    public Song(String namePerformer, String nameSong) {
        this.namePerformer = namePerformer;
        this.nameSong = nameSong;
    }

    /**
     * Метод для получения имени исполнителя.
     * @return возвращает имя исполнителя.
     */
    public String getNamePerformer() {
        return this.namePerformer;
    }

    /**
     * Метод, устанавливающий имя исполнителя.
     * @param nameP - новое имя исполнителя.
     */
    public void setNamePerformer(String nameP) {
        this.namePerformer = nameP;
    }

    /**
     * Метод для получения названия композиции.
     * @return возвращает название композиции.
     */
    public String getNameSong() {
        return this.nameSong;
    }

    /**
     * Метод, устанавливающий название композиции.
     * @param nameS - новое название композиции.
     */
    public void setNameSong(String nameS) {
        this.nameSong = nameS;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Song)) {
            return false;
        }
        Song other = (Song) obj;
        if (!Objects.equals(this.getNameSong(), other.getNameSong())) {
            return false;
        }
        return Objects.equals(this.getNamePerformer(), other.getNamePerformer());
    }

    @Override
    public String toString() {
        return String.format("Исполнитель: %s%nНазвание песни: \"%s\"%n", this.namePerformer, this.nameSong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }
}
