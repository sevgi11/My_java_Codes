
public class Hayvan {
	public static double kilo =0 , boy=0;
	public static String yasananYer="";
	
	Hayvan(){
		System.out.println("Hayvan kurucusu tetiklendi");
		
	}
	Hayvan(double kilo){
		this.kilo=kilo;
		System.out.println("Hayvan kurucusu tetiklendi kilo="+kilo);
	}
	public void Hayvan() {
		System.out.println("Hayvan isminde fonksiyon çalıştırıldı(Kurucu değil)");
	}
	public void Beslenme() {
		System.out.println(" Hayvan.beslenme fonksiyonu çalıştı : Her hayvan beslenir");
	}
	public void yasadigiYer() {
		System.out.println("Hayvan.yasadigiYer fonksiyonu tetiklendi");
	}
	public void Solunum() {
		System.out.println("Hayvan.Solunum fonksiyonu tetiklendi");
	}
	public void ceneYapisi() {
		System.out.println("Hayvan.ceneYapisi fonksiyonu tetiklendi");
	}
	public void Goster() {
		System.out.println("Kilosu="+this.kilo );
	}

}
class Etcil extends Hayvan{
	public Etcil() {
		System.out.println("Etcil classının kurucusu tetiklendi");
	}
	@Override
	public void Beslenme() {
		System.out.println("Etcil.Beslenme fonksiyonu tetiklendi... Etciller sadece et ile beslenirler");
		
	}
	@Override
	public void ceneYapisi() {
		System.out.println("Etcil.ceneYapisi fonksiyonu tetiklendi... Kesici dişler gelişmiştir");
	}
	public void etcilGoster() {
		super.Goster(); //En üst sınıfın isminin yerini tutan özel tanımlamadır
	}
}
class Otcul extends Hayvan{
	public Otcul() {
		System.out.println("Otcul classının kurucusu tetiklendi");
	}
	@Override
	public void Beslenme() {
		System.out.println("Otcul.Beslenme fonksiyonu tetiklendi... Otcullar sadece ot ile beslenirler");
		
	}
	@Override
	public void ceneYapisi() {
		System.out.println("Otcul.ceneYapisi fonksiyonu tetiklendi... Öğütücü dişler gelişmiştir");
	}
}

