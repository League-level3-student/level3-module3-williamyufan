package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		
		double taxMoney=population*growthRate;
		double totalMoney=taxMoney*(growthRate*2);
		return totalMoney;
	}

}
