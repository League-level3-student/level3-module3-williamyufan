package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal> farm=new ArrayList<Animal>();
	farm.add(new Dog());
	farm.add(new Cow());
	farm.add(new Cat());
	farm.add(new Pig());
	farm.add(new Cow());
	farm.add(new Dog());
	
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).makeNoise();
	}
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).Eat();
	}
}
}
