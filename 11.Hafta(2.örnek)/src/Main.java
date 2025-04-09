public class Main {
    public enum Kayak {
        KAR(0.21),
        TASLIK(0.34),
        TOPRAK(0.47);

        private  double katsayi; // Enum değişkeni (Property)

         private Kayak(double katsayi) {
            this.katsayi = katsayi;
        }

        public double hesapla(double m, double alpha) { // Enum içinde fonksiyon
            double g = 9.18; // Yerçekimi ivmesi
            double N = m * g * Math.sin(Math.toRadians(alpha)); // N = mg sin(alpha)
            return katsayi * N; // Fs = katsayı * N
        }
    }

    public static void main(String[] args) {
       

        double Fs = Kayak.TOPRAK.hesapla(15, 45); // Toprak yüzeyi için hesaplama
        System.out.printf("Toprak üzerindeki sürtünme kuvveti (Fs): %.2f N%n", Fs);
    }
}
