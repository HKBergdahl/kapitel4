
public class AddMeth {

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
		sportscar.mpg = 12;
		
		System.out.print("Minivan can carry " + minivan.passengers + ". ");
		
		minivan.range();
		
		System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
		
		sportscar.range();

	}

}
