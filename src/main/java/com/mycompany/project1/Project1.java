
package com.mycompany.project1;

import model.PenghuniCRUD;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PenghuniCRUD service = new PenghuniCRUD(scanner);

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("\n====================================================");
            System.out.println("======= PENGELOLAAN DATA PENGHUNI RUMAH SENJA ======");
            System.out.println("====================================================");
            System.out.println("| 1. Tambah Data Penghuni                          |");
            System.out.println("| 2. Tampilkan Data Penghuni                       |");
            System.out.println("| 3. Hapus Data Penghuni                           |");
            System.out.println("| 4. Update Data Penghuni                          |");
            System.out.println("| 5. Cari Data Penghuni                            |");
            System.out.println("| 6. Keluar                                        |");
            System.out.println("====================================================");

            System.out.print("\nPilih Menu (1-6): ");
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

                case 1 -> service.tambahPenghuni();

                case 2 -> service.tampilkanPenghuni();

                case 3 -> service.hapusPenghuni();
                
                case 4 -> service.updatePenghuni();
                
                case 5 -> service.cariPenghuni();

                case 6 -> {
                    System.out.println("\n====================================================");
                    System.out.println("======== SELAMAT MENIKMATI MASA SENJA ANDA =========");
                    System.out.println("====================================================\n");
                    berjalan = false;
                }
                default -> {
                    System.out.println("\n====================================================");
                    System.out.println("============ PILIHAN ANDA TIDAK VALID! =============");
                    System.out.println("====================================================\n");
                }
            }
        }
    }
}

