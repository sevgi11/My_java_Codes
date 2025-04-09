import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class  Dizi <T>{
	private T[] dizi ;


	 public void Donustur(ArrayList<T> list) {
		// ArrayList boyutunda bir dizi oluştur
		 dizi = (T[]) new Object[list.size()];
		 
		 // elemanları kopyala 
		 for (int i=0; i<list.size();i++) {
			 dizi[i]=list.get(i);
					 	 
		 }
	 }

	  
	 
	  public void OrtancaBul() {
	        if (dizi.length == 0) {
	          System.out.println("dizi boş ");
	        }

	        // Diziyi sıralama işlemi
	        Arrays.sort(dizi); // Diziyi sıralıyoruz, bu işlem için elemanlar karşılaştırılabilir olmalı
                
	        System.out.println("Sıralanmış Dizi:");
	        for (T eleman : dizi) {
	            System.out.println(eleman); 
	            
	        }        
	        // Ortanca elemanı bul
	        int ortaIndex = dizi.length / 2; 
	       if (dizi.length % 2 == 1) {
	        	System.out.println("Dizinin ortanca degeri "+dizi[ortaIndex]);
	        }
	        else {
	       
	        	System.out.println( "Dizinin ortanca degerleri "+ dizi[ortaIndex -1 ] +" , "+ dizi[ortaIndex]);
	        	
	        }

	  }
	 


}