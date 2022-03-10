import java.io.Serializable;
import java.util.ArrayList;

public class MovieWithoutActors implements Serializable {
    private int number;
    private String title;
    private String genre;
    private int releaseYear;
    private Double rate;

    public MovieWithoutActors(int number, String title, String genre, int releaseYear, double rate) {
        this.number = number;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rate = rate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "MovieWithoutActors{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", rate=" + rate +
                '}';
    }

    public static String listOfAll(String input) {
        ArrayList<ArrayList<String>> movies = new ArrayList<>();

        ArrayList<String> listOfMovies = new ArrayList<>();
        listOfMovies.add("The Shawshank Redemption");
        listOfMovies.add("The Godfather");
        listOfMovies.add("The Godfather: Part II");
        listOfMovies.add("Pulp Fiction");
        listOfMovies.add("Inception");
        listOfMovies.add("Schindler's List");
        listOfMovies.add("12 Angry Men ");
        listOfMovies.add("The Dark Knight");
        listOfMovies.add("Star Wars: Episode V - The Empire Strikes Back");
        listOfMovies.add("The Lord of the Rings: The Return of the King");
        listOfMovies.add("Shichinin no samurai");
        listOfMovies.add("Star Wars");


        ArrayList<String> moviesYear = new ArrayList<>();
        moviesYear.add("1994");
        moviesYear.add("1972");
        moviesYear.add("1966");
        moviesYear.add("1994");
        moviesYear.add("2010");
        moviesYear.add("1993");
        moviesYear.add("1956");
        moviesYear.add("1978");
        moviesYear.add("2008");
        moviesYear.add("2013");
        moviesYear.add("2020");
        moviesYear.add("2021");
        ArrayList<String> actorsListG = new ArrayList<>();
        actorsListG.add("Robert De Niro" + "Jack Nicholson" + "Marlon Brando" + "Denzel Washington");
        actorsListG.add("Johnny Depp" + "Susan Sarandon" + "Katharine Hepburn" + "Meryl Streep");
        actorsListG.add("James Cagney" + "Kirk Douglas" + "Sidney Poitier" + " Jeff Bridges");
        actorsListG.add("Robert De Niro" + "Ingrid Bergman" + "Angelina Jolie" + "Tom Hanks");
        actorsListG.add("Grace Kelly" + "Cary Grant" + "Marlon Brando" + "Elizabeth Taylor");
        actorsListG.add("Steve McQueen" + "Will Smith" + "Charlton Heston" + "Bette Davis");
        actorsListG.add("Morgan Freeman" + "Marilyn Monroe" + "Marlon Brando" + "Ava Gardner");
        actorsListG.add("Joan Crawford" + "Jack Nicholson" + "Gary Cooper" + "Michelle Pfeiffer");
        actorsListG.add("Isabelle Huppert" + "Spencer Tracy" + "Marlon Brando" + "Shirley MacLaine");
        actorsListG.add("Hilary Swank" + "Halle Berry" + "Tom Cruise" + "Peter O'Toole");
        actorsListG.add("Julia Roberts" + "Regina King" + "Natalie Portman" + "Penélope Cruz");
        actorsListG.add("Judy Garland" + "Cate Blanchett" + "Leonardo DiCaprio" + "Jack Lemmon");

        movies.add(listOfMovies);
        movies.add(moviesYear);
        movies.add(actorsListG);
        for (ArrayList<String> element: movies) {
            if (element.contains(input)){
                System.out.println(input+" is available in our list");
                int name =element.indexOf(input);
                System.out.println("movies number "+(name+1));
            }

        }
        return null;
    }


    public static void menuMovie() {

        ArrayList<String> listOfMovies = new ArrayList<>();
        listOfMovies.add("The Shawshank Redemption");
        listOfMovies.add("The Godfather");
        listOfMovies.add("The Godfather: Part II");
        listOfMovies.add("Pulp Fiction");
        listOfMovies.add("Inception");
        listOfMovies.add("Schindler's List");
        listOfMovies.add("12 Angry Men ");
        listOfMovies.add("The Dark Knight");
        listOfMovies.add("Star Wars: Episode V - The Empire Strikes Back");
        listOfMovies.add("The Lord of the Rings: The Return of the King");
        listOfMovies.add("Shichinin no samurai");
        listOfMovies.add("Star Wars");
        System.out.println(listOfMovies);
    }

