public class TestBangun {
	public static void main(String[] args) {
		Segitiga bangunku = new Segitiga();
		Lingkaran punyaku = new Lingkaran();
		System.out.println("::: SEGITIGA :::");
		bangunku.tinggi = 12;
		bangunku.alas = 5;
		bangunku.sisiA = 7;
		bangunku.sisiB = 6;
		bangunku.sisiC = 5;

		bangunku.nilaiProperty();

		System.out.println("Luas : " +bangunku.hitungLuas());
		System.out.println("Keliling : "+bangunku.hitungKeliling());		

		System.out.println("\n");

		System.out.println("::: LINGKARAN :::");
		punyaku.jejari = 8;
		punyaku.nilaiProperty();

		System.out.println("Luas : " +punyaku.hitungLuasLingkaran());
		System.out.println("Keliling : "+punyaku.hitungKelilingLingkaran());
	}
}