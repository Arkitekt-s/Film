import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {
        Scanner scanner1 = new Scanner(System.in);

        //2darraylist
        ArrayList<ArrayList<String>> allUsers = new ArrayList<>();
        ArrayList<String> userAccountArrayListG = new ArrayList<>();
        ArrayList<String> passwordArrayList = new ArrayList<>();
        //creat new user account for show password and email
        UserAccount users = new UserAccount(userAccountArrayListG, "Username", "Password");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("UserAccount.ser");
            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(users);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("object info saved");}
        catch (Exception e)
        {}

        MovieWithoutActors movie1=new MovieWithoutActors(1,"The Shawshank Redemption","Historical",1994,9.2);
        MovieWithoutActors movie2=new MovieWithoutActors(2,"The Godfather","Fantasy",1972,9.1);
        MovieWithoutActors movie3=new MovieWithoutActors(3,"The Godfather: Part II","Action",1966,8);
        MovieWithoutActors movie4=new MovieWithoutActors(4,"Pulp Fiction","Comedy",1994,7.8);
        MovieWithoutActors movie5=new MovieWithoutActors(5,"Inception","Horror",2010,6.1);
        MovieWithoutActors movie6=new MovieWithoutActors(6,"Schindler's List","Fantasy",1993,4.1);
        MovieWithoutActors movie7=new MovieWithoutActors(7,"12 Angry Men ","Action",1956,9.4);
        MovieWithoutActors movie8=new MovieWithoutActors(8,"The Dark Knight","Romance",1978,7.9);
        MovieWithoutActors movie9=new MovieWithoutActors(9,"Star Wars: Episode V - The Empire Strikes Back","Horror",2008,6);
        MovieWithoutActors movie10=new MovieWithoutActors(10,"The Lord of the Rings: The Return of the King","Comedy",2013,9.7);
        MovieWithoutActors movie11=new MovieWithoutActors(11,"Shichinin no samurai","Historical",2020,4.7);
        MovieWithoutActors movie12=new MovieWithoutActors(12,"Star Wars","Science fiction",2021,7.7);
        ArrayList <MovieWithoutActors> movies= new ArrayList<>();
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

        System.out.println("Welcome to MovieApp");

        //use while loop for register users in our arraylist
        boolean answer=true;
        do {

            System.out.println("\n" + "Do you like to register new user?(please answer yes/no?)");

            String register = scanner1.nextLine();


            if (register.equalsIgnoreCase("yes")) {
                System.out.println("Please enter your username");
                String registerNewUser = scanner1.nextLine();
                System.out.println("Please enter your Password");
                String password = scanner1.nextLine();
                // I can not use useraccount class
                userAccountArrayListG.add(registerNewUser);
                passwordArrayList.add(password);
                // set user and password each time for registration.
                users.setUser(registerNewUser);
                users.setPassword(password);
                System.out.println(users.toString());
                // Menue of movies
                System.out.println("\n" + "Please chose your movies from list with the number 1-12" + "\n");
                try {
                    MovieWithoutActors.menuMovie();
                    movies.forEach(movieWithoutActors -> System.out.println(
                            "\n" + "Movie Number" + ": " + " " + movieWithoutActors.getNumber() + "\n" + "Title" + ": " + " " + movieWithoutActors.getTitle() + "\n" + "Genre" + ": " + " " + movieWithoutActors.getGenre() + "\n"));
                    int registerMain = Integer.parseInt(scanner1.nextLine());
                    MovieWithoutActors.arraylistMovies(registerMain);
                    Actors.arrayListOfActures(registerMain);
                    // Rate moves buy import of user
                    RateOfMovies.arrayListOfrate(registerMain);


                    System.out.println("\n" + "Do you like to rate this Film? Yes/No");

                    String answerRate = scanner1.nextLine();
// rate film
                    if (answerRate.equalsIgnoreCase("yes")) {
                        System.out.println("\n" + "Please enter your rate between 0-10");
                        //this method of parseInt will return int becouse scanner is a bad class.
                        int answer4 = Integer.parseInt(scanner1.nextLine());
                        System.out.println("YourRate in our list is");
                        RateOfMovies.updateListOfrate(registerMain, answer4);
                    }
                    // add to faivouritlist
                    System.out.println("\n" + "Do you like to add it to the favour List Yes/No?");
                    String answer30 = scanner1.nextLine();
                    if (answer30.equalsIgnoreCase("yes")) {
                        System.out.println("your FavouritList is");
                        UserAccount.favouriteList(movies.get(registerMain - 1));
                    }
                }
                catch (Exception e)
                {System.out.println("invalid answer");
                }
                // Search function in arraylist of list of all in moviewithoutactors class
                System.out.println("\n" + "Do you like to search for movies information, or eg. production year? ");
                String answerSearch1 = scanner1.nextLine();
                if (answerSearch1.equalsIgnoreCase("yes")) {
                    System.out.println(
                            "\n" + "Search for movie information. Please enter your search name or year ");
                    String answerSearch2 = scanner1.nextLine();
                    MovieWithoutActors.listOfAll(answerSearch2);
                }
            }
            else if (register.equalsIgnoreCase("no")) {
                System.out.println("\n"+"Thank you for using our system");
                allUsers.add(userAccountArrayListG);
                allUsers.add(passwordArrayList);
                System.out.println("[[list of users]" + "," + "[password]]" + "\n" + allUsers);
                System.exit(0);
            }
            else {
                System.out.println("\n"+"Thank you for using our system");
                System.out.println("\n"+"Your input is wrong");
                allUsers.add(userAccountArrayListG);
                allUsers.add(passwordArrayList);
                System.out.println("[[list of users]" + "," + "[password]]" + "\n" + allUsers);
                System.exit(0);
                return;
            }
        }
        while (answer);
    }
}



