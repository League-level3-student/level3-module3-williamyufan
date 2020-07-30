package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		
		double taxMoney=population*growthRate;
		double totalMoney=taxMoney+1000000;
		
		return totalMoney;
	}
}
