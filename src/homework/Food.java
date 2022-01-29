package homework;

import java.util.ArrayList;
import java.util.List;

public class Food {

private String name;

private static List<Food> foods = List.of(
		new Food("Burrito"),
		new Food("Taco"),
		new Food("Sushi"),
		new Food("Pizza")
		);

public static List<Food> getFoods() {
	return new ArrayList<>(foods);
}

public String getName() {
	return name;
}

@Override
public String toString() {
	return name + " dinner";
}

public Food(String name) {
	super();
	this.name = name;
}

public static int compare(Food food1, Food food2) {
	return food1.name.compareTo(food2.name);
	}
}
