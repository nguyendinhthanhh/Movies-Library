
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tdinh
 */
public class MovieList {

    private ArrayList<Movie> danhsach;

    public MovieList() {
        this.danhsach = new ArrayList();
    }

    public void addtotal(Movie movie) {

        this.danhsach.add(movie);

    }

    public void displayList() {

        for (Object ds : danhsach) {
            System.out.println(ds);
        }
    }

    public void displayRate(String nameMovies) {

        for (Movie movie : danhsach) {

            if (movie.getTitle().equalsIgnoreCase(nameMovies)) {
                System.out.println(movie);
                break;
            }
        }
    }

}
