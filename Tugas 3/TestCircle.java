class TestCircle{
	public static void main(String[] args) {
	//instansiasi objek
		//namaClass namaObjek = namaKonstruktor
		circle cahya = new circle();
		circle ardi = new circle(30,"Merah Delima");

		cahya.setColor("Putih");

		System.out.println("radius ="+cahya.getRadius()+"color ="+cahya.getColor()+"Luas ="+cahya.getArea());
		System.out.println("radius ="+ardi.getRadius()+"color ="+ardi.getColor()+"Luas ="+ardi.getArea());
	}
}