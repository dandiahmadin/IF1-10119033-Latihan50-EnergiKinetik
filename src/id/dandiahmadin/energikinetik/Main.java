/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.energikinetik;

/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung energi kinetik dengan pendekatan object oriented
 */
public class Main {
    public static void main(String[] args) {
        EnergiKinetik objEK = new EnergiKinetik(145, 25);
        System.out.println("===Menghitung Energi Kinetik===");
        System.out.printf("Massa : %.3f Kg\n", objEK.getMassa());
        System.out.printf("Kecepatan : %.0f m/s\n", objEK.getKecepatan() );
        System.out.printf("Energi Kinetik : %.4f J\n", objEK.hitungEnergiKinetik());
        System.out.printf("Usaha : %.4f J\n", objEK.hitungUsaha(0));
    }
}
