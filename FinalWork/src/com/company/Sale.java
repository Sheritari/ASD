package com.company;

import java.time.*;
import java.util.Objects;

/**
 * Класс, реализующий тип данных "Продажа".
 */
public class Sale {

    // Номер продажи
    private int id;
    // Номер продавца
    private int sellerId;
    // Номер товара
    private int productId;
    // Количество проданных товаров
    private int quantityOfSold;
    // Дата продажи
    private LocalDate date;

    /**
     * Конструктор по умолчанию.
     */
    Sale() {
    }

    /**
     * Конструктор с параметрами.
     * @param id - номер продажи.
     * @param sellerId - номер продавца.
     * @param productId - номер товара.
     * @param quantityOfSold - количество проданных товаров.
     * @param date - объект класса LocalDate.
     */
    Sale(int id, int sellerId, int productId, int quantityOfSold, LocalDate date) {
        this.id = id;
        this.sellerId = sellerId;
        this.productId = productId;
        this.quantityOfSold = quantityOfSold;
        this.date = date;
    }

    /**
     * Копирующий конструктор.
     * @param sale - объект класса Sale.
     */
    Sale(Sale sale) {
        this.id = sale.getId();
        this.sellerId = sale.getSellerId();
        this.productId = sale.getProductId();
        this.quantityOfSold = sale.getQuantityOfSold();
        this.date = sale.getDate();
    }

    /**
     * Метод для получения номера продажи.
     * @return возвращает номер продажи.
     */
    public int getId() {
        return id;
    }

    /**
     * Метод для получения номера продавца.
     * @return возвращает номер продавца.
     */
    public int getSellerId() {
        return sellerId;
    }

    /**
     * Метод для получения номера товара.
     * @return возвращает номер товара.
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Метод для получения количества проданного товара.
     * @return возвращает количество проданного товара.
     */
    public int getQuantityOfSold() {
        return quantityOfSold;
    }

    /**
     * Метод для получения даты продажи.
     * @return возвращает объект LocalDate.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Метод для установки количества проданного товара.
     * @param quantity - количество проданного товара.
     */
    public void setQuantityOfSold(int quantity) {
        this.quantityOfSold = quantity;
    }

    /**
     * Метод для установки даты продажи.
     * @param date - объект класса LocalDate.
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Метод для установки номера продажи.
     * @param id - номер продажи.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод для установки номера продавца.
     * @param sellerId - номер продавца.
     */
    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Метод для установки номера товара.
     * @param productId - номер товара.
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return String.format("Sale id: %d%nSeller id: %d%nProduct id: %d%nQuantity of sold: %d%nDate: %s%n", this.id, this.sellerId, this.productId, this.quantityOfSold, this.date);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Sale)) {
            return false;
        }
        Sale other = (Sale) obj;
        if (!(this.getId() == other.getId())) {
            return false;
        } else if (!(this.getSellerId() == other.getSellerId())) {
            return false;
        } else if (!(this.getProductId() == other.getProductId())) {
            return false;
        }
        return this.getQuantityOfSold() == other.getQuantityOfSold();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sellerId, productId, quantityOfSold, date);
    }
}
