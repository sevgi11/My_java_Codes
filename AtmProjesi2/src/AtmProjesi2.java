import java.util.Scanner;
public class AtmProjesi2 {

	public static void main(String[] args) {
	   int bakiye=1000,input,miktar;
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Merhaba bankamıza hoşgeldiniz");
	   System.out.println("Güncel bakiyeniz :" + bakiye);
	   while(bakiye>0) {
		   System.out.println();
		   System.out.println("1-) Para yatır");
		   System.out.println("2-) Para çek");
		   System.out.println("3-) Bakiye sorgula");
		   System.out.println("4-) Çıkış yap");
		   System.out.print("Yapmak istediğiniz işlemi seçiniz :");
		   input=scan.nextInt();
		   
		   if(input==1) {
			   System.out.print("Yatırmak istediğiniz miktarı seçiniz :");
			   miktar=scan.nextInt();
			   bakiye+=miktar;
		   }else if(input==2) {
			   System.out.print("Çekmek istediğiniz miktar:");
			   miktar=scan.nextInt();
			   if(miktar>bakiye) {
				   System.out.println("Yetersiz bakiye");
			   }else {
				   bakiye-=miktar;
			   }
		    }else if(input==3) {
				   System.out.println("Güncel bakiyeniz :" + bakiye + "TL");
		    }else if(input==4) {
					   System.out.println("Çıkış yapılıyor");
					   break;
				   }
			   }
		   }
	   

	}


