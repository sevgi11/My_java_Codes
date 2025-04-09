import java.util.Scanner;
public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann= new Scanner(System.in);
		int sayi;
		boolean asal=true;
		do {
			System.out.println("bir sayi giriniz : ");
		    sayi=scann.nextInt();
		}
		while(sayi<2);
		for(int i=2;i<sayi;i++) {
		if(sayi%i==0) {
			asal=false;
		    break;
		}
		
		}
		if(asal) {
			System.out.println("Girilen sayi " + sayi +  "asaldır");
		}
		else {
			System.out.println("Girilen sayi " + sayi +  "asal değildir");
		}
		

	}

}
