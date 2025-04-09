
public class kalitimUygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hayvan a =  new Hayvan();
       System.out.println("--------------------");
       Etcil b = new Etcil();
       b.ceneYapisi();
       b.Beslenme();    
       System.out.println("--------------------");
       Otcul c = new Otcul();
       c.ceneYapisi(); 
       Hayvan e = new Hayvan(45);
       Etcil f = new Etcil();
       System.out.println("Kilo="+f.kilo);
       
	}

}
