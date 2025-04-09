class sifreler<T>{
	public T deger;
	String algoritma="";
	
	void cagir() {
		System.out.println(deger.getClass().getName());
	}
	void olustur(T parametre) {
		if(deger.getClass().getName()=="java.lang.Integer"){
			System.out.println("Değer Integar");
		}
		else if(deger.getClass().getName()=="java.lang.String") {
			System.out.println("DeğerString");
		}
	}
}
class sifrelemeComplex<T,G>{
	public T deger;
	public G algoritma;
	void olustur(T a) {
		if(deger.getClass().getName()=="java.lang.Integar") {
			System.out.println("Değer Integar");
		}
		else if(algoritma.getClass().getName()=="java.lang.String") {
			System.out.println("DeğerString");
		}
}
	}
class kendiTipim<M>{
	public M id;
}
class TipinTipi<kendiTipim>{
	public kendiTipim degiskenTip;
	
}
class TipinTipininTipi<TipinTipi>{
	public TipinTipi tip;
	
}
public class GenericTurler {

	public static void main(String[] args) {
		sifreler<String> a = new sifreler<String>();
		a.deger="Deneme";
	    a.olustur("parametre");    
	    sifreler<Integer> b = new sifreler<Integer>();  		
	    b.deger=100;
	    b.olustur(150);
	    sifrelemeComplex<Integer,String> c= new sifrelemeComplex<>();
	    b.deger=120;
	    a.algoritma="Deneme";
	    sifreler<kendiTipim<String>> d = new sifreler<>();
	    TipinTipi<kendiTipim<Integer>> e = new TipinTipi<>();
	    TipinTipininTipi<TipinTipi<kendiTipim<Integer>>> f = new TipinTipininTipi<>();

	}

}

