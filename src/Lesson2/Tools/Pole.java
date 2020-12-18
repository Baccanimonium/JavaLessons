package Lesson2.Tools;

public class Pole extends Tool{
    protected double WEIGHT = 25; // константы всегда пишуться большыми буквы
    private double durability;

    public Pole () {
        this.durability = 60 + Math.random() * 40; // число между 20 и 100(20 + 80)
    }
}
