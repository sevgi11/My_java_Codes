import java.util.Scanner;
public class DonGuler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		//for(i=1;i<=100;i++ ) {
			//if(i%2==0) System.out.println(i);
		Scanner girdi= new Scanner(System.in);
		int toplam=0;
		
		while(true) {
			System.out.println("Lütfen sayı giriniz :");
			i=girdi.nextInt();
			if(i<0) {
				System.out.println("program bitti girilen tek sayılar toplamı :"+toplam);
				break;
			}
			if(i%2==1) {
				toplam=+i;
			}
		}
	
	
	 
		
				
			
		

	}

}
