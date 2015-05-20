public class Segitiga {
	int tinggi;
	int alas;
	int sisiA;
	int sisiB;
	int sisiC;

	public void nilaiProperty() {
		System.out.println("Tinggi : " +tinggi);
		System.out.println("Alas   : " +alas);
		System.out.println("SisiA  : " +sisiA);
		System.out.println("SisiB  : " +sisiB);
		System.out.println("SisiC  : " +sisiC);
	}
	public void ubahProperty(int tinggiInput, int alasInput, int sisiAInput, int sisiBInput, int sisiCInput){
		tinggi = tinggiInput;
		alas = alasInput;
		sisiA = sisiAInput;
		sisiB = sisiBInput;
		sisiC = sisiCInput;
	}
	public int hitungLuas(){
		int luas;
		luas = (alas * tinggi) / 2;
		return luas;
	}
	public int hitungKeliling(){
		int keliling;
		keliling =  sisiA + sisiB + sisiC;
		return keliling;
	}
}