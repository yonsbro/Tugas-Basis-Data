package tugas.pkg1.basis.data;

public class ContohString {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi
        String kalimatBaru = "Deklarasi tipe data String";
        
        // Menggunakan variabel
        System.out.println("Isi variabel: " + kalimatBaru);
        
        // Operasi dasar String
        int panjang = kalimatBaru.length();
        String kapital = kalimatBaru.toUpperCase();
        
        System.out.println("Panjang teks: " + panjang + " karakter");
        System.out.println("Versi kapital: " + kapital);
    }
}