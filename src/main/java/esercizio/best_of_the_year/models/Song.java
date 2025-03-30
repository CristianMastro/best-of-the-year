package esercizio.best_of_the_year.models;

public class Song {
    
    private int id;
    private String titolo;
    private int anno;
    private String genere;

    public Song(int id, String titolo, int anno, String genere) {
        this.id = id;
        this.titolo = titolo;
        this.anno = anno;
        this.genere = genere;
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
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }

    
}
