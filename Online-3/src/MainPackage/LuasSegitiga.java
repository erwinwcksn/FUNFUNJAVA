package MainPackage;
import java.util.*;
public class LuasSegitiga {
  public static void main(String[] args) {
   System.out.println("Mochammad Alif Kurniawan");
   int alas;
   int tinggi;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Segitiga");
   System.out.print("Masukan Alas: ");
   alas = scan.nextInt();
   System.out.print("Masukan Tinggi: ");
   tinggi = scan.nextInt();
  
   luas = (0.5 * alas * tinggi);
   System.out.println("Luas Segitiga = " + luas);
  }
}
