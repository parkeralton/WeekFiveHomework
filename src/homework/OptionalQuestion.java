package homework;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalQuestion {

	public static void main(String[] args) {
		methodB();
		
		
	}

	private static void methodB() {
		Food food = MethodA(Optional.of(new Food("Burrito")));
		System.out.println(food);
		try {
			MethodA(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static Food MethodA(Optional<Food> foodOptional) {
	return foodOptional.orElseThrow(() -> new NoSuchElementException("That is not a food!"));
	}

}
