import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        double nim = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan nomor absen: ");
        int absen = scanner.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = scanner.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = scanner.nextDouble();

        // Menghitung nilai akhir
        double nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.3) + (nilaiUjian * 0.5);

        // Menentukan nilai huruf dan kualifikasi
        String nilaiHuruf;
        String kualifikasi;
        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 80) {
            nilaiHuruf = "A-";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 75) {
            nilaiHuruf = "B+";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }

        // Menampilkan output
        System.out.println("\nMahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.printf("Nilai akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}