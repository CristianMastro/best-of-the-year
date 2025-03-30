package esercizio.best_of_the_year.models;

public class Movie {
    
    private int id;
    private String titolo;
    private int anno;
    private String descrizione;

    public Movie(int id, String titolo, int anno, String descrizione) {
        this.id = id;
        this.titolo = titolo;
        this.anno = anno;
        this.descrizione = descrizione;
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
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    
}
