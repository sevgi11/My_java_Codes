
public class LabDers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Araba araba1 =new Araba();
		araba1.bilgileriYazdir();
		
		Araba araba2 = new Araba("LandRover",2020);
		araba2.bilgileriYazdir();
        
	}

}
class Araba{
	String marka;
	int yil;

public Araba() 
{
	this.marka="Bilinmiyor";
	this.yil=0;
	}

public Araba(String marka,int yil) {
	this.marka=marka;
	this.yil=yil;
}
public void bilgileriYazdir() {
	// TODO Auto-generated method stub
	System.out.println("Marka:"+this.marka);
	System.out.println("Yıl:"+this.yil);
}

}
