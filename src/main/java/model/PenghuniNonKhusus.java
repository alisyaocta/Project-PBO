package model;

public class PenghuniNonKhusus extends PenghuniPanti {

    private String jadwalKegiatan;

    // CONSTRUCTOR
    public PenghuniNonKhusus(int idPenghuni, String nama, int usia, String noTelp,
            String jenisKelamin, String kondisi, String jadwalKegiatan) {

        super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi);

        this.jadwalKegiatan = jadwalKegiatan;
    }

    // GETTER
    public String getJadwalKegiatan() {
        return jadwalKegiatan;
    }

    // SETTER
    public void setJadwalKegiatan(String jadwalKegiatan) {
        this.jadwalKegiatan = jadwalKegiatan;
    }

    // POLYMORPHISM
    @Override
    public void tampilkanInfo() {
        System.out.printf(
                "%-5d | %-25s | %-5d | %-12s | %-15s | %-25s | %-25s | %-35s%n",
                getIdPenghuni(), getNama(), getUsia(), getJenisKelamin(), getNoTelp(),
                getKondisi(), jadwalKegiatan, "-");
    }
}