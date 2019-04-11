/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;
import java.util.Scanner;

/**
 *
 * @author cpp
 */
public class JavaIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A = ");
        int A = input.nextInt();
        System.out.println("B = ");
        int B = input.nextInt();
        
        int pertambahan = A + B;
        int pengurangan = A - B;
        int perkalian = A * B;
        int pembagian = A / B;
        
        System.out.println(A + "+" + B + " = " + pertambahan);
        System.out.println(A + "-" + B + " = " + pengurangan);
        System.out.println(A + "*" + B + " = " + perkalian);
        System.out.println(A + "/" + B + " = " + pembagian);
              
    }
}
