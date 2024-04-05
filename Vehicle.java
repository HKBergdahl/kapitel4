
public class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}
	
	
	int range_return_int() {
		return mpg * fuelcap;
	}
	
	double fuelNeeded(int miles) {
		return (double) miles / mpg;
	}
}
