package esercizio.best_of_the_year.models;

public class Movie {
    
    private int id;
    private String titolo;

    public Movie(int id, String titolo) {
        this.id = id;
        this.titolo = titolo;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    
}
