package com.company;

import java.util.Objects;

/**
 * Класс, реализующий тип данных "Продавец".
 */
public class Seller {

    // Номер продавца
    private int id;
    // Фамилия продавца
    private String surname;
    // Имя продавца
    private String name;

    /**
     * Конструктор по умолчанию.
     */
    Seller() {
    }

    /**
     * Конструктор с параметрами.
     * @param id - номер продавца.
     * @param surname - фамилия продавца.
     * @param name - имя продавца.
     */
    Seller(int id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    /**
     * Копирующий конструктор.
     * @param seller - объект класса Seller.
     */
    Seller(Seller seller) {
        this.id = seller.getId();
        this.surname = seller.getSurname();
        this.name = seller.getName();
    }

    /**
     * Метод для получения номера продавца.
     * @return возвращает номер продавца.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Метод для получения фамилии продавца.
     * @return возвращает фамилию продавца.
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Метод для получения имени продавца.
     * @return возвращает имя продавца.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Метод для установки номера продавца.
     * @param id - номер продавца.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод для установки фамилии продавца.
     * @param surname - фамилия продавца.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Метод для установки имени продавца.
     * @param name - имя продавца.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Seller id: %d%nSeller surname: %s%nSeller name: %s%n", this.id, this.surname, this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Seller)) {
            return false;
        }
        Seller other = (Seller) obj;
        if (!this.getName().equals(other.getName())) {
            return false;
        }
        if (!(this.getId() == other.getId())) {
            return false;
        }
        return this.getSurname().equals(other.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name);
    }
}
