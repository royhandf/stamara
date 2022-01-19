/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Royhan
 */
public class dataHash {
    private String nama, tujuan;
    private int ktp;
    
    public dataHash(int ktp, String nm, String tujuan) {
        this.ktp = ktp;
        this.nama = nm;
        this.tujuan = tujuan;
    }
    
    public int getKey() {
        return ktp;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setKTP(int ktp) {
        this.ktp = ktp;
    }
    
    public String getTujuan() {
        return tujuan;
    }
}
