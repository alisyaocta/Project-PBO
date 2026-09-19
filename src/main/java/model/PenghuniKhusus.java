package model;

public class PenghuniKhusus extends PenghuniPanti {

    private String jadwalPerawatan;
    private String jadwalObat;

    // CONSTRUCTOR
    public PenghuniKhusus(int idPenghuni, String nama, int usia, String noTelp,
            String jenisKelamin, String kondisi, String jadwalPerawatan, String jadwalObat) {

        super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi);

        this.jadwalPerawatan = jadwalPerawatan;
        this.jadwalObat = jadwalObat;
    }

    // GETTER
    public String getJadwalPerawatan() {
        return jadwalPerawatan;
    }

    public String getJadwalObat() {
        return jadwalObat;
    }

    // SETTER
    public void setJadwalPerawatan(String jadwalPerawatan) {
        this.jadwalPerawatan = jadwalPerawatan;
    }

    public void setJadwalObat(String jadwalObat) {
        this.jadwalObat = jadwalObat;
    }

    // POLYMORPHISM
    @Override
    public void tampilkanInfo() {
        System.out.printf("%-5d | %-25s | %-5d | %-12s | %-15s | %-25s | %-25s | %-35s%n",
                getIdPenghuni(), getNama(), getUsia(), getJenisKelamin(), getNoTelp(), getKondisi(),
                jadwalPerawatan, jadwalObat);
    }
}