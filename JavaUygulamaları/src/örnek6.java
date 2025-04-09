class Atm{
	private String hesapsahibi;
	private double bakiye;
	private String usd;
	private String euro;
	
	public Atm() {
		this.hesapsahibi="bilinmiyor";
		this.bakiye=0.0;
		this.usd="usd";
		this.euro="euro";
	}
	public Atm(String hesapsahibi, double bakiye,String usd,String euro) {
		this.hesapsahibi=hesapsahibi;
		this.bakiye=bakiye;
		
		
	}
	public final void bakiyegoster() {
		System.out.println(hesapsahibi +"adlı kullanıcıynının bakiyesi:"+bakiye);
	}
	public void parayatir(int miktar) {
		bakiye+=miktar;
		System.out.println(hesapsahibi + "Adlı kullanıcının bakiyesi:"+bakiye);
	}
	public void parayatir(int miktar,String tur) {
		switch(tur) {
		case "usd":
			bakiye = bakiye + (miktar * 28);
			System.out.println(hesapsahibi + " adlı musterinin hesabina " + miktar + " USD yatirilmistir.");
			System.out.println("Yeni bakiye : " + bakiye);
			break;
		case "euro":
			bakiye = bakiye + (miktar * 31);
			System.out.println(hesapsahibi + " adlı musterinin hesabina " + miktar + " EURO yatirilmistir.");
			System.out.println("Yeni bakiye : " + bakiye);
			break;
		default:
			System.out.println("Gecersiz islem");
			break;
	}
		
	}
	public void paracek(int miktar) {
		if(miktar>0&&miktar<=bakiye) {
			bakiye-=miktar;
			System.out.println("bakiyeniz :"+bakiye);
		}
		else
			System.out.println("Geçersiz işlem");
	}
	
}
public class örnek6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Atm hesap1= new Atm();
        Atm hesap2= new Atm("Sevgi",100000.0,"","");
        hesap1.bakiyegoster();
		hesap2.bakiyegoster();
		
		hesap2.parayatir(5000);
		
		hesap2.paracek(3000);
		
		hesap2.parayatir(200, "usd");
		hesap2.parayatir(100, "euro");
		
		hesap2.paracek(10000);
		
		hesap2.bakiyegoster();
		
		
		
	}

}
