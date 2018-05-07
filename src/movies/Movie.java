package movies;

public class Movie {
    private String name;
    private String category;


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }
    public String getMovie(){
        return this.name + this.category;
    }
    public void setMovie(String name, String category){
        this.name = name;
        this.category = category;
    }
}