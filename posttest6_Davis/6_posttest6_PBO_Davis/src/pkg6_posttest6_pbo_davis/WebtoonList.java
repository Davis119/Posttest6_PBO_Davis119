/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6_posttest6_pbo_davis;

/**
 *
 * @author Asus
 */
public class WebtoonList implements List {
    
    private String judul;
    private String genre;
    private String status;
    private int episodes;
    private String author;
    private float rating;
    
    public WebtoonList(String judul, String genre, String status, String author, float rating, int episodes) {
        this.judul = judul; 
        this.genre = genre;
        this.status = status;
        this.episodes = episodes;
        this.author = author;
        this.rating = rating;
    }

    
    public void setJudul(String judul) { 
        this.judul = judul;
    }
     
    @Override
    public String getJudul() { 
        return judul;
    }
     
    public void setGenre(String genre) { 
        this.genre = genre;
    }
     
    @Override
    public String getGenre() { 
        return genre;
    }
     
    public void setStatus(String status) { 
        this.status = status;
    }
     
    /**
     *
     * @return
     */
    @Override
    public String getStatus() { 
        return status;
    }
     
    public void setAuthor(String author) { 
        this.author = author;
    }
     
    @Override
    public String getAuthor() { 
        return author;
    }
    
    public void setRating(float rating) { 
        this.rating = rating;
    }
            
    /**
     *
     * @return
     */
    @Override
    public float getRating() { 
        return rating;
    }
    
    // Method overloading untuk menerima input rating dalam bentuk string
    public void setRating(String rating) { 
        try {
            this.rating = Float.parseFloat(rating);
        } catch (NumberFormatException e) {
            System.out.println("rating harus dalam bilangan desimal");
            this.rating = 0.0f;
        }
    }
    
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public int getEpisodes() {
        return episodes;
    }
    
    public static String display(WebtoonList webtoonLists) {
        return webtoonLists.getJudul() + " (Genre: " + webtoonLists.getGenre() + ", Status: " + webtoonLists.getStatus() + ", Episodes: " + webtoonLists.getEpisodes() + ", Author: " + webtoonLists.getAuthor() + ", Rating: " + webtoonLists.getRating() + ")";
    }


}
