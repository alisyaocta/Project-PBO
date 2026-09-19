package model;

import java.util.ArrayList;
import java.util.Scanner;

public class PenghuniCRUD {

    private ArrayList<PenghuniPanti> daftarPenghuni;

    private Scanner scanner;

    // CONSTRUCTOR
    public PenghuniCRUD(Scanner scanner) {
        this.daftarPenghuni = new ArrayList<>();
        this.scanner = scanner;
    }

    // TAMBAH DATA PENGHUNI
    
    public void tambahPenghuni() {
        System.out.println("\n=====================================================");
        System.out.println("============= TAMBAH DATA PENGHUNI PANTI ============");
        System.out.println("=====================================================");
        System.out.println("| 1. Penghuni Khusus                                |");
        System.out.println("| 2. Penghuni NonKhusus                             |");
        System.out.println("| 3. Kembali                                        |");
        System.out.println("=====================================================");

        int jenisPenghuni;

        while (true) {
            System.out.print("\nPilih Jenis Penghuni : ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n====================================================");
                System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                System.out.println("====================================================\n");
                scanner.next();
                continue;
            }
            jenisPenghuni = scanner.nextInt();
            scanner.nextLine();
            if (jenisPenghuni == 1 || jenisPenghuni == 2 || jenisPenghuni == 3) {
                break;
            }
            System.out.println("\n====================================================");
            System.out.println("============ PILIHAN ANDA TIDAK VALID! =============");
            System.out.println("====================================================\n");
        }

        // JIKA MEMILIH 3, KEMBALI KE MENU UTAMA

        if (jenisPenghuni == 3) {
            System.out.println("\n====================================================");
            System.out.println("========== KEMBALI KE MENU UTAMA... ================");
            System.out.println("====================================================\n");
            return;
        }

        // INPUT DATA DASAR PENGHUNI
        int idPenghuni;
        do {
            System.out.print("ID Penghuni Panti: ");
            while (!scanner.hasNextInt()) {
                System.out.println("\n====================================================");
                System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                System.out.println("====================================================\n");
                scanner.next();
                System.out.print("ID Penghuni Panti: ");
            }
            idPenghuni = scanner.nextInt();
            scanner.nextLine();
        } while (!InputValidasi.validasiIdPenghuni(idPenghuni));

        String nama;
        do {
            System.out.print("Nama Penghuni Panti: ");
            nama = scanner.nextLine();
        } while (!InputValidasi.validasiNama(nama));

        int usia;
        do {
            System.out.print("Usia Penghuni Panti: ");
            while (!scanner.hasNextInt()) {
                System.out.println("\n====================================================");
                System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                System.out.println("====================================================\n");
                scanner.next();
                System.out.print("Usia Penghuni Panti: ");
            }
            usia = scanner.nextInt();
            scanner.nextLine();
        } while (!InputValidasi.validasiUsia(usia));

        String noTelp;
        do {
            System.out.print("Nomor Telepon Keluarga: ");
            noTelp = scanner.nextLine();
        } while (!InputValidasi.validasiNoTelp(noTelp));

        String jenisKelamin;
        do {
            System.out.print("Jenis Kelamin: ");
            jenisKelamin = scanner.nextLine();
        } while (!InputValidasi.validasiJenisKelamin(jenisKelamin));

        String kondisi;
        do {
            System.out.print("Kondisi Kesehatan Penghuni: ");
            kondisi = scanner.nextLine();
        } while (!InputValidasi.validasiKondisi(kondisi));

        // MEMBUAT OBJEK BERDASARKAN JENIS PENGHUNI

        if (jenisPenghuni == 1) {
            // DATA TAMBAHAN PENGHUNI KHUSUS
            System.out.print("Jadwal Perawatan: ");
            String jadwalPerawatan = scanner.nextLine();

            System.out.print("Jadwal Pemberian Obat: ");
            String jadwalObat = scanner.nextLine();

            // INHERITANCE
            PenghuniPanti penghuniBaru = new PenghuniKhusus(
                    idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi, jadwalPerawatan, jadwalObat);
            daftarPenghuni.add(penghuniBaru);
        } else if (jenisPenghuni == 2) {
            // DATA TAMBAHAN PENGHUNI NONKHUSUS
            System.out.print("Jadwal Kegiatan: ");
            String jadwalKegiatan = scanner.nextLine();

            // INHERITANCE
            PenghuniPanti penghuniBaru = new PenghuniNonKhusus(
                    idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi, jadwalKegiatan);
            daftarPenghuni.add(penghuniBaru);
        }
        System.out.println("\n====================================================");
        System.out.println("======= DATA PENGHUNI BERHASIL DITAMBAH! ===========");
        System.out.println("====================================================\n");
    }

    // TAMPILKAN DATA PENGHUNI

