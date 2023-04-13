/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_posttest5_pbo_davis;

/**
 *
 * @author Asus
 */

import java.util.ArrayList;
import java.util.Scanner;

// Class Main
public class Main {

public static void main(String[] args) {

// Membuat ArrayList untuk menyimpan objek WebtoonList
ArrayList<WebtoonList> webtoonLists = new ArrayList<>();
// Membuat objek scanner untuk input dari user
Scanner scanner = new Scanner(System.in);

while (true) {
        // Menampilkan pilihan menu
        System.out.println("==== List Komik ====");
        System.out.println("1. Tambah List Komik");
        System.out.println("2. Tampilkan List Komik");
        System.out.println("3. Ubah List Komik");
        System.out.println("4. Hapus List Komik");
        System.out.println("5. Exit");
        System.out.print("Masukkan pilihan: ");

        // Menerima input pilihan dari user
        int choice = scanner.nextInt();
        scanner.nextLine();

        // Menjalankan aksi sesuai pilihan yang dipilih
        if (choice == 1) {
            // Menambahkan objek WebtoonList baru ke dalam ArrayList
            System.out.println("Masukkan Judul Komik   : ");
            String judul = scanner.nextLine();

            System.out.println("Masukkan Genre Komik   : ");
            String genre = scanner.nextLine();

            System.out.println("Masukkan Status Komik  : ");
            String status = scanner.nextLine();

            System.out.println("Masukkan Episode Komik :  ");
            int episodes = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Masukkan Author Komik  : ");
            String author = scanner.nextLine();

            System.out.println("Masukkan Rating Komik  : ");
            float rating = scanner.nextFloat();
            scanner.nextLine();

            WebtoonList webtoonList = new WebtoonList(judul, genre, status, episodes, author, rating);
            webtoonLists.add(webtoonList);
            System.out.println("Komik sudah ditambahkan.");
        } else if (choice == 2) {
            // Menampilkan semua objek WebtoonList yang ada di dalam ArrayList
            System.out.println("==== List Komik ====");
            for (int i = 0; i < webtoonLists.size(); i++) {
                webtoonLists.get(i).display();
            }
        } else if (choice == 3) {
            // Mengubah objek WebtoonList yang ada di dalam ArrayList
            System.out.println("Masukkan nomor untuk mengubah Komik: ");
            int index = scanner.nextInt();
            scanner.nextLine();

            if (index > 0 && index <= webtoonLists.size()) {
                WebtoonList webtoonList = webtoonLists.get(index-1);

                System.out.println("Masukkan Judul Komik   : ");
                String judul = scanner.nextLine();
                webtoonList.setJudul(judul);

                System.out.println("Masukkan Genre Komik   : ");
                String genre = scanner.nextLine();
                webtoonList.setGenre(genre);

                System.out.println("Masukkan Status Komik  : ");
                String status = scanner.nextLine();
                webtoonList.setStatus(status);

                System.out.println("Masukkan Episode Komik :  ");
                int episodes = scanner.nextInt();
                scanner.nextLine();
                webtoonList.setEpisodes(episodes);

                System.out.println("Masukkan Author Komik  : ");
                String author = scanner.nextLine();
                webtoonList.setAuthor(author);
                
                System.out.println("Masukkan Rating Komik  : ");
                 float rating = scanner.nextFloat();
                 scanner.nextLine();
                 webtoonList.setRating(rating);
                 
                    System.out.println("Komik Berhasil Diubah...");
        } 
        
    } else if (choice == 4) {
        // Menghapus objek WebtoonList yang ada di dalam ArrayList
        System.out.println("Masukkan nomor untuk menghapus Komik: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index > 0 && index <= webtoonLists.size()) {
            webtoonLists.remove(index-1);
            System.out.println("Komik berhasil dihapus");
        } else {
            System.out.println("Nomor Komik Tidak Valid.");
        }
    } else if (choice == 5) {
        // Keluar dari program
        System.out.println("Selamat Tinggal!");
        break;
    } else {
        System.out.println("Pilihan Tidak Valid. Silakan coba lagi.");
    }
}
}
}

