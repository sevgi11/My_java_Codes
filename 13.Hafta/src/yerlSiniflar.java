
public class yerlSiniflar {
    public String regularifade="[0-9]";
    
    public static void TelefonDogrula(String TelNo) {
    	final int numaraUzunluk=10;
    	int numaraDeger=0;
    	//yerel(Local) class
    	class TelefonNumarasi{
    		public String regularifade="[^0-9]";
    		String TemizlenenNumara =null;
    		TelefonNumarasi(String TelNo){
    			TemizlenenNumara=TelNo.replaceAll(regularifade , "");
    			if(TemizlenenNumara.length()==numaraUzunluk) {
    				this.TemizlenenNumara=TemizlenenNumara;
    			}
    			else {
    				this.TemizlenenNumara=null;
    			}
    			
    		}
    		public String getTelNo() {
    			return TemizlenenNumara;
    		}
    		public void numaragoster() {
    			System.out.println(TemizlenenNumara);
    		}
    	}
    	//yerel class bitti
    	TelefonNumarasi numaram = new TelefonNumarasi(TelNo);
    	numaram.numaragoster();
    	if(numaram.getTelNo()==null) {
    		System.out.println("eksik numara");
    	}
    	else {
    		System.out.println(numaram.getTelNo());
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TelefonDogrula("");
        }
	}