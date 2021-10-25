package Croc;

/**
 * Homework #2
 *
 *
 * @author Severgin Andrey (Sheritari)
 */

public class MusicSystem {
    public static void main(String[] args) {
        //Проверка виниловой вертушки
        Song[] classicMusic = new Song[4];
        classicMusic[0] = new Song("Клод Дебюсси", "Цыганский танец");
        classicMusic[1] = new Song("Густав Малер", "Симфония №1");
        classicMusic[2] = new Song("Прокофьев Сергей Сергеевич", "Симфония №2");
        classicMusic[3] = new Song("Петя и волк");

        Carrier vinyl = new Carrier("Пластинка", classicMusic);
        Device vinylTurntable = new Device("Виниловая вертушка", "Пластинка", vinyl);

        vinylTurntable.play();
        vinylTurntable.play("Петя и волк");
        vinylTurntable.setCondition(true);
        vinylTurntable.play();
        vinylTurntable.play("Петя и волк");
        vinylTurntable.play("Петя");
        vinylTurntable.play();
        vinylTurntable.setCondition(false);
        vinylTurntable.play();

        //Переход к проверке сд-проигрывателя
        System.out.println("---------------------------------------------------------------------------------------\n");

        Song[] hiphopMusic = new Song[2];
        hiphopMusic[0] = new Song("ATL", "Звездный лорд");
        hiphopMusic[1] = new Song("ATL", "Космонавт");

        Carrier cd = new Carrier("Сд", hiphopMusic);
        Device cdPlayer = new Device("Сд-проигрыватель", "Сд", cd);

        cdPlayer.setCondition(true);
        cdPlayer.play();
        cdPlayer.setCarrier(vinyl);
        cdPlayer.play();
        cdPlayer.play("Звездный лорд");
        cdPlayer.setCondition(false);
        cdPlayer.play();

        //Переход к проверке универсального плеера
        System.out.println("---------------------------------------------------------------------------------------\n");

        Song[] rock = new Song[1];
        rock[0] = new Song("Rammstein", "Du hast");

        Carrier flashDrive = new Carrier("Флеш накопитель", rock);
        Device universalPlayer = new Device("Универсальный плеер", "Флеш накопитель", flashDrive);

        universalPlayer.setCondition(true);
        universalPlayer.play();
        universalPlayer.play();
    }
}