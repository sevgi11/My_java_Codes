
public class enumUygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(islemler.carp.hesaple(15, 100));
	}

}
enum islemler{
	topla , cikar, carp, bol;
	public double hesaple(double s1,double s2) {
		double sonuc=0;
		switch(this) {
		case topla:
			sonuc=s1+s2;
			break;
		case cikar	:
			sonuc=s1-s2;
			break;
		case carp:
			sonuc=s1*s2;
			break;
		case bol:
			sonuc=s1/s2;
			break;
		default:
			sonuc=-1;
		    break;
		}
		return sonuc;
	}
}
