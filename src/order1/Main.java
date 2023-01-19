package order1;

public class Main {

	public static void main(String[] args) {
		/*
			OEMFactory cp = new CPFactory();
			Chicken friedChicken = cp.createChicken();
			System.out.println("This chicken is " + friedChicken.getChickenType());
			Dip sweetDip = cp.createDip();
			System.out.println("This dip is " + sweetDip.getDipType());
			
			OEMFactory central = new CentralFactory();
			Chicken boiledChicken = central.createChicken();
			System.out.println("This chicken is " + boiledChicken.getChickenType());
			Dip spicyDip = central.createDip();
			System.out.println("This dip is " + spicyDip.getDipType());
			
			OEMFactory bigC = new BigCFactory();
			Chicken spicyChicken = bigC.createChicken();
			System.out.println("This chicken is " + spicyChicken.getChickenType());
			Dip littleSweetDip = bigC.createDip();
			System.out.println("This dip is " + littleSweetDip.getDipType());
			Chip frenchFried = bigC.createChip();
			System.out.println("This chip is " + frenchFried.getChipType());
		 */
		
		Factory factory = new Factory(new CPFactory());
		factory.getProductType();
	}

}
