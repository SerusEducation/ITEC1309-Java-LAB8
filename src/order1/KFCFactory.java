package order1;

public class KFCFactory extends OEMFactory {

	KFCFactory() {
		System.out.println("KFC Factory has created!");
	}
	
	@Override
	Chicken createChicken() {
		// TODO Auto-generated metabstract String getDipType();hod stub
		return new SaltyFriedChicken();
	}

	@Override
	Dip createDip() {
		// TODO Auto-generated method stub
		return new MediumSweetDip();
	}

	@Override
	Chip createChip() {
		// TODO Auto-generated method stub
		return new MashedPotatoes();
	}

	@Override
	Sauce createSauce() {
		// TODO Auto-generated method stub
		return new NoneSweetKetchup();
	}

}
