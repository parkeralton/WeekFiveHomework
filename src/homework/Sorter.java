package homework;

import java.util.List;

public class Sorter {

	public static void main(String[] args) {
		List<Food> foodTypes = foodSorter();
		System.out.println(foodTypes);
		
		List<Food> methodRefFoods = methodSort();
		System.out.println(methodRefFoods);
	}

	private static List<Food> methodSort() {
		List<Food> sortFoods = Food.getFoods();
		sortFoods.sort(Food::compare);
		return sortFoods;
	}

	private static List<Food> foodSorter() {
		List<Food> sortFoods = Food.getFoods();
		sortFoods.sort((food1, food2) -> Food.compare(food1, food2));
		return sortFoods;
	}

}
