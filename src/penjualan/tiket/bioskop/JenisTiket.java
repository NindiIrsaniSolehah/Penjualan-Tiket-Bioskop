/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.tiket.bioskop;

/**
 *
 * @author HP
 */
//Class
public class JenisTiket {
    private String jenis;
    private int harga;

    //Constructor
    public JenisTiket(String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return this.jenis;
    }

    /**
     * @return the jenis
     */
    public String getNamaBarang() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setNamaBarang(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}