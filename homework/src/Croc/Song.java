package Croc;

import java.util.Objects;

/**
 * Класс песни.
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
     * @param nameS - название песни.
     */
    public Song(String nameS) {
        this.namePerformer = "Indefinite";
        this.nameSong = nameS;
    }

    /**
     * Конструктор от двух аргументов.
     * @param nameP - имя исполнителя.
     * @param nameS - название песни.
     */
    public Song(String nameP, String nameS) {
        this.namePerformer = nameP;
        this.nameSong = nameS;
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
     * Метод для получения названия песни.
     * @return возвращает название песни.
     */
    public String getNameSong() {
        return this.nameSong;
    }

    /**
     * Метод, устанавливающий название песни.
     * @param nameS - новое название песни.
     */
    public void setNameSong(String nameS) {
        this.nameSong = nameS;
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
        Song other = (Song) obj;
        if (!Objects.equals(this.getNameSong(), other.getNameSong())) {
            return false;
        }
        return Objects.equals(this.getNamePerformer(), other.getNamePerformer());
    }

    /**
     * Метод для получения строкового представления объекта.
     * @return возвращает имя исполнителя и название песни.
     */
    public String toString() {
        return String.format("Исполнитель: %s%nНазвание песни: \"%s\"%n", this.namePerformer, this.nameSong);
    }
}
