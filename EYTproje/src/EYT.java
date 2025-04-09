
public class EYT {
    int yaş;
    int sgkGiriş;
    Emeklilik emeklilikRolu;
    Ucret ucretRolu;
    EYT(int yaş,int sgkGiriş){
    	this.yaş=yaş;
    	this.sgkGiriş=sgkGiriş;
    }
    EYT(){
    	this.yaş=0;
    	this.sgkGiriş=0;
    }
    
    
}
abstract class Emeklilik extends EYT {
    public int CalismaSuresi;
    public String Meslek;
	public abstract boolean sorgula(int CalismaSuresi,String Meslek);
	Emeklilik(int yaş,int sgkGiriş){
		super( yaş,sgkGiriş);
	}
}
 class Kadınemekli extends Emeklilik{
	Kadınemekli(int yaş,int sgkGiriş){
		super(yaş,sgkGiriş);
	}
	@Override
	public  boolean sorgula(int CalismaSuresi, String Meslek) {
		if(Meslek=="4A")
			CalismaSuresi+=CalismaSuresi*(15/100);
		return CalismaSuresi>5000 && ((2025-sgkGiriş)>20);
	}
	
}
 class Erkekemekli extends Emeklilik{
	Erkekemekli(int yaş,int sgkGiriş){
		super(yaş,sgkGiriş);
	}
	@Override
    public boolean sorgula(int CalismaSuresi,String Meslek) {
    	if(Meslek=="4A")
    		CalismaSuresi+=CalismaSuresi*(2/10);
    	else if(Meslek=="4B"||Meslek=="4C")
    		CalismaSuresi+=CalismaSuresi*(7/100);
    	return CalismaSuresi>5500 && ((2025-sgkGiriş)>25);
    }
}
abstract class Ucret extends EYT{
	int primGunu;
	double primTL;
	abstract double setMaas(double primGunu,double primTL);
	
}
class isci extends Ucret{
	double setMaas(double primGunu,double primTL) {
		if(primGunu>5550 && primGunu<6000) {
			primTL=5500+(5500*0.11);
		}
		else if(primGunu>6050&& primGunu<7500) {
			primTL=6750+(6750*0.11);
		}
		return primTL;
	}
	
}
class memur extends Ucret{
	double setMaas(double primGunu,double primTL) {
		if(primGunu>5572 && primGunu<6040) {
			primTL=7500-(7500*0.03);
		}
		else if(primGunu>6292&& primGunu<7600) {
			primTL=8300-(8300*0.06);
		}
		return primTL;
	}
}
