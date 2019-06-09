package vegetables;

public class Bellpepper extends Vegetable {

    public Bellpepper() {
        kindOf = res.getString("bellpepper");
        weight = Integer.parseInt(res.getString("bellpepperWeight"));
        calorie = Integer.parseInt(res.getString("bellpepperCalories"));
        calorieCounting += calorie;
    }
}
