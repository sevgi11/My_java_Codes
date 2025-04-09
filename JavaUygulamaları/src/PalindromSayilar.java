
public class PalindromSayilar {
    
	static boolean isPalindrom(int input) {
		int tmp, terssayi=0,kalan; 
		tmp=input;
		
		while(tmp!=0) {
			kalan=tmp%10;
			terssayi=terssayi * 10 + kalan;
			tmp/=10;
			
		}
		if(input==terssayi) 
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isPalindrom(121));
	}

}
