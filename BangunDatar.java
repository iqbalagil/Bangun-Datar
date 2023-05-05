
package Java;

public abstract class BangunDatar {
     
    // method abstrak
    abstract double hitungLuas();
    abstract double hitungKeliling();
     
    // method non abstrak
    void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    }
}