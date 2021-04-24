/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;


class buku extends Mapel {

    private String buku;

    public buku(String buku, String jenisbuku, String genrebuku, int maxdurasi) {
        super(jenisbuku, genrebuku, maxdurasi);
        this.buku = buku;
    }

    @Override
    public void info() {
        System.out.println();
        System.out.println("Judul Buku                      : " + this.buku);
        super.info();
    }
}

public class Mapel3 {

    public static void main(String[] args) {
        Mapel2 cetak = new Mapel2();
        cetak.info();
    }
}
