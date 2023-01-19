package order1;

public class Factory {
	private Chicken chicken;
	private Dip dip;
	private Chip chip;
	
	/*
	 * create concreteProduct followed by concreteFactory
	 */
	public Factory(OEMFactory oemFactory) {
		chicken = oemFactory.createChicken();
		dip = oemFactory.createDip();
		chip = oemFactory.createChip();
	}
	
	/*
	 * show productType followed by concreteFactory
	 */
	public void getProductType() {
		System.out.println("This chicken is " + chicken.getChickenType());
		System.out.println("This dip is " + dip.getDipType());
		System.out.println("This chip is " + (chip == null ? "sold out" : chip.getChipType()));
	}
}
