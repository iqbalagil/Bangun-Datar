package Java;

public class Persegi extends BangunDatar{

        int sisi;
         
        @Override
        double hitungLuas(){
            return this.sisi * this.sisi;
        }
         
        @Override
        double hitungKeliling(){
            return 4 * this.sisi;
        }
         
    }