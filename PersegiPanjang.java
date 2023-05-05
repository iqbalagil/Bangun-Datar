package Java;

public class PersegiPanjang extends BangunDatar {
        int panjang;
        int lebar;
         
        @Override
        double hitungLuas(){
            return this.panjang * this.lebar;
        }
         
        @Override
        double hitungKeliling(){
            return 2 * (this.panjang + this.lebar);
        }
         
    }
