class mobil extends kendaraan {
	private int KecepatanMaks;
	private int JumlahRoda;

	kendaraan car = new kendaraan();

	public mobil(int InputKecepatanMaks, int InputBerat, int InputKapasitas, int InputJumlahRoda){
     KecepatanMaks = InputKecepatanMaks;
     Berat = InputBerat;
     Kapasitas = InputKapasitas;
     JumlahRoda = InputJumlahRoda;
    }

    public void cetakspesifikasi()
    {
      System.out.println("Kecepatan Maks Kendaraan :"+car.getKecepatanMaks());
      System.out.println("Kecepatan Maks Mobil :"+KecepatanMaks);
      System.out.println("Berat Mobil :"+Berat);
      System.out.println("Kapasitas Mobil :"+Kapasitas);
      System.out.println("Jumlah Roda Mobil :"+JumlahRoda);
    }

    public void Jalankan(int Kecepatan)
    {
    	System.out.println("Mobil dijalankan dengan kecepatan "+Kecepatan);
    }
}