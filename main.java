package Java;

public class main {
        public static void main(String[] args) {
             
            // hitung luas & keliling lingkaran r=10
            Lingkaran l1 = new Lingkaran();
            l1.jejari = 10;
            l1.tampilHasil();
             
            // hitung luas & keliling persegi panjang p=10 l=5
            PersegiPanjang pp1 = new PersegiPanjang();
            pp1.panjang = 10;
            pp1.lebar = 5;
            pp1.tampilHasil();
             
            // hitung luas & keliling persegi s=7
            Persegi p1 = new Persegi();
            p1.sisi = 7;
            p1.tampilHasil();
        }
    }