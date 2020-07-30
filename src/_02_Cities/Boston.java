package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		
		double taxMoney=population*growthRate;
		double extraMoney=0.5*population;
		double totalMoney=taxMoney+extraMoney;
		return totalMoney;
	}

}
