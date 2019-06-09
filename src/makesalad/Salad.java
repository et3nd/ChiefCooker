package makesalad;

import vegetables.Bellpepper;
import vegetables.Cucumber;
import vegetables.Tomato;
import vegetables.Vegetable;

import java.util.Comparator;
import java.util.List;

public class Salad {

    // Создаём массив овощей
    public static List<Vegetable> makeSalad(List<Vegetable> vegetableList) {
        System.out.println("Салат состоит из: ");
        vegetableList.add(new Tomato());
        vegetableList.add(new Bellpepper());
        vegetableList.add(new Cucumber());
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
