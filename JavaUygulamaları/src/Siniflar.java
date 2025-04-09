
public class Siniflar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HesapMakinesi m1= new HesapMakinesi(10,5,"siyah");
        System.out.println(m1.toplama());
        m1.sayi1=9;
        System.out.println(m1.cikarma());
        
        HesapMakinesi m2 = new HesapMakinesi(20,9,"mavi");
        System.out.println(m2.carpma());
        
        
      
      
	}

}
