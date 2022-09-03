enum DrinksMachine {
	COFFEE, TEA, LEMONADE, MOJITO, MINERAL, COCACOLA
}

class Drinks {
	final int[] PRICE = { 50, 40, 30, 45, 25, 35 };
	int cheque = 0;

	public void makeDrink(String userChoice) {
		DrinksMachine drink = DrinksMachine.valueOf(userChoice);
		System.out.println("Make " + drink.name().toLowerCase() + "...");
	}

	public void creatingCheque(String userChoice) {	
		switch (DrinksMachine.valueOf(userChoice)) {
		case COFFEE -> cheque += PRICE[0];
		case TEA -> cheque += PRICE[1];
		case LEMONADE -> cheque += PRICE[2];
		case MOJITO -> cheque += PRICE[3];
		case MINERAL -> cheque += PRICE[4];
		case COCACOLA -> cheque += PRICE[5];
		}
		System.out.println("Cheque: " + cheque);
	}
}

class VendingMain {
	public static void main(String[] args) {
		Action action = new Action();
		action.choiceDrink();
	}
}


