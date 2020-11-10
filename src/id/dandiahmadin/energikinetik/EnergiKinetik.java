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
 * Deskripsi Program : Program ini berisi class EnergiKinetik
 */
public class EnergiKinetik {
    private double massa, kecepatan;   
    
    public EnergiKinetik(double massa, double kecepatan) {
        this.massa = massa / 1000;
        this.kecepatan = kecepatan;
    }
    
    public double getMassa() {
        return massa;
    }
    
    public double getKecepatan() {
        return kecepatan;
    }
    
    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha(double kecepatanAwal) {
        return 0.5 * massa * (Math.pow(kecepatan, 2) - Math.pow(kecepatanAwal, 2));
    }
}
