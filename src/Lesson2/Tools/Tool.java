package Lesson2.Tools;

import Lesson2.Actors.Actor;

abstract public class Tool {
    protected double WEIGHT; // константы всегда пишуться большыми буквы
    public void drop(Actor actor) {
        actor.setEnergy(-this.WEIGHT); // мы списываем у актера энергию
    }

    public void pickUp(Actor actor) {
        actor.setTool(this); // мы передали себя целиком
    }
}
