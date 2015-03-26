public class sembilan{
	public static void main(String[] args) {
		int a;
		for (a=1;a<111;a++) {
			if (a%5==0) {
				System.out.print("JONI");
			}
			else {
				System.out.print(a+" ");
			}
			if (a%11==0) {
				System.out.println("\n");
			}
		}
	}
}