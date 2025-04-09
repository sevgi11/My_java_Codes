import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan =new Scanner(System.in);
        int s1,s2,obeb=1,ekok;
        System.out.println("Lütfen sayıları giriniz:");
        s1=scan.nextInt();
        s2=scan.nextInt();
        
        int min= (s1<s2) ? s1: s2;
        for(int i=min; i>0;i--) {
        	if((s1%i==0)&&(s2%i==0)) {
        		obeb=i;
        		break;
        	}
        }
        ekok=(s1*s1)/ obeb; 
        
        System.out.println(s1+ " ve " +s2+ " sayılarının EKOKU :" +ekok);
        System.out.println(s1+ " ve " +s2+ " sayıların EBOBU :" +obeb);
        
        
	}

}