public void tampilkanPenghuni() {

    if (daftarPenghuni.isEmpty()) {
        System.out.println("\n====================================================");
        System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
        System.out.println("====================================================\n");
        return;
    }

    boolean berjalan = true;

    while (berjalan) {
        System.out.println("\n=====================================================");
        System.out.println("=========== TAMPILKAN DATA PENGHUNI =================");
        System.out.println("=====================================================");
        System.out.println("| 1. Data Penghuni Khusus                           |");
        System.out.println("| 2. Data Penghuni NonKhusus                        |");
        System.out.println("| 3. Semua Data Penghuni                            |");
        System.out.println("| 4. Kembali                                        |");
        System.out.println("=====================================================");

        System.out.print("\nPilih Menu (1-4): ");

        if (!scanner.hasNextInt()) {
            System.out.println("\n=====================================================");
            System.out.println("============= INPUT HARUS BERUPA ANGKA! =============");
            System.out.println("=====================================================\n");
            scanner.next();
            continue;
        }

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {

            // DATA PENGHUNI KHUSUS
            case 1 -> {
                boolean ditemukan = false;

                System.out.println("\n=========================================================================================================");
                System.out.println("                                        DATA PENGHUNI KHUSUS");
                System.out.println("=========================================================================================================");
                System.out.printf(
                        "%-5s | %-25s | %-5s | %-15s | %-15s | %-35s%n",
                        "ID", "NAMA", "USIA", "JENIS KELAMIN", "NO TELP", "KONDISI KESEHATAN");
                System.out.println("=========================================================================================================");

                for (PenghuniPanti p : daftarPenghuni) {
                    if (p instanceof PenghuniKhusus khusus) {
                        System.out.printf(
                                "%-5d | %-25s | %-5d | %-15s | %-15s | %-35s%n",
                                khusus.getIdPenghuni(), khusus.getNama(), khusus.getUsia(), khusus.getJenisKelamin(), 
                                khusus.getNoTelp(), khusus.getKondisi());
                        System.out.println("=========================================================================================================");
                        System.out.println("Jadwal Perawatan      : "
                                + khusus.getJadwalPerawatan());
                        System.out.println("Jadwal Pemberian Obat : "
                                + khusus.getJadwalObat());
                        
                        ditemukan = true;
                    }
                }
                if (!ditemukan) {
                    System.out.println("\n==============================================================================================");
                    System.out.println("============================   BELUM ADA DATA PENGHUNI KHUSUS   ==============================");
                    System.out.println("==============================================================================================\n");
                }
            }

            // DATA PENGHUNI NONKHUSUS
            
            case 2 -> {
                boolean ditemukan = false;
                System.out.println("\n=========================================================================================================");
                System.out.println("                                        DATA PENGHUNI NON KHUSUS                                         ");
                System.out.println("=========================================================================================================");

                System.out.printf(
                        "%-5s | %-25s | %-5s | %-15s | %-15s | %-35s%n",
                        "ID", "NAMA", "USIA", "JENIS KELAMIN", "NO TELP", "KONDISI KESEHATAN");
                System.out.println("=========================================================================================================");

                for (PenghuniPanti p : daftarPenghuni) {
                    if (p instanceof PenghuniNonKhusus nonKhusus) {
                        System.out.printf(
                                "%-5d | %-25s | %-5d | %-15s | %-15s | %-35s%n",
                                nonKhusus.getIdPenghuni(), nonKhusus.getNama(), nonKhusus.getUsia(),
                                nonKhusus.getJenisKelamin(), nonKhusus.getNoTelp(), nonKhusus.getKondisi());
                        System.out.println("=========================================================================================================");
                        System.out.println("Jadwal Kegiatan : "
                                + nonKhusus.getJadwalKegiatan());
                        
                        ditemukan = true;
                    }
                }
                if (!ditemukan) {
                    System.out.println("\n==============================================================================================");
                    System.out.println("===========================   BELUM ADA DATA PENGHUNI NON KHUSUS  ============================");
                    System.out.println("==============================================================================================\n");
                }
            }

            // SEMUA DATA
            
            case 3 -> {
                System.out.println("\n==============================================================================================");
                System.out.println("==========================  SEMUA DATA PENGHUNI PANTI RUMAH SENJA  ===========================");
                System.out.println("==============================================================================================\n");

                // PENGHUNI KHUSUS
                System.out.println("\n=====================================================");
                System.out.println("================ DATA PENGHUNI KHUSUS ===============");
                System.out.println("=====================================================\n");
                boolean adaKhusus = false;

                for (PenghuniPanti p : daftarPenghuni) {
                    if (p instanceof PenghuniKhusus) {

                        PenghuniKhusus khusus = (PenghuniKhusus) p;
                        System.out.println("ID Penghuni          : " + khusus.getIdPenghuni());
                        System.out.println("Nama                 : " + khusus.getNama());
                        System.out.println("Usia                 : " + khusus.getUsia());
                        System.out.println("Jenis Kelamin        : " + khusus.getJenisKelamin());
                        System.out.println("No Telp              : " + khusus.getNoTelp());
                        System.out.println("Kondisi Kesehatan    : " + khusus.getKondisi());
                        System.out.println("Jadwal Perawatan     : " + khusus.getJadwalPerawatan());
                        System.out.println("Jadwal Pemberian Obat: " + khusus.getJadwalObat());
                        System.out.println("=====================================================\n");

                        adaKhusus = true;
                    }
                }
                if (!adaKhusus) {
                    System.out.println("\n=====================================================");
                    System.out.println("=========== BELUM ADA DATA PENGHUNI KHUSUS ==========");
                    System.out.println("=====================================================\n");
                }

                // PENGHUNI NONKHUSUS

                System.out.println("\n=====================================================");
                System.out.println("============== DATA PENGHUNI NON KHUSUS =============");
                System.out.println("=====================================================\n");

                boolean adaNonKhusus = false;

                for (PenghuniPanti p : daftarPenghuni) {

                    if (p instanceof PenghuniNonKhusus) {

                        PenghuniNonKhusus nonKhusus =
                                (PenghuniNonKhusus) p;

                        System.out.println("ID Penghuni       : " + nonKhusus.getIdPenghuni());
                        System.out.println("Nama              : " + nonKhusus.getNama());
                        System.out.println("Usia              : " + nonKhusus.getUsia());
                        System.out.println("Jenis Kelamin     : " + nonKhusus.getJenisKelamin());
                        System.out.println("No Telp           : " + nonKhusus.getNoTelp());
                        System.out.println("Kondisi Kesehatan : " + nonKhusus.getKondisi());
                        System.out.println("Jadwal Kegiatan   : " + nonKhusus.getJadwalKegiatan());
                        System.out.println("=====================================================");

                        adaNonKhusus = true;
                    }
                }
                if (!adaNonKhusus) {
                    System.out.println("\n=====================================================");
                    System.out.println("========== BELUM ADA DATA PENGHUNI KHUSUS ===========");
                    System.out.println("=====================================================\n");
                }
            }

            // KEMBALI
            
            case 4 -> {
                berjalan = false;
                System.out.println("\n=====================================================");
                System.out.println("============== KEMBALI KE MENU UTAMA... =============");
                System.out.println("=====================================================\n");
            }
            default -> {
                System.out.println("\n=====================================================");
                System.out.println("============= PILIHAN ANDA TIDAK VALID! =============");
                System.out.println("=====================================================\n");
            }
        }
    }
}

    // HAPUS DATA PENGHUNI

    public void hapusPenghuni() {
        if (daftarPenghuni.isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
            System.out.println("====================================================\n");
            return;
        }
        
        System.out.print("Masukkan ID Penghuni: ");

        while (!scanner.hasNextInt()) {
            System.out.println("\n====================================================");
            System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
            System.out.println("====================================================\n");
            scanner.next();
            System.out.print("Masukkan ID Penghuni: ");
        }

        int idTarget = scanner.nextInt();
        scanner.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < daftarPenghuni.size(); i++) {
            if (daftarPenghuni.get(i).getIdPenghuni() == idTarget) {
                daftarPenghuni.remove(i);
                System.out.println("\n====================================================");
                System.out.println("========= DATA PENGHUNI BERHASIL DIHAPUS! ==========");
                System.out.println("====================================================\n");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("\n====================================================");
            System.out.println("====== ERROR: DATA PENGHUNI TIDAK DITEMUKAN! =======");
            System.out.println("====================================================\n");
        }
    }

    // UPDATE DATA PENGHUNI

    public void updatePenghuni() {

        if (daftarPenghuni.isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
            System.out.println("====================================================\n");
            return;
        }

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n====================================================");
            System.out.println("========= UPDATE DATA PENGHUNI RUMAH SENJA =========");
            System.out.println("====================================================");
            System.out.println("| 1. Update Umur Penghuni                          |");
            System.out.println("| 2. Update Kondisi Penghuni                       |");
            System.out.println("| 3. Update Data Khusus / Kegiatan                 |");
            System.out.println("| 4. Kembali                                       |");
            System.out.println("====================================================");

            System.out.print("\nPilih Menu (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n====================================================");
                System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                System.out.println("====================================================\n");
                scanner.next();
                continue;
            }

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                // UPDATE USIA

                case 1 -> {
                    System.out.print("Masukkan ID Penghuni: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("\n====================================================");
                        System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                        System.out.println("====================================================\n");

                        scanner.next();
                        System.out.print("Masukkan ID Penghuni: ");
                    }

                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    boolean ditemukan = false;

                    for (PenghuniPanti p : daftarPenghuni) {
                        if (p.getIdPenghuni() == idTarget) {
                            int usiaBaru;
                            do {
                                System.out.print("Update Usia Penghuni: ");

                                while (!scanner.hasNextInt()) {
                                    System.out.println("\n====================================================");
                                    System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                                    System.out.println("====================================================\n");

                                    scanner.next();
                                    System.out.print("Update Usia Penghuni: ");
                                }

                                usiaBaru = scanner.nextInt();
                                scanner.nextLine();

                            } while (!InputValidasi.validasiUsia(usiaBaru));

                            p.setUsia(usiaBaru);

                            System.out.println("\n====================================================");
                            System.out.println("===== USIA PENGHUNI PANTI BERHASIL DIPERBARUI ======");
                            System.out.println("====================================================\n");

                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("\n====================================================");
                        System.out.println("====== ERROR: DATA PENGHUNI TIDAK DITEMUKAN! =======");
                        System.out.println("====================================================\n");
                    }
                }

                // UPDATE KONDISI
                
                case 2 -> {
                    System.out.print("Masukkan ID Penghuni: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("\n====================================================");
                        System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                        System.out.println("====================================================\n");

                        scanner.next();
                        System.out.print("Masukkan ID Penghuni: ");
                    }

                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    boolean ditemukan = false;

                    for (PenghuniPanti p : daftarPenghuni) {

                        if (p.getIdPenghuni() == idTarget) {
                            String kondisiBaru;
                            do {
                                System.out.print("Update Kondisi Terbaru Penghuni: ");
                                kondisiBaru = scanner.nextLine();
                            } while (!InputValidasi.validasiKondisi(kondisiBaru));

                            p.setKondisi(kondisiBaru);
                            System.out.println("\n====================================================");
                            System.out.println("KONDISI KESEHATAN PENGHUNI PANTI BERHASIL DIPERBARUI");
                            System.out.println("====================================================\n");

                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("\n====================================================");
                        System.out.println("====== ERROR: DATA PENGHUNI TIDAK DITEMUKAN! =======");
                        System.out.println("====================================================\n");
                    }
                }

                // UPDATE DATA KHUSUS / KEGIATAN

                case 3 -> {
                    System.out.print("Masukkan ID Penghuni: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("\n====================================================");
                        System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                        System.out.println("====================================================\n");

                        scanner.next();
                        System.out.print("Masukkan ID Penghuni: ");
                    }

                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    boolean ditemukan = false;

                    for (PenghuniPanti p : daftarPenghuni) {
                        if (p.getIdPenghuni() == idTarget) {
                            ditemukan = true;

                            // JIKA PENGHUNI KHUSUS
                            
                            if (p instanceof PenghuniKhusus) {

                                PenghuniKhusus khusus = (PenghuniKhusus) p;
                                System.out.println("\n====================================================");
                                System.out.println("========== DATA TAMBAHAN PENGHUNI KHUSUS ===========");
                                System.out.println("====================================================");
                                System.out.println("| 1. Update Jadwal Perawatan                       |");
                                System.out.println("| 2. Update Jadwal Pemberian Obat                  |");
                                System.out.println("| 3. Kembali                                       |");
                                System.out.println("====================================================");

                                System.out.print("\nPilih Menu (1-3): ");

                                if (!scanner.hasNextInt()) {
                                    System.out.println("\n====================================================");
                                    System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                                    System.out.println("====================================================\n");

                                    scanner.next();
                                    break;
                                }

                                int pilihanKhusus = scanner.nextInt();
                                scanner.nextLine();

                                switch (pilihanKhusus) {
                                    case 1 -> {
                                        System.out.print("Update Jadwal Perawatan: ");
                                        String jadwalBaru = scanner.nextLine();

                                        khusus.setJadwalPerawatan(jadwalBaru);

                                        System.out.println("\n====================================================");
                                        System.out.println("====== JADWAL PERAWATAN BERHASIL DIPERBARUI! =======");
                                        System.out.println("====================================================\n");
                                    }

                                    case 2 -> {
                                        System.out.print("Update Jadwal Pemberian Obat: ");
                                        String obatBaru = scanner.nextLine();

                                        khusus.setJadwalObat(obatBaru);

                                        System.out.println("\n====================================================");
                                        System.out.println("==== JADWAL PEMBERIAN OBAT BERHASIL DIPERBARUI! ====");
                                        System.out.println("====================================================\n");
                                    }

                                    case 3 -> {
                                        System.out.println("\n====================================================");
                                        System.out.println("========== KEMBALI KE MENU UPDATE... ===============");
                                        System.out.println("====================================================\n");
                                    }

                                    default -> {
                                        System.out.println("\n====================================================");
                                        System.out.println("============ PILIHAN ANDA TIDAK VALID! =============");
                                        System.out.println("====================================================\n");
                                    }
                                }

                            // JIKA PENGHUNI NONKHUSUS

                            } else if (p instanceof PenghuniNonKhusus) {
                                PenghuniNonKhusus nonKhusus = (PenghuniNonKhusus) p;
                                
                                System.out.println("\n====================================================");
                                System.out.println("======= DATA TAMBAHAN PENGHUNI NONKHUSUS ===========");
                                System.out.println("====================================================");
                                System.out.println("| 1. Update Jadwal Kegiatan                        |");
                                System.out.println("| 2. Kembali                                       |");
                                System.out.println("====================================================");

                                System.out.print("\nPilih Menu (1-2): ");

                                if (!scanner.hasNextInt()) {
                                    System.out.println("\n====================================================");
                                    System.out.println("============ INPUT HARUS BERUPA ANGKA! =============");
                                    System.out.println("====================================================\n");

                                    scanner.next();
                                    break;
                                }

                                int pilihanNonKhusus = scanner.nextInt();
                                scanner.nextLine();

                                switch (pilihanNonKhusus) {
                                    case 1 -> {
                                        System.out.print("Update Jadwal Kegiatan: ");
                                        String jadwalBaru = scanner.nextLine();

                                        nonKhusus.setJadwalKegiatan(jadwalBaru);

                                        System.out.println("\n====================================================");
                                        System.out.println("====== JADWAL KEGIATAN BERHASIL DIPERBARUI! ========");
                                        System.out.println("====================================================\n");
                                    }
                                    
                                    case 2 -> {
                                        System.out.println("\n====================================================");
                                        System.out.println("========== KEMBALI KE MENU UPDATE... ===============");
                                        System.out.println("====================================================\n");
                                    }
                                    
                                    default -> {
                                        System.out.println("\n====================================================");
                                        System.out.println("============ PILIHAN ANDA TIDAK VALID! =============");
                                        System.out.println("====================================================\n");
                                    }
                                }
                            }
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("\n===========================================================");
                        System.out.println("===== ERROR: DATA PENGHUNI TIDAK DITEMUKAN! ===============");
                        System.out.println("===========================================================\n");
                    }
                }
              
                // KEMBALI
            
                case 4 -> {
                    berjalan = false;
                    System.out.println("\n====================================================");
                    System.out.println("========== KEMBALI KE MENU SEBELUMNYA... ===========");
                    System.out.println("====================================================\n");
                }
                default -> {
                    System.out.println("\n====================================================");
                    System.out.println("============ PILIHAN ANDA TIDAK VALID! =============");
                    System.out.println("====================================================\n");
                }
            }
        }
    }

    // CARI DATA PENGHUNI

    public void cariPenghuni() {
        if (daftarPenghuni.isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
            System.out.println("====================================================\n");
            return;
        }

        System.out.print("Masukkan Nama Penghuni Panti: ");
        String namaTarget = scanner.nextLine();

        boolean ditemukan = false;

        for (PenghuniPanti p : daftarPenghuni) {
            if (p.getNama().equalsIgnoreCase(namaTarget)) {
                System.out.println("\n==================================================================================================================================================");
                System.out.printf(
                        "%-10s | %-25s | %-5s | %-12s | %-15s | %-25s | %-25s | %-25s%n",
                        "ID", "NAMA", "USIA", "JENIS KELAMIN", "NO TELP", "KONDISI KESEHATAN", "JADWAL PERAWATAN/ KEGIATAN", "JADWAL OBAT"
                );
                System.out.println("==================================================================================================================================================");

                // POLYMORPHISM
                p.tampilkanInfo();
                System.out.println("==================================================================================================================================================");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("\n===========================================================");
            System.out.println("==== ERROR: DATA DENGAN NAMA TERSEBUT TIDAK DITEMUKAN! ====");
            System.out.println("===========================================================\n");
        }
    }
}