/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tdinh
 */
public class Movie {
    String title;
    String director;
    String actor;
    int rate;

    public Movie() {
    }

    public Movie(String title, String director, String actor, int rate) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.rate = rate;
    }
    
     public Movie(String title) {
        this.title = title;
        
    }
    
    
    
      
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + ", actor=" + actor + ", rate=" + rate + '}';
    }
    
   
    
}
