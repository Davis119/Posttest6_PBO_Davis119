/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_posttest5_pbo_davis;

/**
 *
 * @author Asus
 */
public abstract class list {
    
    protected String judul;
    protected String genre;
    protected String status;
    protected String author;
    protected float rating;
    
    // Konstruktor untuk inisialisasi objek
    public list(String judul, String genre, String status, String author, float rating){
        this.judul = judul; 
        this.genre = genre;
        this.status = status;
        this.author = author;
        this.rating = rating;
    }
    
    public void setJudul(String judul) { 
        this.judul = judul;
    }
     
    public String getJudul() { 
        return judul;
    }
     
    public void setGenre(String genre) { 
        this.genre = genre;
    }
     
    public String getGenre() { 
        return genre;
    }
     
    public void setStatus(String status) { 
        this.status = status;
    }
     
    public String getStatus() { 
        return status;
    }
     
    public void setAuthor(String author) { 
        this.author = author;
    }
     
    public String getAuthor() { 
        return author;
    }
    
    public void setRating(float rating) { 
        this.rating = rating;
    }
            
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
    
    // Method abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void display();
}


