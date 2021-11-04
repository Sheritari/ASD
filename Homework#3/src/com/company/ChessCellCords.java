package com.company;

import java.util.Objects;

/**
 * Класс, реализующий координаты клетки шахматной доски
 */
public class ChessCellCords {
    //Номер клетки поля по горизонтали
    private int x;

    //Номер клетки поля по вертикали
    private int y;

    /**
     * Конструктор по умолчанию.
     */
    ChessCellCords() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Конструктор от двух аргументов.
     * В случае неверно введённых параметров бросается исключение IllegalArgumentException.
     * @param x - номер клетки поля по горизонтали.
     * @param y - номер клетки поля по вертикали.
     */
    ChessCellCords(int x, int y) throws IllegalArgumentException {
        if ((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException("Указана позиция за границами доски");
        }
    }

    /**
     * Метод для получения номера клетки поля по горизонтали.
     * @return x возвращает номер клетки поля по горизонтали.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Метод для получения номера клетки поля по вертикали.
     * @return y возвращает номер клетки поля по вертикали.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Метод для установки номера клетки поля по горизонтали.
     * В случае неверно введённого значения бросается исключение IllegalArgumentException.
     * @param x - номер клетки поля по горизонтали.
     */
    public void setX(int x) throws IllegalArgumentException {
        try{
            if (x >= 0 && x <= 7) {
                this.x = x;
            } else {
            throw new IllegalArgumentException("Указана позиция за границей доски");
        }
    }

    /**
     * Метод для установки номера клетки поля по вертикали.
     * В случае неверно введённого значения бросается исключение IllegalArgumentException.
     * @param y - номер клетки поля по вертикали.
     */
    public void setY(int y) throws IllegalArgumentException {
        if (y >= 0 && y <= 7) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Указана позиция за границей доски");
        }
    }

    /**
     * Метод для установки номера клетки поля по горизонтали и вертикали.
     * В случае неверно введённого значения бросается исключение IllegalArgumentException.
     * @param x - номер клетки поля по горизонтали.
     * @param y - номер клетки поля по вертикали.
     */
    public void setXY(int x, int y) throws IllegalArgumentException {
        if ((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException("Указана позиция за границами доски");
        }
    }

    @Override
    public String toString() {
        return String.format("%c%d",'a' + y, x + 1);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof ChessCellCords)) {
            return false;
        }
        ChessCellCords other = (ChessCellCords) obj;
        return this.getX() == other.getX() && this.getY() == other.getY();
    }

    @Override
    public int hashCode(){
        return Objects.hash(this);
    }
}
