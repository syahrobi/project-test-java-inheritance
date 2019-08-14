
public class Mobil extends Kendaraan {
	String Plat;
	String Merk;
    Mobil(int roda,String namaPemilik,String jenis,String bensin, String plat, String merk){
    	super(roda,namaPemilik,jenis,bensin);
    	Plat = plat;
    	Merk = merk;
    }
}
