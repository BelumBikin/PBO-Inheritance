/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mapel2 {
    
    void info() {

        Scanner tulis = new Scanner(System.in);
        System.out.println("=======Pilih Paket Yang ingin Dipinjam=======");
        System.out.println("1. Paket Marmut Merah jambu");
        System.out.println("2. Paket Cara Menerbangkan Drone, 100 Persen Mudah");
        System.out.println("3. Paket Sejarah Majapahit");
        System.out.println("4. Paket 100 Binatang Laut Popular \n");
        System.out.print("Masukkan No Buku   : ");
        int x = tulis.nextInt();

        if (x >= 1 && x <= 4) {
            if (x == 1) {
                buku cetak1 = new buku("Marmut Merah Jambu", "Novel", "Komedi", 2);
                cetak1.info();
            }
            if (x == 2) {
                buku cetak2 = new buku("Cara Menerbangkan Drone, 100 Persen Mudah", "Hobi", "Hobi", 4);
                cetak2.info();
            }
            if (x == 3) {
                buku cetak3 = new buku("Sejarah Majapahit", "Buku Paket", "Pembelajaran", 2);
                cetak3.info();
            }
            if (x == 4) {
                buku cetak4 = new buku("100 Binatang Laut Popular", "Ensiklopedi", "Pembelajaran", 2);
                cetak4.info();
            }

        } else {
            System.out.println("Maaf No Buku Tidak Valid");

        }
    }

}
