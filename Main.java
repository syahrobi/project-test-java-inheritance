
public class Main{
    public static void main (String [] args){
    	
    	
    	
    	Mobil m;
    	m = new Mobil(4,"Muhamad Syahrobi","Roda 4","PERTAMAX","F 212 GG","Verari");
    	
    	Motor m2;
    	m2 = new Motor(4,"Andini dini","Roda 2","PERMIUM","F 212 GG","CBR");
    	
    	
    	System.out.println("Pemilik Kendaraan : "+m.namaPemilik);
    	System.out.println("Roda :"+m.roda);
    	System.out.println("Plat Nomor Kendaraan : "+m.Plat);
    	System.out.println("Jenis Kendaraan : "+m.jenis);
    	System.out.println("Bensin : "+m.bensin);
    	System.out.println("Merk : "+m.Merk);
    	
    
    	System.out.println("Pemilik Kendaraan : "+m2.namaPemilik);
    	System.out.println("Roda :"+m2.roda);
    	System.out.println("Plat Nomor Kendaraan : "+m2.plat);
    	System.out.println("Jenis Kendaraan : "+m2.jenis);
    	System.out.println("Bensin : "+m2.bensin);
    	System.out.println("Merk : "+m2.merk);
    	
    	
    	
    }
}
