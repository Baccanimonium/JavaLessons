package Lesson1;

import org.jetbrains.annotations.NotNull;

// Поведением класса(программы)
public class Human {
    // Свойства
    private int age;
    private String name;
    private int height;
    private int weight;
    private Sex sex;

    // конец свойств

    // конструктор вызывается когда где либо пишут new Lesson1.Human() (инстациация объекта)
    public Human(int VOZRAST_CHELOVEKA, int SHIRINA, int VISOTA_CHELOVEKA, Sex gender, String givenName) {
        // МЫ конфигурируем уникальных людей,
        this.height = VISOTA_CHELOVEKA;
        this.weight = SHIRINA;
        this.age = VOZRAST_CHELOVEKA;
        this.sex = gender;
        this.name = givenName;
    }
    // конец конструктора


    // Методы
    public String getName() {
        return name;
    }

    // получение значие другими Классами
    public String getAge(@NotNull Human questionerHuman) {
        // если человек являться женщиной то она поделит свой возраст попалам
        if (questionerHuman.getName() == "Артём") {
            return "Мне".concat(Integer.toString(this.sex == Sex.Male ? age : age / 2)).concat("лет");
        } else {
            return "Не скажу";
        }
    }
    // конец методов
}
