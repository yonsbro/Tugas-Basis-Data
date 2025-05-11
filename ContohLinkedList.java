package tugas.pkg1.basis.data;

import java.util.LinkedList;

public class ContohLinkedList {
    public static void main(String[] args) {
        // Deklarasi LinkedList
        LinkedList<Integer> listAngka = new LinkedList<>();
        
        // Menambahkan elemen
        listAngka.add(26);
        listAngka.add(8);   // Angka 08 akan disimpan sebagai 8
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);
        
        // Menampilkan isi LinkedList
        System.out.println("Isi listAngka: " + listAngka);
    }
}