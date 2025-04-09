
import java.util.ArrayList;
public class Rektorluk {
    public int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rektorluk r1 = new Rektorluk();
        r1.x=55;
        Rektorluk.Fakulteler fk= r1.new Fakulteler();
        fk.Goster();
        fk.xGoster(999);
        
        Rektorluk.dairebaskanlık rd =r1.new dairebaskanlık();
        rd.Goster();
        rd.xGoster(100);
        System.out.println("*****************");
        
        System.out.println(r1.x); //rektorluk x degeri
        
        System.out.println(fk.x); //fakulteler için x degeri
        
        
        
	}
	public class Fakulteler{
		public int x=10;
		public ArrayList<String> fakulteler = new ArrayList<String>();
		public void Ekle(String fismi) {
			fakulteler.add(fismi);
		}
		public void Goster() {
			for(String a : fakulteler) {
				System.out.println(a);
			}
		}
		public void xGoster(int x) {
			System.out.println("Parametre olan x :"+x);
			System.out.println("this.x"+this.x);
			System.out.println("Rekrorluk x :"+ Rektorluk.this.x);
		}
	    
	}
	public class dairebaskanlık{
		public int x=7;
		public ArrayList<String> dbaskan = new ArrayList<String>();
		public void Ekle(String fismi) {
			dbaskan.add(fismi);
		}
		public void Goster() {
			for(String a : dbaskan) {
				System.out.println(a);
			}
		}
		public void xGoster(int x) {
			System.out.println("Parametre olan x :"+x);
			System.out.println("this.x"+this.x);
			System.out.println("baskanlık x :"+ Rektorluk.this.x);
		}
	    
	}
	public static class RektorlukBirimi{
		public String rektorAdı="Tolga Depci";
		RektorlukBirimi(String yeni_isim){
			this.rektorAdı=yeni_isim;
		}
		public String getRektor() {
			return rektorAdı;
		}
	}
}

