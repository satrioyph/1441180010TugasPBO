public class Tabungan{
	//Simpanan
	//Pem. Rek
	//No. Rek
	//Bunga
	private double simpanan;
	private String pemRek;
	private double noRek;
	private float bunga;

	public Tabungan()
	{
		simpanan = 1000000;
		pemRek   = "satrio";
		noRek    = 1441180010;
		bunga    = 10;
	}

	public Tabungan(double simpananInput, String pemRekInput)
	{
		simpanan = simpananInput;
		pemRek   = pemRekInput;
	}

	public Tabungan(double simpananInput, String pemRekInput, double noRekInput)
	{
		simpanan = simpananInput;
		pemRek   = pemRekInput;
		noRek    = noRekInput;
	}

	public Tabungan(double simpananInput, String pemRekInput, double noRekInput, int bungaInput)
	{
        simpanan = simpananInput;
		pemRek   = pemRekInput;
		noRek    = noRekInput;
		bunga    = bungaInput;
	}

	public void menabung()
	{
		System.out.println("Anda telah Menabung Sebesar : " + 321000 );
	}

	public void mengambil()
	{
		System.out.println("Anda telah Menarik Tunai sebesar : "+ 515000);
	}

	public void transfer()
	{
		System.out.println("Anda telah Mentransfer Sebesar : "+ 453000);
	}

	public void menerimaTransfer()
	{
		System.out.println("Anda telah Menerima Transfer : " + 453000);
	}

	public void cekSaldo()
	{
		System.out.println("Saldo Anda Sebesar : "+ getSimpanan());
	}
	//getter
	public double getSimpanan()
	{
		return simpanan;
	}
	public String getPemRek()
	{
		return pemRek;
	}
	public double getNoRek()
	{
		return noRek;
	}
	public float getBunga()
	{
		return bunga;
	}
	//setter
	public void setSimpanan(double s)
	{
		simpanan = s;
	}

	public void setPemRek(String p)
	{
		pemRek = p; 
	}

	public void setNoRek(double n)
	{
		noRek = n;
	}
	public void setBunga(int b)
	{
		bunga = b;
	}

}

	
