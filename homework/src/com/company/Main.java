package com.company;

/**
 * Homework #2
 *
 *
 * @author Severgin Andrey (Sheritari)
 */

public class Main {
    public static void main(String[] args) {
        //Проверка виниловой вертушки и методов перехода из конца в начало списка,
        //и сохранения композиции при попытке переключиться на предыдущую композицию с первой в списке
        Song classicMusic1 = new Song("Клод Дебюсси", "Цыганский танец");
        Song classicMusic2 = new Song("Густав Малер", "Симфония №1");
        Song classicMusic3 = new Song("Прокофьев Сергей Сергеевич", "Симфония №2");
        Song classicMusic4 = new Song("Петя и волк");

        Vinyl vinyl = new Vinyl();
        VinylTurntable vt = new VinylTurntable();
        vinyl.getSongList().addSong(classicMusic1);
        vinyl.getSongList().addSong(classicMusic2);
        vinyl.getSongList().addSong(classicMusic3);
        vinyl.getSongList().addSong(classicMusic4);
        vt.play(vinyl);
        vt.playNext(vinyl);
        vt.play(vinyl);
        vt.playNext(vinyl);
        vt.play(vinyl);
        vt.playUserSong(vinyl,"Петя и волк");
        vt.play(vinyl);
        vt.playNext(vinyl);
        vt.play(vinyl);
        vt.playUserSong(vinyl, "Цыганский танец");
        vt.play(vinyl);
        vt.playUserSong(vinyl, "Петя");
        vt.playPrevious(vinyl);
        vt.play(vinyl);

        //Переход к проверке сд-проигрывателя и проверке воспроизведения с носителя, не подходящего данному устройству
        System.out.println("---------------------------------------------------------------------------------------\n");

        Song hiphopMusic1 = new Song("ATL", "Звездный лорд");
        Song hiphopMusic2 = new Song("ATL", "Космонавт");

        CD cd = new CD();
        CDplayer cdPlayer = new CDplayer();
        cd.getSongList().addSong(hiphopMusic1);
        cd.getSongList().addSong(hiphopMusic2);
        cdPlayer.play(cd);
        cdPlayer.play(vinyl);
        cdPlayer.playUserSong(cd,"Космонавт");
        cdPlayer.play(cd);

        //Переход к проверке флеш-проигрывателя
        System.out.println("---------------------------------------------------------------------------------------\n");

        Song rock = new Song("Rammstein", "Du hast");

        FlashDrive flash = new FlashDrive();
        FlashDrivesPlayer flashPlayer = new FlashDrivesPlayer();
        flash.getSongList().addSong(rock);
        flashPlayer.play(flash);
        flashPlayer.playNext(flash);
        flashPlayer.play(flash);

        //Переход к проверке флеш-проигрывателя
        System.out.println("---------------------------------------------------------------------------------------\n");

        UniversalPlayer uPlayer = new UniversalPlayer();
        uPlayer.play(cd);
        uPlayer.play(vinyl);
        uPlayer.play(flash);
    }
}