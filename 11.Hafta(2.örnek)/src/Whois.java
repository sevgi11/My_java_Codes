
public enum Whois {
   gokhan("wwww.gokhan.com"),ISTE("aaaaaaaaaa"),Google("www.google.com");
	public String url="";
	
	Whois(String a){
		this.url=a;
	}
	public String urlGoster() {
		return("URL"+url);
	}

}
