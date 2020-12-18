package Lesson1;

import Lesson1.Human;

public class main {
    public static void main(String[] args) {
        Human firstHuman = new Human(61, 90, 180, Sex.Female, "BABYSHKA");
        Human second = new Human(61, 90, 180, Sex.Male, "Артём");
        Human third = new Human(61, 90, 180, Sex.Male, "ДЕдушка");

        System.out.printf(firstHuman.getAge(second));

        System.out.printf(third.getAge(firstHuman));

    }
}

