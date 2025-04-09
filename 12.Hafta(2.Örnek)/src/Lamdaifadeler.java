
public class Lamdaifadeler {

	public static void main(String[] args) {
		lambdaİfadeler nesne1= new lambdaİfadeler();
			
		
		LamdaReturn nesne1=(int a)->{a*a};
		nesne1.Goster();
		
		
		
		
	}


}
class Deneme implements lambdaİfadeler{
	@Override
	public void Goster() {
		System.out.println("Denem ovveride edilen Goster fonksiyonu");
}
	@Override
	public void Goster2(int a) {
		System.out.println("Deneme override edilen Goster2 fonksiyonu");
		
	}
}