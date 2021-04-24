/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ASUS
 */
class Mapel {
    private String jenisbuku;
    private String genrebuku;
    private int maxdurasi;

    public Mapel(String jenisbuku, String genrebuku, int maxdurasi) {
        this.jenisbuku = jenisbuku;
        this.genrebuku = genrebuku;
        this.maxdurasi = maxdurasi;
        
    }

    public void info() {
        System.out.println("Jenis Buku                      : " + this.jenisbuku);
        System.out.println("Genre Buku                      : " + this.genrebuku);
        System.out.println("Maksimal Durasi Pinjam          : " + this.maxdurasi + " Hari");
    }

}
