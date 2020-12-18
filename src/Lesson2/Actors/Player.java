package Lesson2.Actors;

import Lesson2.Tools.Rock;
import Lesson2.Tools.Tool;

public class Player extends Actor {
    private String name;
    private double energy; // 1.2, 1.3124, 24.51
    private int health; /// 1,2,3,4,5,
    private Tool tool;
    private Perks perk;


    public Player(String playerName, Sex playerSex) {
        this.name = playerName;
        if (playerSex == Sex.Female) {
            this.energy = 120;
            this.health = 60;
            this.perk = Perks.Weak;
        } else {
            this.perk = Perks.PowerFull;
            this.energy = 90;
            this.health = 110;
        }
        this.tool = new Rock();
    }

    public void setEnergy(double energy) {
        if (this.perk == Perks.PowerFull) {
            this.energy += (energy * 0.8);
        } else if (this.perk == Perks.Weak) {
            this.energy += (energy * 1.2);
        } else {
            // 90 + -5 = 85
            this.energy += energy;
        }
    }

    public double getEnergy() {
        return energy;
    }

    public void setTool(Tool tool) {
        if (this.tool != null) { // если у актера уже есть предмет
            this.tool.drop(this); // выбросить этот предмет
        }
        this.tool = tool;
    }
}
