
package model;


public class PenghuniPanti {
    
    // ENKAPSULASI
    private int idPenghuni;
    private String nama;
    private int usia;
    private String noTelp;
    private String jenisKelamin;
    private String kondisi;
    
    
    // CONSTRUCTOR
    public PenghuniPanti (int idPenghuni, String nama, int usia, String noTelp, 
            String jenisKelamin, String kondisi){
        this.idPenghuni = idPenghuni;
        this.nama = nama;
        this.usia = usia;
        this.noTelp = noTelp;
        this.jenisKelamin = jenisKelamin;
        this.kondisi = kondisi;
    }
    
    // GETTER
    public int getIdPenghuni(){
        return idPenghuni;
    }
    public String getNama(){
        return nama;
    }
    public int getUsia(){
        return usia;
    }
    public String getNoTelp(){
        return noTelp;
    } 
    public String getJenisKelamin(){
        return jenisKelamin;
    }  
    public String getKondisi(){
        return kondisi;
    }
    
    // SETTER
    public void setIdPenghuni(int idPenghuni) {
        this.idPenghuni = idPenghuni;
    }   
    public void setNama(String nama) {
        this.nama = nama;
    }   
    public void setUsia(int usia) {
        this.usia = usia;
    }  
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    } 
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }   
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    
    // METHOD
    public void tampilkanInfo() {
        System.out.printf("%-10s | %-25s | %-5d | %-12s | %-15s | %-25s\n", 
                idPenghuni, nama, usia, jenisKelamin, noTelp, kondisi);
    }

}

