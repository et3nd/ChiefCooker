package vegetables;

import makesalad.Salad;

import java.util.ArrayList;
import java.util.List;

public abstract class Vegetable {

    // Разновидность
    private final String kindOf;
    // Вес добавляемого овоща в граммах
    private final int weight;
    // Калорийность овоща, ккал
    private final int calorie;
    // Сумма овощей в салате
    private static int calorieCounting;

    private static List<Vegetable> vegetableSalad = Salad.makeSalad(new ArrayList<>());

    // Суммарная калорийность
    private static void calorieCounting() {
        System.out.println("Суммарная калорийность " + calorieCounting + " ккал");
    }

    // Геттер, использующий обёртку и возвращающий значение веса
    public Integer getWeight() {
        return weight;
    }

    public int getCalorie() {
        return calorie;
    }

    public String getKindOf() {
        return kindOf;
    }

    // Конструктор базового класса


    Vegetable(final String kindOf, final int weight, final int calorie) {
        this.kindOf = kindOf;
        this.weight = weight;
        this.calorie = calorie;
        calorieCounting += calorie;
    }

    public static void realize() {
        calorieCounting();
        Salad.lookingForVegetablesByCalories(vegetableSalad);
        Salad.sortsByWeight(vegetableSalad);
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return kindOf + ": " +
                "вес = " + weight +
                " грамм, калорийность = " + calorie +
                " ккал";
    }


}
