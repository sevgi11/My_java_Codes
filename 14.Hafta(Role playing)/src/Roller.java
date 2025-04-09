abstract class devamDurumu {
	public abstract boolean Devam();
	int devamsizlik;
	
}
class sosyalSorumluluk extends devamDurumu{
	@Override
	public boolean Devam() {
		if(devamsizlik>15)
		return true;
		else
		return false;
	}
	public void kalmaDurumu() {
		if(Devam()==true)
		    System.out.println("Sosyal sorumluluk öğrencisi dersten kaldı");
		else
			System.out.println(" Sosyal sorumluluk devamsızlık hakkınız var");
	}
}
class tamZamanlı extends devamDurumu{
	  public boolean Devam() {
		  if(devamsizlik>10)
			  return true;
		  else 
			  return false;
		  
	  }
	  public void kalmaDurumu() {
			if(Devam()==true)
			    System.out.println("Tam zamanlı öğrencisi dersten kaldı");
			else
				System.out.println(" Tam zamanlı devamsızlık hakkınız var");
		}
	  
}
class Normal extends devamDurumu{
	  public boolean Devam() {
		  if(devamsizlik>8)
			  return true;
		  else 
			  return false;
		  
	  }
	  public void kalmaDurumu() {
			if(Devam()==true)
			    System.out.println("Normal öğrencisi dersten kaldı");
			else
				System.out.println("Normal öğrenci devamsızlık hakkınız var");
		}
	  
}

abstract class egitim{
	public abstract boolean mezuniyet(double Akts_ortalama);
	double Akts_ortalama;
}
class lisans extends egitim{
	@Override
	public boolean mezuniyet(double Akts_ortalama) {
		if(Akts_ortalama>2)
			return true;
		else 
			return false;
	}
}
class ylisans extends egitim{
	public boolean mezuniyet(double Akts_ortalama) {
		if(Akts_ortalama>2.5)
			return true;
		else 
			return false;
	}
}
class Ogrenci{
	int no;
	String isim;
	//Rolller için eğitim classından rollerdenm biri tanımlanacak
	egitim egitimSeviyesiRolu;
	//Roller için devam classından rollerden biri tanımlanacak
	devamDurumu devamrolu;
	
}


public class Roller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Ogrenci o1 = new Ogrenci();
       o1.devamrolu= new sosyalSorumluluk();
       o1.devamrolu.devamsizlik=13;
       System.out.println(" Sosyal sorumluluk öğrencisi Devamsızlık durumu : " +o1.devamrolu.devamsizlik);
       o1.devamrolu=new tamZamanlı();
       o1.devamrolu.devamsizlik=20;
       System.out.println(" Tam zamanlı öğrenci Devamsızlık durumu :"+ o1.devamrolu.devamsizlik);
       o1.egitimSeviyesiRolu=new lisans();
       System.out.println("Öğrenci mezuniyet durumu :  : "+ o1.egitimSeviyesiRolu.mezuniyet(2));
       
       
	}

}
