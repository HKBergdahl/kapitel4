
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ord1 = new String();
		String ord2 = new String();
		
		ord1 = "Ord1";
		System.out.println("ord1: " + ord1);
		
		ord2 = "Ord2";
		System.out.println("ord2: " + ord2);
		
		ord1=ord2;
		System.out.println("Efter ord1 = ord2");
		System.out.println("ord1: " + ord1 + "   ord2:" + ord2 + "\n");
		
		ord2 = "nytt ord2";
		
		System.out.println("Efter ord2 = \"nytt ord2\"");
		System.out.println("ord1: " + ord1 + "   ord2:" + ord2);
		
		
	}

}
