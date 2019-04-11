package MainPackage;
import java.util.*;
public class VolumeBalok {
   public static void main(String[] args) {
   System.out.println("Mochammad Alif Kurniawan");
   int panjang;
   int lebar;
   int tinggi;
   double volume;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Volume Balok");
   System.out.print("Masukan Panjang: ");
   panjang = scan.nextInt();
   System.out.print("Masukan Lebar: ");
   lebar = scan.nextInt();
   System.out.print("Masukan Tinggi: ");
   tinggi = scan.nextInt();
  
   volume = (panjang * lebar * tinggi);
   System.out.println("Volume Balok = " + volume);
   }
}