
public class RetMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle minivan = new Vehicle(1,1,1);
		Vehicle sportscar = new Vehicle(1,1,1);
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 21;
		
		range1 = minivan.range_return_int();
		range2 = sportscar.range_return_int();
		
		System.out.println("Minivan car carry " + minivan.passengers +
				" with a range of " + range1 + " Miles.");
		
		System.out.println("Sportscar can carry " + sportscar.passengers +
				" with a range of " + range2 + " Miles.");

	}

}
