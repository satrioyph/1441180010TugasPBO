public class Mobil{
	//Kecepatan
	//posisi
	//plat nomer
	//merk
	//warna
	//mesin
	private double speed;
	private String posisi;
	private String plat;
	private String merk;
	private String warna;
	private double mesin;

	public Mobil()
	{
		speed = 210;
		posisi = "Sirkuit Sentul";
		plat = "W 3312 IO";
		merk = "BMW i8";
		warna = "HItam";
		mesin = 5500;
	}


	public Mobil(double speedInput, String posisiInput, String platInput, String merkInput, String warnaInput, double mesinInput)
	{
		speed = speedInput;
		posisi = posisiInput;
		plat = platInput;
		merk = merkInput;
		warna = warnaInput;
		mesin = mesinInput;
	}

	public void maju()
	{
		System.out.println("maju bosku");
	}

	public void mundur()
	{
		System.out.println("ati ati nutul");
	}

	public void berhenti()
	{
		System.out.println("oke siip");
	}

	public void belok()
	{
		System.out.println("kanan kiri kulihat saja");
	}

	public void ngebut()
	{
		System.out.println("blow engine");
	}

	public void ngerem()
	{
		System.out.println("ngempot bosku");
	}
	//getter
	public double getSpeed()
	{
		return speed;
	}

	public String getPosisi()
	{
		return posisi;
	}

	public String getPlat()
	{
		return plat;
	}

	public String getMerk()
	{
		return merk;
	}

	public String getWarna()
	{
		return warna;
	}

	public double getMesin()
	{
		return mesin;
	}
	//setter
	public void setSpeed(double s)
	{
		speed = s;
	}

	public void setPosisi(String p)
	{
		posisi = p;
	}

	public void setPlat(String pl)
	{
		plat = pl;
	}

	public void setMerk(String m)
	{
		merk = m;
	}

	public void setWarna(String w)
	{
		warna = w;
	}

	public void setMesin(double ms)
	{
		mesin = ms;
	}



}