package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		
		double taxMoney=population*growthRate;
		double totalMoney=(growthRate/2)*taxMoney;
	
		return totalMoney;
	}
	
}
