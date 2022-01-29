package homework;

import java.util.stream.Collectors;

public class StreamSorter {

	public static void main(String[] args) {
		
		String output = Food.getFoods().stream().map((food) -> food.toString()).sorted().collect(Collectors.joining(", "));
		System.out.println(output);

	}

	

}
