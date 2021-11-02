package com.company;

/**
 * Интерфейс реализации возможности проигрывания виниловой пластинки.
 */
public interface PlayVinyl {
    /**
     * Метод для проигрывания композиции.
     * @param vinyl - носитель виниловая пластинка.
     * @see Vinyl
     */
    public void play(Vinyl vinyl);
}