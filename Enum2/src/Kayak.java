 public enum Kayak{
  Kar(0.21),Taslik(0.34),Toprak(0.47);
 double Fsürtünme;
  Kayak(double Fsürtünme) {
	 this.Fsürtünme=Fsürtünme;	 
 }
 public double Hesapla(double m,double alpha) {
	 double N = m*9.18*Math.sin(Math.toRadians(alpha));
	 return (N - Fsürtünme);	 		 
 }  
 }
public class Main {
  public static void main(String[] args) {
	 System.out.println("Toprak Kayak İnme kuvveti :"+ Kayak.Toprak.Hesapla(15, 180));
  }}

