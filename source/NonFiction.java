package source;

public class NonFiction implements Genre {
    private String GENRE = "Non-Fiction";
    private String subGenre;
    private double genreDiscount;

    public NonFiction(String subGenre) {
        this.subGenre = subGenre;
        genreDiscount = 10.0;
    }

    public String getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(String subGenre) {
        this.subGenre = subGenre;
    }

    @Override
    public String getGenre() {
        return GENRE;
    }

    public double getGenreDiscount() {
        return genreDiscount;
    }

    public void setGenreDiscount(double genreDiscount) {
        this.genreDiscount = genreDiscount;
    }
}
