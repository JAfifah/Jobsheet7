import java.util.Scanner;

public class WhileGaji14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = scan.nextInt();

        int i = 0;
        int totalGajiLembur = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            String jabatan = scan.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            int jumlahJamLembur = scan.nextInt();
            i++;

            int gajiLembur = 0;

            if (jabatan.equalsIgnoreCase("direktur")) {
                
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 750000;
            } else {
                System.out.println("Jabatan tidak valid. Masukkan jabatan yang sesuai.");
                i--; 
            }
            totalGajiLembur += gajiLembur;
        }

        System.out.println("Total gaji lembur: " + totalGajiLembur);

        scan.close();
    }
}
