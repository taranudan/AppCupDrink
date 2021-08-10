
public class Aplication {

	public static void main(String[] args) {
		Cup.printInfo();
		Cup.Drink.printInfo();

	}
}

class Cup {
	static int volume_ml = 500;	
	static int fill = 100 * Drink.volume_ml/volume_ml;
	
	static void printInfo ( ) {
		System.out.println("==================================");
		if (fill>99 || Drink.volume_ml < 0) {
			System.out.println("Wrong content volume");
		}
		else {
			System.out.printf("Cup  (volume: %3d  ml,  fill: %2d )\n", volume_ml, fill);
		}		
		System.out.println("==================================");
	}
	
	static class Drink {		
		static String name = "Tea";
		static int volume_ml = 250;
		
		static void printInfo ( ) {
			System.out.printf(" - Drink: %3s -\n", name);
		}
	}
}