
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> sayilar = new ArrayList<Integer>();

		sayilar.add(10);
		sayilar.add(60);
		sayilar.add(30);
		sayilar.add(15);
		sayilar.add(100);
		sayilar.add(45);
		
		
		// Dizi sınnıfından bir dizi adında bir nesne oluşturdm
		Dizi <Integer> dizi = new Dizi<>();
		dizi.Donustur(sayilar);
		
	
		
		dizi.OrtancaBul();
	}

}