package makesalad;

import vegetables.Bellpepper;
import vegetables.Cucumber;
import vegetables.Tomato;
import vegetables.Vegetable;

import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

public class Salad {

    private static ResourceBundle res = ResourceBundle.getBundle("vegetables.vegetable");

    // Создаём массив овощей
    public static List<Vegetable> makeSalad(List<Vegetable> vegetableList) {
        System.out.println("Салат состоит из: ");
        vegetableList.add(new Tomato(res.getString("tomato"),
                Integer.parseInt(res.getString("tomatoWeight")),
                Integer.parseInt(res.getString("tomatoCalories"))));
        vegetableList.add(new Bellpepper(res.getString("bellpepper"),
                Integer.parseInt(res.getString("bellpepperWeight")),
                Integer.parseInt(res.getString("bellpepperCalories"))));
        vegetableList.add(new Cucumber(res.getString("cucumber"),
                Integer.parseInt(res.getString("cucumberWeight")),
                Integer.parseInt(res.getString("cucumberCalories"))));
        printSalad(vegetableList);
        return vegetableList;
    }

    // Печаталка
    private static void printSalad(List<Vegetable> vegetableList) {
        for (Vegetable vegetable : vegetableList) {
            System.out.println(vegetable);
        }
    }

    // Метод ищет овощи по диапазону калорийности
    public static void lookingForVegetablesByCalories(List<Vegetable> vegetableList) {
        System.out.println("Произведём проверку овощей по калорийности в диапазоне:");
        for (Vegetable vegetable : vegetableList) {
            if (vegetable.getCalorie() >= 10 && vegetable.getCalorie() <= 20) {
                System.out.println(vegetable.getKindOf() + " имеет калорийность в диапазоне от 10 до 20 ккал");
            }
        }
    }

    // Сортировка по весу
    public static void sortsByWeight(List<Vegetable> vegetableList) {
        System.out.println("Произведём сортировку овощей по весу в порядке возрастания:");
        vegetableList.sort(Comparator.comparing(Vegetable::getWeight));
        printSalad(vegetableList);
    }
}
