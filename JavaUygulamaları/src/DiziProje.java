import java.util.Scanner;
public class DiziProje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] Notlar =new int[7];
        int toplam=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Hoşgeldiniz lütfen notlarınızı giriniz:");
        System.out.println("Mat 1 :");
        Notlar[0]=scan.nextInt();
        System.out.println("Fizik 1 :");
        Notlar[1]=scan.nextInt();
        System.out.println("Türk Dili:");
        Notlar[2]=scan.nextInt();
        System.out.println("Toy :");
        Notlar[3]=scan.nextInt();
        System.out.println("Tarih :");
        Notlar[4]=scan.nextInt();
        System.out.println("Bmg :");
        Notlar[5]=scan.nextInt();
        System.out.println("Algoritma ve programlama :");
        Notlar[6]=scan.nextInt();
        for(int not : Notlar) {
        	toplam+=not;
        }
        System.out.println("Not ortalamanız :"+toplam/Notlar.length);
        
        
        		
	}

}
