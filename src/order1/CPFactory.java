package order1;

public class CPFactory extends OEMFactory {

	CPFactory() {
		System.out.println("CP Factory has created!");
	}
	
	@Override
	Chicken createChicken() {
		// TODO Auto-generated method stub
		return new FriedChicken();
	}

	@Override
	Dip createDip() {
		// TODO Auto-generated method stub
		return new SweetDip();
	}

	@Override
	Chip createChip() {
		// TODO Auto-generated method stub
		return null;
	}

}
