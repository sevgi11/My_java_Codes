import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class arrayListler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        ArrayList<String> Listem =new ArrayList<>();
        ArrayList<String> Listem2 = new ArrayList<String>(5);
        ArrayList<Integer> Listem3= new ArrayList<Integer>();
        for(int i=0;i<10;i++) {
        	Listem2.add(i+(". eleman"));
        	//Liste boyutu öncedenverilmiş olsa dahi
        	//dinamik olarak bellekte yer açılır
        }
        System.out.println(Listem2);
        Listem2.add(2,"deneme");
        //2. indise eleman ekleme  
        //diğerlerini kaydırıyor
        System.out.println(Listem2);
        Listem2.add("deneme");
        //add sona ekleme
        System.out.println(Listem2);
        System.out.println(Listem2.indexOf("deneme"));
        //deneme degerinin ilk hangi indiste olduğunu getirir
        System.out.println(Listem2.lastIndexOf("deneme"));
        //denem değerinin en son kaçıncı indiste olduğunu getirir
        System.out.println(Listem2.contains("deneme"));
        //Liste 2 de denem diye bir değer var mı onu kontrol eder
        if(Listem2.contains("deneme")) {
        	System.out.println("deneme değerini içeriyor");
        }
        else {
        	System.out.println("denem değeri yok");
        }
        System.out.println(Listem2);
        Listem2.remove("deneme");
        //ilk deneme değerini siler
        System.out.println(Listem2);
        Listem2.remove(5);
        //5 numaraları indisteki değeri siler
        System.out.println(Listem2);
        for(String deger : Listem2) {
        	System.out.println(deger);
        }
        int arrayListBoyutu=Listem2.size();
        System.out.println(arrayListBoyutu);
        for(int i=0 ;i<Listem2.size();i++) {
        	System.out.println(Listem2.get(i));
        	
        }
        Listem2.set(1, "NABER");
        System.out.println(Listem2);
        Listem2.clear();
        //Listenin tüm elemanlarının siler
        System.out.println(Listem2);
        Collections.sort(Listem2);
        //A-Z
        Collections.sort(Listem2,Collections.reverseOrder());
        //Z-A
        

	}

}
