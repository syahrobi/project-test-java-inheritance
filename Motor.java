
class Motor extends Kendaraan{
    String plat = "";
    String merk = "";
	Motor(int roda, String namaPemilik, String jenis, String bensin,String Plat, String Merk) {
		super(roda, namaPemilik,jenis,bensin);
		plat = Plat;
		merk = Merk;
	}

}
