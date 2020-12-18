package Lesson2;

import Lesson2.Actors.Actor;
import Lesson2.Actors.Player;
import Lesson2.Actors.Sex;
import Lesson2.Tools.Pole;
import Lesson2.Tools.Tool;

public class ActorsApp {
    public static void main(String[] args) {
        Actor player1 = new Player("Vanya", Sex.Female);
        Tool pole1 = new Pole();
        pole1.pickUp(player1);
    }
}
