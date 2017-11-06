package KFUBuilder;

import java.util.ArrayList;

public class FoofMeal {

	private static ArrayList<String> foods = new ArrayList<>();

    public static void add(String food) {
        foods.add(food);
    }

    public static void show(){
        for (String food : foods) {
            System.out.println("Ñ¡ÔñµÄÌ×²Í"+food);
        }
    }
}
