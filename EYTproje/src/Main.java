
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EYT e1 =new EYT(50, 2020);
		e1.emeklilikRolu=new Kadınemekli(e1.yaş,e1.sgkGiriş);
		System.out.println("Kadın emeklilik durumu :"+e1.emeklilikRolu.sorgula(6000, "4A"));
		EYT e2 = new EYT();
		e2.ucretRolu=new isci();
		System.out.println("Alacağınız prim miktar :"+e2.ucretRolu.setMaas(7000, 50));
	}
}
