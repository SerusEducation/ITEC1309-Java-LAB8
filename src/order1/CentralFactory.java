package order1;

public class CentralFactory extends OEMFactory {

	CentralFactory() {
		System.out.println("Central Factory has created!");
	}
	
	@Override
	Chicken createChicken() {
		// TODO Auto-generated method stub
		return new BoiledChicken();
	}

	@Override
	Dip createDip() {
		// TODO Auto-generated method stub
		return new SpicyDip();
	}

	@Override
	Chip createChip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

}
