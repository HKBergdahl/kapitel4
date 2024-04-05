
public class TwoVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle minvan = new Vehicle(1,1,1);
		Vehicle sportscar = new Vehicle(1,1,1);
		
		int range1, range2;
		
		minvan.passengers = 7;
		minvan.fuelcap = 16;
		minvan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range1 = minvan.fuelcap * minvan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;
		
		System.out.println("Minvan can carry " + minvan.passengers +
				" with a range of " + range1);
		System.out.println("Sportscar can carry " + sportscar.passengers + 
				" with a range of " + range2);

	}

}
