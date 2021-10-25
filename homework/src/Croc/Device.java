package Croc;

import java.util.Objects;

/**
 * Класс воспроизводящего устройства.
 */
public class Device {
    //Носитель, с которого может воспроизводиться песня для данного устройства
    final String carrierPossible;

    private String deviceName;

    //Номер песни в массиве
    private int id = 0;

    //Носитель, который передается в качестве используемого
    private Carrier carrier;

    //Состояние устройства(False - выключено, True - может воспроизводить)
    private boolean condition = false;

    /**
     * Конструктор от трех аргументов.
     * @param deviceName - название устройства воспроизведения.
     * @param carrierPossible - название носителя, с которого может воспроизводиться песня для данного устройства.
     * @param carrier - объект класса Carrier, который передается в качестве используемого.
     */
    public Device(String deviceName, String carrierPossible, Carrier carrier) {
        this.deviceName = deviceName;
        this.carrier = carrier;
        this.carrierPossible = carrierPossible;
    }

    /**
     * Метод для получения названия воспроизводящего устройства.
     * @return возвращает название устройства.
     */
    public String getDevice() {
        return this.deviceName;
    }

    /**
     * Метод, устанавливающий название устройства воспроизведения.
     * @param deviceName - новое название устройства воспроизведения.
     */
    public void setDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * Метод для получения объекта класса Carrier (носителя, который передается в качестве используемого).
     * @return возвращает объект класса Carrier.
     */
    public Carrier getCarrier() {
        return this.carrier;
    }

    /**
     * Метод, устанавливающий объект класса Carrier.
     * @param carrier - новый объект класса Carrier, который передается в качестве используемого.
     */
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    /**
     * Метод для получения текущего состояния воспроизводящего устройства.
     * @return возвращает состояние воспроизводящего устройства.
     */
    public String getCondition() {
        return this.condition ? "Устройство сейчас работает" : "Устройство сейчас не работает";
    }

    /**
     * Метод, устанавливающий текущее состояние воспроизводящего устройства.
     * @param condition - новое состояние устройства(False - выключено, True - может воспроизводить).
     */
    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    /**
     * Метод, проигрывающий музыку в порядке очереди в массиве.
     * При достижении конца массива, номер песни меняется на 0 (то есть на первую песню в массиве).
     */
    public void play() {
        if (!this.condition) {
            System.out.println("Устройство воспроизведения \"" + this.deviceName + "\" выключено\n");
        } else if (!this.carrier.carrierName.equals(this.carrierPossible)) {
            System.out.println("Данный носитель информации не подходит к этому устройству воспроизведения\n");
        } else {
            if (this.id >= this.carrier.song.length) {
                this.id = 0;
            }
            System.out.println("На устройстве \"" + this.deviceName + "\" сейчас воспроизводится: \n" + this.carrier.song[this.id]);
            this.id++;
        }
    }

    /**
     * Метод, проигрывающий музыку, название которой указывает пользователь.
     * @param nameSong - название песни, которую пользователь хочет включить.
     */
    public void play(String nameSong) {
        if (!this.condition) {
            System.out.println("Устройство воспроизведения \"" + this.deviceName + "\" выключено\n");
        } else if (!this.carrier.carrierName.equals(this.carrierPossible)) {
            System.out.println("Данный носитель информации не подходит к этому устройству воспроизведения");
        } else {
            boolean flag = false;
            for (int i = 0; i < carrier.song.length; i++) {
                if (Objects.equals(nameSong, this.carrier.getSong()[i].getNameSong())) {
                    this.id = i;
                    flag = true;
                    System.out.println("На устройстве \"" + this.deviceName + "\" сейчас воспроизводится: \n" + this.carrier.song[this.id]);
                    break;
                }
            }
            if (!flag) {
                System.out.println("Данной песни нет на носителе!\n");
            }
            this.id++;
        }
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
        Device other = (Device) obj;
        if (!Objects.equals(this.getDevice(), other.getDevice())) {
            return false;
        }
        if (!Objects.equals(this.getCarrier(), other.getCarrier())) {
            return false;
        }
        return Objects.equals(this.getCondition(), other.getCondition());
    }

    /**
     * Метод для получения строкового представления объекта.
     * @return возвращает название воспроизводящего устройства.
     */
    public String toString() {
        return String.format("Проигрыватель: %s", this.deviceName);
    }
}
