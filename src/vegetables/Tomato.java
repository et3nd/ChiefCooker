package vegetables;

public class Tomato extends Vegetable {


    public Tomato() {
        kindOf = res.getString("tomato");
        weight = Integer.parseInt(res.getString("tomatoWeight"));
        calorie = Integer.parseInt(res.getString("tomatoCalories"));
        calorieCounting += calorie;
    }

}
