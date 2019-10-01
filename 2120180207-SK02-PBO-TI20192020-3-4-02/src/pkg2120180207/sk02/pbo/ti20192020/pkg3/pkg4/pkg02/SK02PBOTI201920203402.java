
package pkg2120180207.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;

public class SK02PBOTI201920203402 {
    public static void main(String[] args) {
        televisi televisi_ulpa= new televisi();
        
        televisi_ulpa.ukuran_layar=14;
        televisi_ulpa.tahun=1999;
       
        System.out.println(televisi_ulpa.merk);
        System.out.println(televisi_ulpa.ukuran_layar);
        System.out.println(televisi_ulpa.tahun);
        
        televisi_ulpa.nyala();
        televisi_ulpa.mati();
    }
    
}
