package order1;

public class BigCFactory extends OEMFactory {

	BigCFactory() {
		System.out.println("BigC Factory has created!");
	}
	
	@Override
	Chicken createChicken() {
		// TODO Auto-generated metabstract String getDipType();hod stub
		return new SpicyFriedChicken();
	}

	@Override
	Dip createDip() {
		// TODO Auto-generated method stub
		return new LittleSweetDip();
	}

	@Override
	Chip createChip() {
		// TODO Auto-generated method stub
		return new FranchFried();
	}

	@Override
	Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

}
