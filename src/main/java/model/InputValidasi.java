
package model;


public class InputValidasi {

    // VALIDASI ID PENGHUNI
    public static boolean validasiIdPenghuni(int idPenghuni) {
        if (idPenghuni <= 0) {
            System.out.println("\n===========================================================");
            System.out.println("========= ERROR: ANGKA TIDAK BOLEH ANGKA NEGATIF ==========");
            System.out.println("===========================================================\n");
            System.out.println("");
            return false;
        } else {
            return true;
        }
    }

    // VALIDASI NAMA PENGHUNI
    public static boolean validasiNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("\n===========================================================");
            System.out.println("============ ERROR: NAMA TIDAK BOLEH KOSONG! ==============");
            System.out.println("===========================================================\n");
            return false;
        } else if (!nama.matches("[a-zA-Z ]+")) {
            System.out.println("\n===========================================================");
            System.out.println("== ERROR: NAMA TIDAK BOLEH BERISIKAN ANGKA ATAU SIMBOL! ===");
            System.out.println("===========================================================\n");
            return false;
        } else {
            return true;
        }
    }

    // VALIDASI USIA PENGHUNI
    public static boolean validasiUsia(int usia) {
        if (usia <= 0) {
            System.out.println("\n===========================================================");
            System.out.println("========= ERROR: USIA TIDAK BOLEH ANGKA NEGATIF! ==========");
            System.out.println("===========================================================\n");
            return false;
        } else {
            return true;
        }
    }

    // VALIDASI JENIS KELAMIN PENGHUNI
    public static boolean validasiJenisKelamin(String jenisKelamin) {
        if (!jenisKelamin.matches("[a-zA-Z ]+")) {
            System.out.println("\n===================================================================");
            System.out.println("== ERROR: JENIS KELAMIN TIDAK BOLEH BERISIKAN ANGKA ATAU SIMBOL! ==");
            System.out.println("===================================================================\n");
            return false;
        } else {
            return true;
        }
    }

    // VALIDASI NOMOR TELEPON
    public static boolean validasiNoTelp(String noTelp) {
        if (!noTelp.matches("[0-9]+")) {
            System.out.println("\n===========================================================");
            System.out.println("======== ERROR: NOMOR TELEPON HARUS BERUPA ANGKA! =========");
            System.out.println("===========================================================\n");
            return false;
        } else {
            return true;
        }
    }

    // VALIDASI KONDISI KESEHATAN
    public static boolean validasiKondisi(String kondisi) {
        if (kondisi == null || kondisi.trim().isEmpty()) {
            System.out.println("\n===========================================================");
            System.out.println("============ ERROR: KONDISI TIDAK BOLEH KOSONG! ===========");
            System.out.println("===========================================================\n");
            return false;
        } else if (!kondisi.matches("[a-zA-Z ]+")) {
            System.out.println("\n=============================================================");
            System.out.println("== ERROR: KONDISI TIDAK BOLEH BERISIKAN ANGKA ATAU SIMBOL! ==");
            System.out.println("=============================================================\n");
            return false;
        }
        else {
            return true;
        }
    }
}