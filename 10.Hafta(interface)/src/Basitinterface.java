
public interface Basitinterface {
    final int a=10;
    void goruntule();
    int degerGetir(int a,int b);
    double degerler();
    /*final double Deneme();
    interacler final ttanımlama yapamaz
    intrerfaclerde static tanımlı fonksiyon kullanılamaz
    interfacede abstract tanımlama dışında fonksiyon tanımlanamaz */
    
    
    
}
interface Basitinterface2{
	int durum1();
	double durum2(double a);
	
}
//interfacde doğrudan nesne üretilemez dolasıyla clas üretilerek gerçekleştirilir
class testinterface implements Basitinterface{
	@Override
	public void goruntule() {
		System.out.println("Görüntüüle fonksiiyonu tetiklendi");
	}
	@Override
	public double degerler() {
		return 0;
	}
	@Override
	public int degerGetir(int a,int b) {
		return 0;
	}
	public void deneme() {
		//yeni classa fonks yazılabilir
	}
}
class testinterface2 implements Basitinterface,Basitinterface2{
	@Override
	public void goruntule() {
		System.out.println("Görüntüüle fonksiiyonu tetiklendi");
	}
	@Override
	public double degerler() {
		return 0;
	}
	@Override
	public int degerGetir(int a,int b) {
		return 0;
	}
	public void deneme() {
		//yeni classa fonks yazılabilir
	}
	@Override
	public int durum1() {
		return 0;
	}
	@Override
	public double durum2(double a) {
		return 0;
	}
}