    public static MovieWithoutActors arraylistMovies(int arraylistMovies) {
        ArrayList<ArrayList<String>> movies = new ArrayList<>();

        ArrayList<String> listOfMovies = new ArrayList<>();
        listOfMovies.add("The Shawshank Redemption");
        listOfMovies.add("The Godfather");
        listOfMovies.add("The Godfather: Part II");
        listOfMovies.add("Pulp Fiction");
        listOfMovies.add("Inception");
        listOfMovies.add("Schindler's List");
        listOfMovies.add("12 Angry Men ");
        listOfMovies.add("The Dark Knight");
        listOfMovies.add("Star Wars: Episode V - The Empire Strikes Back");
        listOfMovies.add("The Lord of the Rings: The Return of the King");
        listOfMovies.add("Shichinin no samurai");
        listOfMovies.add("Star Wars");


        ArrayList<String> moviesYear = new ArrayList<>();
        moviesYear.add("1994");
        moviesYear.add("1972");
        moviesYear.add("1966");
        moviesYear.add("1994");
        moviesYear.add("2010");
        moviesYear.add("1993");
        moviesYear.add("1956");
        moviesYear.add("1978");
        moviesYear.add("2008");
        moviesYear.add("2013");
        moviesYear.add("2020");
        moviesYear.add("2021");
        ArrayList<String> actorsListG = new ArrayList<>();
        actorsListG.add("Robert De Niro" + "Jack Nicholson" + "Marlon Brando" + "Denzel Washington");
        actorsListG.add("Johnny Depp" + "Susan Sarandon" + "Katharine Hepburn" + "Meryl Streep");
        actorsListG.add("James Cagney" + "Kirk Douglas" + "Sidney Poitier" + " Jeff Bridges");
        actorsListG.add("Robert De Niro" + "Ingrid Bergman" + "Angelina Jolie" + "Tom Hanks");
        actorsListG.add("Grace Kelly" + "Cary Grant" + "Marlon Brando" + "Elizabeth Taylor");
        actorsListG.add("Steve McQueen" + "Will Smith" + "Charlton Heston" + "Bette Davis");
        actorsListG.add("Morgan Freeman" + "Marilyn Monroe" + "Marlon Brando" + "Ava Gardner");
        actorsListG.add("Joan Crawford" + "Jack Nicholson" + "Gary Cooper" + "Michelle Pfeiffer");
        actorsListG.add("Isabelle Huppert" + "Spencer Tracy" + "Marlon Brando" + "Shirley MacLaine");
        actorsListG.add("Hilary Swank" + "Halle Berry" + "Tom Cruise" + "Peter O'Toole");
        actorsListG.add("Julia Roberts" + "Regina King" + "Natalie Portman" + "Penélope Cruz");
        actorsListG.add("Judy Garland" + "Cate Blanchett" + "Leonardo DiCaprio" + "Jack Lemmon");

        movies.add(listOfMovies);
        movies.add(moviesYear);
        movies.add(actorsListG);
        System.out.println(listOfMovies.get(arraylistMovies-1) + " " + moviesYear.get(arraylistMovies - 1));
        return null;
    }
    //calculate users input avrage by rate and avrage it
    public static void avrage(int avrage) {
        int avrage1 = 0;
        for (int i = 0; i < avrage; i++) {
            avrage1 = avrage1 + i;
        }
        System.out.println("avrage is " + avrage1 / avrage);
    }

    public  static int arrayListOfrate(int rate){
        ArrayList rates = new ArrayList<Double>();
        rates.add(9.2);
        rates.add(9.1);
        rates.add(8);
        rates.add(7.8);
        rates.add(6.1);
        rates.add(4.1);
        rates.add(9.4);
        rates.add(7.9);
        rates.add(6);
        rates.add(9.7);
        rates.add(4.7);
        rates.add(7.7);

        System.out.println(rates.get(rate-1)+" "+"rate accourding to imdb");


        return 0;
    }
    public  static double updateListOfrate(int rate, double newRate){
        ArrayList up = new ArrayList<Double>();
        up.add(9.2);
        up.add(9.1);
        up.add(8);
        up.add(7.8);
        up.add(6.1);
        up.add(4.1);
        up.add(9.4);
        up.add(7.9);
        up.add(6);
        up.add(9.7);
        up.add(4.7);
        up.add(7.7);



        up.set(rate-1,(newRate));


        System.out.println("Update rate of movie "+up.get(rate-1));


        return 0;
    }

}





