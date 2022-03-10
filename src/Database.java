

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static @NotNull List<ArrayList<String>> usersAllPrint(
            String registerNewUser, String password) {
        ArrayList<ArrayList<String>> allUsers = new ArrayList<>();
        for(int i = 0; i<allUsers.size(); i++) {
            System.out.println(allUsers.get(i));
        }

        ArrayList<String> userAccountArrayListG = new ArrayList<>();

        userAccountArrayListG.add (registerNewUser);
        for (String s : userAccountArrayListG) {
            System.out.println(s);
        }



        ArrayList<String> passwordArrayList = new ArrayList<>();
        passwordArrayList.add(password);


        allUsers.add(userAccountArrayListG);
        allUsers.add(passwordArrayList);
        System.out.println("User: " + allUsers);


        return allUsers;
    }
    public static void movies() {
        MovieWithoutActors movie1 = new MovieWithoutActors(1, "The Shawshank Redemption", "Historical", 1994,9.2);
        MovieWithoutActors movie2 = new MovieWithoutActors(2, "The Godfather", "Fantasy", 1972, 9.1);
        MovieWithoutActors movie3 = new MovieWithoutActors(3, "The Godfather: Part II", "Action", 1966, 8);
        MovieWithoutActors movie4 = new MovieWithoutActors(4, "Pulp Fiction", "Comedy", 1994, 7.8);
        MovieWithoutActors movie5 = new MovieWithoutActors(5, "Inception", "Horror", 2010, 6.1);
        MovieWithoutActors movie6 = new MovieWithoutActors(6, "Schindler's List", "Fantasy", 1993, 4.1);
        MovieWithoutActors movie7 = new MovieWithoutActors(7, "12 Angry Men ", "Action", 1956, 9.4);
        MovieWithoutActors movie8 = new MovieWithoutActors(8, "The Dark Knight", "Romance", 1978, 7.9);
        MovieWithoutActors movie9 = new MovieWithoutActors(9, "Star Wars: Episode V - The Empire Strikes Back", "Horror", 2008, 6);
        MovieWithoutActors movie10 = new MovieWithoutActors(10, "The Lord of the Rings: The Return of the King", "Comedy", 2013, 9.7);
        MovieWithoutActors movie11 = new MovieWithoutActors(11, "Shichinin no samurai", "Historical", 2020, 4.7);
        MovieWithoutActors movie12 = new MovieWithoutActors(12, "Star Wars", "Science fiction", 2021, 7.7);
        ArrayList<MovieWithoutActors> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);

    }
    public static void search (){
        MovieWithoutActors movie1 = new MovieWithoutActors(1, "The Shawshank Redemption", "Historical", 1994,9.2);
        MovieWithoutActors movie2 = new MovieWithoutActors(2, "The Godfather", "Fantasy", 1972, 9.1);
        MovieWithoutActors movie3 = new MovieWithoutActors(3, "The Godfather: Part II", "Action", 1966, 8);
        MovieWithoutActors movie4 = new MovieWithoutActors(4, "Pulp Fiction", "Comedy", 1994, 7.8);
        MovieWithoutActors movie5 = new MovieWithoutActors(5, "Inception", "Horror", 2010, 6.1);
        MovieWithoutActors movie6 = new MovieWithoutActors(6, "Schindler's List", "Fantasy", 1993, 4.1);
        MovieWithoutActors movie7 = new MovieWithoutActors(7, "12 Angry Men ", "Action", 1956, 9.4);
        MovieWithoutActors movie8 = new MovieWithoutActors(8, "The Dark Knight", "Romance", 1978, 7.9);
        MovieWithoutActors movie9 = new MovieWithoutActors(9, "Star Wars: Episode V - The Empire Strikes Back", "Horror", 2008, 6);
        MovieWithoutActors movie10 = new MovieWithoutActors(10, "The Lord of the Rings: The Return of the King", "Comedy", 2013, 9.7);
        MovieWithoutActors movie11 = new MovieWithoutActors(11, "Shichinin no samurai", "Historical", 2020, 4.7);
        MovieWithoutActors movie12 = new MovieWithoutActors(12, "Star Wars", "Science fiction", 2021, 7.7);
        ArrayList<MovieWithoutActors> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);
        movies.forEach(movieWithoutActors -> System.out.println(
                "\n" + "Movie Number" + ": " + " " + movieWithoutActors.getNumber() + "\n" + "Title" + ": " + " " + movieWithoutActors.getTitle() + "\n" + "Genre" + ": " + " " + movieWithoutActors.getGenre() + "\n"));
    }

}
