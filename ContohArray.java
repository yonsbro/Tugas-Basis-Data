package tugas.pkg1.basis.data;

public class ContohArray {
    public static void main(String[] args) {
        // Deklarasi & inisialisasi array
        int[] empatAngka = {7, 10, 20, 23};
        
        // Mengakses elemen array
        System.out.println("Elemen ke-0: " + empatAngka[0]); // Output: 7
        System.out.println("Elemen ke-2: " + empatAngka[2]); // Output: 20
        
        // Menampilkan semua elemen
        System.out.println("\nIsi array:");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.println("Index " + i + ": " + empatAngka[i]);
        }
    }
}