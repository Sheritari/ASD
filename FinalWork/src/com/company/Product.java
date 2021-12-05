package com.company;

/**
 * Класс, реализующий тип данных "Товар".
 */
public class Product {

    // Номер товара
    private int id;
    // Название товара
    private String name;

    /**
     * Конструктор по умолчанию.
     */
    Product(){
    }

    /**
     * Конструктор с параметрами.
     * @param id - номер товара.
     * @param name - название товара.
     */
    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Копирующий конструктор.
     * @param product - объект класса Product.
     */
    Product(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }

    /**
     * Метод для получения номера товара.
     * @return возвращает номер товара.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Метод для получения названия товара.
     * @return возвращает название товара.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Метод для установки номера товара.
     * @param id - номер товара.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод для установки названия товара.
     * @param name - название товара.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Product id: %d%nProduct name: %s%n", this.id, this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        if (!(this.getId() == other.getId())) {
            return false;
        }
        return this.getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return id;
    }
}
