class Fatura{
	int uniqueId;
	double odemeTutar;
	ChatBot ChatbotRolu;
	Platform PlatformRolu;
	
	public void ekleBordro(int[] Fiyat){}
	public Fatura(int uniqueId) {
		this.uniqueId=uniqueId;
	}
}
abstract class ChatBot extends Fatura{
	public ChatBot(int uniqueId) {
		super(uniqueId);
	}
	int llmno;
	double ucret;
	 abstract double addButce(int soru,double sure,String user);
	public abstract double setUcret(double ucret);
}
class ChatGPT extends ChatBot{
	public ChatGPT(int uniqueId) {
		super(uniqueId);
	}
	double ucret=140.55;
	@Override
	 double addButce(int soru, double sure, String user) {
	    ucret+= soru*2.15+sure*0.45;
		if(user.equals("Öğrenci")){
			return ucret-=ucret*0.15;	
		}
		return ucret;
	}
	@Override
	public double setUcret(double ucret) {
		 return this.ucret=ucret;
			}
	}
class Gemini extends ChatBot{
	Gemini(int uniqueId){super(uniqueId);}
		
	
	double ucret=105.33;
	@Override
	public double addButce(int soru,double sure,String user) {
		ucret+=(soru*3.84)+(sure*0.11);
		if(user.equals("Kurumsal"))
			return ucret+=(ucret*0.15);
		else
			return ucret;
	}@Override
	public double setUcret(double ucret) {
		return this.ucret=ucret;
	}
}
abstract class Platform extends Fatura{
	String PlatformAd; double ucret;
	
	 abstract void addFiyat(double sure,int abonman);
	 abstract void gosterTutar();
	public Platform(double ucret,int uniqueId) {
		super(uniqueId);
		this.ucret=ucret;
		
	}
}
class Digiturk extends Platform{
	public Digiturk(double ucret,int uniqueId) {
		super(ucret,uniqueId);
	}
	double tutar;
	public void addFiyat(double sure,int abonman) {
		if(sure> abonman*1.11 || sure<abonman*1.2)
			tutar= 150+ucret;
		else if(sure> abonman*1.21 || sure<abonman*1.8)
			tutar= ucret+=150+(ucret*0.13);
		else tutar=ucret;
				
	}
	public void gosterTutar() {
		
		System.out.println(tutar);
	}
}
class Netflix extends Platform{
	public Netflix(double ucret,int uniqueId) {
		super(ucret,uniqueId);
	}
	double tutar;
	public void addFiyat(double sure,int abonman) {
		if(sure> abonman*1.9 || sure<abonman*1.35)
			tutar= 150+ucret;
		else if(sure> abonman*1.51 || sure<abonman*1.8)
			tutar= ucret+=150+(ucret*0.13);
		else tutar=ucret;
	}
	public void gosterTutar() {
		System.out.println("Tutar :" + tutar);
		}}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fatura f1= new Fatura(1);
		f1.ChatbotRolu=new ChatGPT(1);
		System.out.println("Ucret :" + f1.ChatbotRolu.addButce(5, 15, "Öğrenci"));
		f1.PlatformRolu=new Netflix(5000,120);
		f1.PlatformRolu.addFiyat(1,1200);
		f1.PlatformRolu.gosterTutar();
	}}
