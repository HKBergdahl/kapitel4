
public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle minivan = new Vehicle(1,1,1);
		int range;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers +
				"with a range of " + range);
		
	}

}
