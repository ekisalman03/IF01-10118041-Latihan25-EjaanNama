/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118041.latihan25.ejaannama;
import java.util.Scanner;
/**

 * Nama      : Eki salman sya'bani
 * Kelas     : IF-1
 * NIM       : 10118041
 * Deskripsi : Mengeja Nama
 * @author Eki
 */

public class IF0110118041Latihan25EjaanNama {


    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        // TODO code application logic here

        String nama;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = masuk.nextLine();
        System.out.println("\nEjaan untuk \"" + nama + "\" adalah :");
        char ejaan[] = nama.toCharArray();

        for (int i = 0; i <= (ejaan.length - 1); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + ejaan[i]);
        }
       System.out.println("");
    }
   

}