class testtabungan{
	public static void main(String[] args) {
    	//instansiasi objek
    		//namaClass namaObjek = namaKonstruktor
			Tabungan satu = new Tabungan();
			Tabungan dua = new Tabungan(900000,"Laily");
			Tabungan tiga = new Tabungan(800000,"Yudha",1441180009);
			Tabungan empat = new Tabungan(700000,"Elisa",1441180034,9);

			System.out.println("MEMBANGUN UNTUK BANGSA");
			System.out.println(" ");
		System.out.println("Nama Pemilik : " +satu.getPemRek());
		System.out.println("Nomer Rekening : " +satu.getNoRek());
		satu.menabung();
		satu.mengambil();
		satu.transfer();
		satu.menerimaTransfer();
		satu.cekSaldo();
		System.out.println("Anda memiliki bunga sebesar " +satu.getBunga()+ " %");
				System.out.println(" ");

				dua.setNoRek(1441180145);
				dua.setBunga(15);
				System.out.println(" ");
		System.out.println("Nama Pemilik :" +dua.getPemRek());
		System.out.println("Nomer Rekening :" +dua.getNoRek());
		dua.menabung();
		dua.mengambil();
		dua.transfer();
		dua.menerimaTransfer();
		dua.cekSaldo();
		System.out.println("Anda Memiliki bunga sebesar "+dua.getBunga()+ " %");

		tiga.setBunga(4);
				System.out.println(" ");
		System.out.println("Nama Pemilik :" +tiga.getPemRek());
		System.out.println("Nomer Rekening :" +tiga.getNoRek());
		tiga.menabung();
		tiga.mengambil();
		tiga.transfer();
		tiga.menerimaTransfer();
		tiga.cekSaldo();
		System.out.println("Anda memiliki bunga sebesar "+tiga.getBunga()+" %");
		System.out.println(" ");

				System.out.println("Nama Pemilik :"+empat.getPemRek());
		System.out.println("Nomer Rekening :" +empat.getNoRek());
		empat.menabung();
		empat.mengambil();
		empat.transfer();
		empat.menerimaTransfer();
		empat.cekSaldo();
		System.out.println("Anda memiliki bunga sebesar "+empat.getBunga()+" %");
	}
}