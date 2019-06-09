package vegetables;

import makesalad.Salad;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public abstract class Vegetable {

    ResourceBundle res = ResourceBundle.getBundle("vegetables.vegetable");
    // Разновидность
    String kindOf;
    // Вес добавляемого овоща в граммах
    int weight;
    // Калорийность овоща, ккал
    int calorie;
    // Сумма овощей в салате
    static int calorieCounting;

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
    Vegetable() {
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
