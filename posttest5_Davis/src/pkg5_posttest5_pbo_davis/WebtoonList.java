/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_posttest5_pbo_davis;

/**
 *
 * @author Asus
 */
public class WebtoonList extends list {
    private int episodes;
    private final String platform = "Webtoon";

    public WebtoonList(String judul, String genre, String status, int episodes, String author, float rating) {
        super(judul, genre, status, author, rating);
        this.episodes = episodes;
    }

    public String getPlatform(){
        return platform;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public void display() {
        System.out.println(getJudul() + "(Platform: " + getPlatform() + ",Genre: " + getGenre() + ", Status: " + getStatus() + ", Episodes: " + episodes + ", Author: " + getAuthor() + ", Rating: " + getRating() + ")");
    }
}


