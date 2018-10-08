/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan38.ojectorientedperhitunganlingkaran;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Menghitung dan menghasilkan hasil Luas Lingkaran,
 * Jari-Jari Lingkaran, dan keliling Keliaran berdasarkan Object
 */
public class PBO310117104Latihan38OjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Lingkaran lingkar = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        lingkar.validasiInput();
        lingkar.hasilPerhitungan(lingkar.diameter);
    }
}
