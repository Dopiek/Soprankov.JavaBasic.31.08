import java.util.Scanner;

public class Action {
	Drinks drinks = new Drinks();

	public void choiceDrink() {
		for (int i = 0; i < DrinksMachine.values().length; i++) {
			for (int j = i; j < drinks.PRICE.length; j++) {
				System.out.println(DrinksMachine.values()[i] + " price " + drinks.PRICE[j] + " UAH");
				i++;
			}
		}

		System.out.print("\nChoice: ");
		String userChoice = scanner();

		drinks.makeDrink(userChoice);
		drinks.creatingCheque(userChoice);
		drinkMore();
	}

	public void drinkMore() {
		System.out.println("\nOne more? \n[Y] \n[N]");
		String userChoice = scanner();

		switch (userChoice) {
		case "Y" -> choiceDrink();
		case "N" -> System.out.println("\nCheque: " + drinks.cheque);
		default -> {
			System.out.println("Enter [Y] or [N]");
			drinkMore();
		}
		}
	}

	public String scanner() {
		return new Scanner(System.in).next().toUpperCase();
	}
}
