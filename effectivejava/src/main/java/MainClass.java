import pattern2.builder.NutritionFacts;
import pattern3.singleton.Elvis;

public class MainClass {
    public static void main(String[] args) {
        NutritionFacts cocaCola =
                new NutritionFacts.Builder(240, 8).calories(3).fat(55).carbohydrate(30).build();

    }
}
