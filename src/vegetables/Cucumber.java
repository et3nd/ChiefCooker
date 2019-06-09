package vegetables;

public class Cucumber extends Vegetable {

    public Cucumber() {
        kindOf = res.getString("cucumber");
        weight = Integer.parseInt(res.getString("cucumberWeight"));
        calorie = Integer.parseInt(res.getString("cucumberCalories"));
        calorieCounting += calorie;
    }
}
