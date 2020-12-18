package Lesson2.Tools;

public class Rock extends Tool{
    protected double WEIGHT = 5; // константы всегда пишуться большыми буквы
    private double durability;

    public Rock () {
        this.durability = 20 + Math.random() * 80; // число между 20 и 100(20 + 80)
    }
}
