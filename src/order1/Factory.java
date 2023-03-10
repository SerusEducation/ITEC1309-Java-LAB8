package order1;

public class Factory {
	private Chicken chicken;
	private Dip dip;
	private Chip chip;
	private Sauce sauce;
	
	/*
	 * create concreteProduct followed by concreteFactory
	 */
	public Factory(OEMFactory oemFactory) {
		chicken = oemFactory.createChicken();
		dip = oemFactory.createDip();
		chip = oemFactory.createChip();
		sauce = oemFactory.createSauce();
	}
	
	/*
	 * show productType followed by concreteFactory
	 */
	public void getProductType() {
		System.out.println("This chicken is " + chicken.getChickenType());
		System.out.println("This dip is " + dip.getDipType());
		if (chip != null) {
			System.out.println("This chip is " + chip.getChipType());
		}
		if (sauce != null) {
			System.out.println("This sauce is " + sauce.getSauceType());
		}
		System.out.println("------------------------------------------");
	}
}
