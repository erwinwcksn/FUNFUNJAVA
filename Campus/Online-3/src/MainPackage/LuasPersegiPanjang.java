package MainPackage;
import java.util.*;
public class LuasPersegiPanjang {
  
  public static void main(String[] args) {
   System.out.println("Mochammad Alif Kurniawan");
   int panjang;
   int lebar;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Persegi Panjang");
   System.out.print("Masukan Panjang: ");
   panjang = scan.nextInt();
   System.out.print("Masukan Lebar: ");
   lebar = scan.nextInt();
  
   luas = (panjang * lebar);
   System.out.println("Luas Persegi Panjang = " + luas);
  }
}
