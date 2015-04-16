class testmobil{
	public static void main(String[] args) {
		//create an object
		Mobil mobilSatu = new Mobil();
		Mobil mobilDua = new Mobil(280, "Monaco", "W 2359 KP", "Pagani Huayra", "Merah", 6000);
	
		//display the 1st object : mobilSatu
		System.out.println("Merk " +mobilSatu.getMerk());
		System.out.println(", berlokasi di "+mobilSatu.getPosisi());
		System.out.println(", berPlat Nomer "+mobilSatu.getPlat());
		System.out.println(", top speed mencapai "+mobilSatu.getSpeed()+" km/h");
		System.out.println(", berwarna "+mobilSatu.getWarna());
		System.out.println(", bermesin "+mobilSatu.getMesin()+" CC");

		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Merk " +mobilDua.getMerk());
		System.out.println(", berlokasi di "+mobilDua.getPosisi());
		System.out.println(", berPlat Nomer "+mobilDua.getPlat());
		System.out.println(", top speed mencapai "+mobilDua.getSpeed()+" km/h");
		System.out.println(", berwarna "+mobilDua.getWarna());
		System.out.println(", bermesin "+mobilDua.getMesin()+" CC");

System.out.println();
	}
}