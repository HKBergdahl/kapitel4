
public class DemoPwr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);
		
		System.out.println(x.b + " raised to the " + x.e + " power is " + x.getVal());
		System.out.println(y.b + " raised to the " + y.e + " power is " + y.getVal());
		System.out.println(z.b + " raised to the " + z.e + " power is " + z.getVal());

	}

}
