/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3.oopLatihan;
import java.util.Scanner;
class Menjual{
    private int jmlStok;
    private String namaBarang;
    private int stok;
    private int hargaSatuan;
    Menjual(int jmlStok){
      this.jmlStok = jmlStok;
    }
    public void setBarang(String namaBarang, int hargaSatuan){
        this.namaBarang = namaBarang;
        this.hargaSatuan = hargaSatuan;
    }
    private int setHarga(){
        int hasil;
        hasil = this.jmlStok *= this.hargaSatuan;
        return hasil;
    }
    public void getTampilan(){
        System.out.println("===================");
        System.out.println();
        System.out.println("NAMA ALAT TULIS :" + " " + this.namaBarang);
        System.out.println("STOK :" + " " + this.jmlStok);
        System.out.println("HARGA SATUAN :" + " " + this.hargaSatuan);
        System.out.println("HARAGA"+this.namaBarang+" :" + " " + setHarga());
        System.out.println("*******************");
    }
  
}

/**
 *
 * @author Muhammad bintang
 */
public class LatihanSoal {
    public static void main(String[]args){
         Menjual barang1 = new Menjual(10);
         Menjual barang2 = new Menjual(10);
         Menjual barang3 = new Menjual(10);
         String namaBarang;
         int hargaSatuan;
         System.out.println("========= OUTPUT =========");
         barang1.setBarang("Bolpen", 2000);
         barang1.getTampilan();
         
         barang2.setBarang("pensi", 1000);
         barang2.getTampilan();
         
         barang3.setBarang("Bolpen", 500);
         barang3.getTampilan();
    }
    }
