package com.company;

import java.util.Objects;

/**
 * Класс, реализующий тип данных "Товар у продавца".
 */
public class SellerProduct {

    // Номер продавца
    int sellerId;
    // Номер товара
    int productId;
    // Цена товара
    int price;
    // Количество товара
    int quantity;

    /**
     * Конструктор по умолчанию.
     */
    SellerProduct() {
    }

    /**
     * Конструктор с параметрами.
     * @param sellerId - номер продавца.
     * @param productId - номер товара.
     * @param price - цена товара.
     * @param quantity - количество товара.
     */
    SellerProduct(int sellerId, int productId, int price, int quantity) {
        this.sellerId = sellerId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Копирующий конструктор.
     * @param sellerProduct - объект класса SellerProduct.
     */
    SellerProduct(SellerProduct sellerProduct) {
        this.sellerId = sellerProduct.getSellerId();
        this.productId = sellerProduct.getProductId();
        this.price = sellerProduct.getPrice();
        this.quantity = sellerProduct.getQuantity();
    }

    /**
     * Метод для получения номера продавца.
     * @return возвращает номер продавца.
     */
    public int getSellerId() {
        return this.sellerId;
    }

    /**
     * Метод для получения номера товара.
     * @return возвращает номер товара.
     */
    public int getProductId() {
        return this.productId;
    }

    /**
     * Метод для получения цены товара.
     * @return возвращает цену товара.
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Метод для получения количества товара.
     * @return возвращает количество товара.
     */
    public int getQuantity() {
        return this.quantity;
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

    /**
     * Метод для установки цены товара.
     * @param price - цена товара.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Метод для установки количества товара.
     * @param quantity - количество товара.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Seller id: %d%nProduct id: %d%nProduct price: %d%nProduct quantity: %d%n", this.sellerId, this.productId, this.price, this.quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SellerProduct)) {
            return false;
        }
        SellerProduct other = (SellerProduct) obj;
        return this.getSellerId() == other.getSellerId() && this.getProductId() == other.getProductId() && this.getPrice() == other.getPrice() && this.getQuantity() == other.getQuantity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerId, productId, price, quantity);
    }
}
