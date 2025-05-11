public class MatriksAlfabet {
    public static void main(String[] args) {
        // Deklarasi array 2D
        String[][] alfabet = {
            {"p", "s", "n"},
            {"w", "l", "b"}, 
            {"f", "r", "e"}
        };

        // Menampilkan matriks
        System.out.println("Matriks Alfabet:");
        for (int i = 0; i < alfabet.length; i++) {
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.print(alfabet[i][j] + " ");
            }
            System.out.println(); // Pindah baris
        }
    }
}