class TestLaptop{
	public static void main(String[] args) {
	//instansiasi objek
		//namaClass namaObjek = namaKonstruktor
		Laptop nsatu = new Laptop();
		Laptop ndua = new Laptop("Toshiba","Merah");
		Laptop ntiga = new Laptop("Asus","Hitam","Terputus");
		Laptop nempat = new Laptop("Hp","Putih","Terhubung",90);

		nsatu.menyala();
		System.out.println("Laptop Pertama : Merk ="+nsatu.getMerk()+"Warna = "+nsatu.getWarna()+"Wifi ="+nsatu.getWifi()+"Baterai"+nsatu.getBaterai());
		nsatu.indikatorBaterai();
		nsatu.indikatorWifi();
		ndua.menyala();
		System.out.println("Laptop Kedua : Merk ="+ndua.getMerk()+"Warna = "+ndua.getWarna()+"Wifi ="+ndua.getWifi()+"Baterai"+ndua.getBaterai());
		ndua.mati();
		ndua.indikatorBaterai();
		ndua.indikatorWifi();
		ntiga.menyala();
		System.out.println("Laptop Ketiga : Merk ="+ntiga.getMerk()+"Warna = "+ntiga.getWarna()+"Wifi ="+ntiga.getWifi()+"Baterai"+ntiga.getBaterai());
		ntiga.mati();
		ntiga.indikatorBaterai();
		ntiga.indikatorWifi();
		nempat.menyala();
		System.out.println("Laptop Keempat : Merk ="+nempat.getMerk()+"Warna = "+nempat.getWarna()+"Wifi ="+nempat.getWifi()+"Baterai"+nempat.getBaterai());
		nempat.mati();
		nempat.indikatorBaterai();
		nempat.indikatorWifi();

		//setter
		System.out.println("Setelah Setter");
		nsatu.setMerk("Macbook"); nsatu.setWarna("Hijau"); nsatu.setWifi("Terputus"); nsatu.setBaterai(100);
		nsatu.menyala();
		System.out.println("Laptop Pertama : Merk = "+nsatu.getMerk()+"Wifi = "+nsatu.getWifi()+"Baterai ="+nsatu.getBaterai());
		nsatu.indikatorBaterai();
		nsatu.indikatorWifi();
		nsatu.mati();
		nempat.setBaterai(100);
		nempat.menyala();
		System.out.println("Laptop Keempat : Merk = "+nempat.getMerk()+"Wifi = "+nempat.getWifi()+"Baterai ="+nempat.getBaterai());
		nempat.indikatorBaterai();
		nempat.indikatorWifi();
		nempat.mati();
}	}
