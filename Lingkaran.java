package Java;

public class Lingkaran extends BangunDatar {

    int jejari;
     
    @Override
    double hitungLuas(){
        return Math.PI * this.jejari * this.jejari;
    }
     
    @Override
    double hitungKeliling(){
        return 2 * Math.PI * this.jejari;
    }
}
