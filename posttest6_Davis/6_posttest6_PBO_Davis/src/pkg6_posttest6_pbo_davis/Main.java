/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_posttest6_pbo_davis;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<WebtoonList> webtoonLists = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("==== List Komik ====");
            System.out.println("1. Tambah List Komik");
            System.out.println("2. Tampilkan List Komik");
            System.out.println("3. Ubah List Komik");
            System.out.println("4. Hapus List Komik");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan: ");

            int opsi = input.nextInt();
            input.nextLine();

            switch (opsi) {
                case 1:
                    System.out.println("Masukkan Judul Komik   : ");
                    String judul = input.nextLine();

                    System.out.println("Masukkan Genre Komik   : ");
                    String genre = input.nextLine();

                    System.out.println("Masukkan Status Komik  : ");
                    String status = input.nextLine();

                    System.out.println("Masukkan Episode Komik :  ");
                    int episodes = input.nextInt();
                    input.nextLine();

                    System.out.println("Masukkan Author Komik  : ");
                    String author = input.nextLine();

                    System.out.println("Masukkan Rating Komik  : ");
                    String ratingString = input.nextLine();

                    WebtoonList newWebtoon = new WebtoonList(judul, genre, status, author, 0.0f, episodes);
                    newWebtoon.setRating(ratingString);
                    webtoonLists.add(newWebtoon);
                    break;

                case 2:
                    System.out.println("==== List Komik ====");
                    for (WebtoonList webtoon : webtoonLists) {
                        System.out.println(WebtoonList.display(webtoon));
                    }
                    break;

                case 3:
                    System.out.println("Masukkan judul untuk mengubah Komik:");
                    String judulToUpdate = input.nextLine();
                    WebtoonList webtoonToUpdate = findWebtoonByJudul(judulToUpdate);

                    if (webtoonToUpdate != null) {
                        System.out.println("Masukkan Judul Komik   : ");
                        String newJudul = input.nextLine();
                        if (!newJudul.isBlank()) {
                            webtoonToUpdate.setJudul(newJudul);
                        }

                        System.out.println("Masukkan Genre Komik   : ");
                        String newGenre = input.nextLine();
                        if (!newGenre.isBlank()) {
                            webtoonToUpdate.setGenre(newGenre);
                        }

                        System.out.println("Masukkan Status Komik  : ");
                        String newStatus = input.nextLine();
                        if (!newStatus.isBlank()) {
                            webtoonToUpdate.setStatus(newStatus);
                        }

                        System.out.println("Masukkan Episode Komik :  ");
                        String newEpisodesString = input.nextLine();
                        if (!newEpisodesString.isBlank()) {
                            try {
                                int newEpisodes = Integer.parseInt(newEpisodesString);
                                webtoonToUpdate.setEpisodes(newEpisodes);
                            } catch (NumberFormatException e) {
                                System.out.println("Jumlah episode harus dalam bilangan bulat");
                            }
                        }

                        System.out.println("Masukkan Author Komik  :: ");
                        String newAuthor = input.nextLine();
                        if (!newAuthor.isBlank()) {
                        webtoonToUpdate.setAuthor(newAuthor);
                        }
                         System.out.println("Masukkan Rating Komik  : ");
                    String newRatingString = input.nextLine();
                    if (!newRatingString.isBlank()) {
                        try {
                            float newRating = Float.parseFloat(newRatingString);
                            webtoonToUpdate.setRating(newRating);
                        } catch (NumberFormatException e) {
                            System.out.println("Rating harus dalam desimal");
                        }
                    }

                    System.out.println("Komik Berhasil Diubah...");
                    System.out.println(WebtoonList.display(webtoonToUpdate));
                } else {
                    System.out.println("Komik tidak ditemukan");
                }
                break;
                
                   case 4:
                System.out.println("Masukkan judul untuk menghapus Komik:");
                String judulToDelete = input.nextLine();
                WebtoonList webtoonToDelete = findWebtoonByJudul(judulToDelete);

                if (webtoonToDelete != null) {
                    webtoonLists.remove(webtoonToDelete);
                    System.out.println("Komik berhasil dihapus");
                } else {
                    System.out.println("Komik tidak ditemukan");
                }
                break;

            case 5:
                System.out.println("Terima kasih sudah menggunakan program ini");
                System.out.println("Selamat Tinggal!");
                System.exit(0);

            default:
                System.out.println("Pilihan Tidak Valid. Silakan coba lagi.");
                break;
        }
    }
}
          private static WebtoonList findWebtoonByJudul(String judul) {
    for (WebtoonList webtoon : webtoonLists) {
        if (webtoon.getJudul().equals(judul)) {
            return webtoon;
        }
    }
    return null;
}  


}                        

