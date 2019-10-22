/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan hukum ohm menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai b = new Baterai();
        
        System.out.println("Hukum Ohm\nKuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan beda potensial pada ujung-ujung kawat penghantar tersebut asal suhu kawat dijaga konstan");
        System.out.println("Kuat arus : "+b.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+b.getHambatan()+" ohm");
        System.out.println("Hasil tegangan : "+b.hitungTegangan()+" volt");
    }
    
}
