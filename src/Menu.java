import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void welcome(){
        //welcome message
        System.out.println("Welcome to MovieApp");
        System.out.println("1: Login ");
        System.out.println("2: Create a new account\n");
        String input=scan();
//switch case for user input
        switch (scan()) {

            case "1":
                login();
                break;

            case "2":
                register();
                break;



            default:
                System.out.println("Press 1 to login, or 2 to register");
                welcome();
                break;
        }
}




//use while loop for register users in our arraylist.
    public void register(){
        ArrayList<UserAccount> accountList = FileIo.userArrayDeserialization();

        Scanner scanner1 = new Scanner(System.in);
        ArrayList<UserAccount> userAccounts = new ArrayList<>();
        ArrayList<MovieWithoutActors> fave = new ArrayList<>();
        ArrayList arrayList = new ArrayList<String>();
        ArrayList arrayListOfUsers = new ArrayList<ArrayList<String>>();
        arrayListOfUsers.add(arrayList);
        boolean answer=true;

        do {
            System.out.println("\n" + "Do you like to register new user?(please answer yes/no?)");
            String register = scan();

            if (register.equalsIgnoreCase("yes")) {
                System.out.println("Please enter your username");
                String registerNewUser = scan();
                System.out.println("Please enter your Password");
                String password = scan();
                // I can not use useraccount class
                Database.usersAllPrint( registerNewUser,  password);
                System.out.println("Login / Please enter your username?");
                String answerNewUser=scan();
                System.out.println("Please enter your Password?");
                String answerPassword1=scan();

                if ((registerNewUser.equals( answerNewUser)) && (password.equals( answerPassword1))) {
                    arrayList.add(answerNewUser);
                    arrayList.add(answerPassword1);
                    for(int i = 0; i < arrayListOfUsers.size(); i++) {
                        System.out.println("ArrayList of users"+arrayListOfUsers);
                    }

                    System.out.println("Log in to Movie app");
                }
                else{
                    System.out.println("try again");
                    welcome();}


                Database.movies();
                // Menue of movies
                System.out.println("\n" + "Please chose your movies from list with the number 1-12" + "\n");
                //try and catch for user input
                try {

                    MovieWithoutActors.menuMovie();
                    Database.search();

                    int registerMain = Integer.parseInt(scanner1.nextLine());
                    System.out.println("\n"+"Loading ***********************************"+"\n");
                    MovieWithoutActors.arraylistMovies(registerMain);
                    System.out.println("\n"+"Movie play***********************************"+"\n");
                    Actors.arrayListOfActures(registerMain);
                    // Rate moves buy import of user
                    MovieWithoutActors.arrayListOfrate(registerMain);

                    UserAccount users = new UserAccount(registerNewUser, password,registerMain);
                    userAccounts.add(users);
                    for (int i = 0; i <userAccounts.size(); i++)  {

                        System.out.println("\n"+userAccounts.size()+" User register.");
                        System.out.println("\n"+userAccounts.get(i));
                    }
                    // set user and password each time for registration.

                    users.setUserName(registerNewUser);
                    users.setPassword(password);
                    users.setHistory(registerMain);
                    System.out.println(users.getUserName());

                    System.out.println("\n" + "Do you like to rate this Film? Yes/No");

                    String answerRate = scan();
// rate film
                    if (answerRate.equalsIgnoreCase("yes")) {
                        System.out.println("\n" + "Please enter your rate between 0-10");
                        //this method of parseInt will return int becouse scanner is a bad class.
                        double answer4 = Double.parseDouble(scanner1.nextLine());
                        if((answer4> 0.0) && (answer4 <12.0)){

                            System.out.println("YourRate in our list is");
                            MovieWithoutActors.updateListOfrate(registerMain, answer4);
                            ArrayList arrayListOfNewRate = new ArrayList<Double>();
                            for (int i =0; i <arrayListOfNewRate.size(); i++)
                            {
                                //arrayListOfNewRate.add(RateOfMovies.updateListOfrate(registerMain, answer4));
                                arrayListOfNewRate.add(answer4);

                            }
                            System.out.println("New rate "+ arrayListOfNewRate);
                        }
                        else{
                            System.out.println("Your input is wrong");
                        }
                    }
                    // add to faivouritlis
                    System.out.println("\n" + "Do you like to add it to the favour List Yes/No?");
                    String answer30 = scan();
                    if (answer30.equalsIgnoreCase("yes")) {
                        System.out.println("Your Favourit list is ");
                        // movies.get(registerMain - 1);
                        UserAccount favemovie= new UserAccount(arrayList );

                        UserAccount.favouriteList(registerMain);
                        for(int i=0;i<fave.size();i++){
                            System.out.println(favemovie.toString());

                        }
                        System.out.println("Movie number "+registerNewUser+" add to the Favourite list");
                        UserAccount.favouriteList(registerMain);

                    }
                }
                catch (Exception e)
                {System.out.println(e);
                }

                // Search function in arraylist of list of all in moviewithoutactors class
                System.out.println("\n" + "Do you like to search for movies information, or eg. production year? ");
                String answerSearch1 = scan();

                if (answerSearch1.equalsIgnoreCase("yes")) {
                    System.out.println(
                            "\n" + "Search for movie information. Please enter your search name or year ");
                    String answerSearch2 = scan();
                    MovieWithoutActors.listOfAll(answerSearch2);
                }
                System.out.println("\n" +"[[list of users]" + "," + "[password]]" + "\n"  );


                Database.usersAllPrint(registerNewUser, password);

                //UserAccount.userArrayList(users);
            }
            else if (register.equalsIgnoreCase("no")) {
                System.out.println("\n"+"Thank you for using our system");
                welcome();
                System.exit(0);
            }
            else {
                System.out.println("\n"+"Thank you for using our system");
                System.out.println("\n"+"Your input is wrong");
                System.exit(0);
                return;
            }
        }
        while (answer);

}
//login for old users
    public void login(){
        ArrayList<UserAccount> accountList = FileIo.userArrayDeserialization();
        System.out.println("We currently have " + accountList.size() + " users.");
        //cheak username and password from UserAccount
        System.out.println("Please enter your username: ");
        String username=scan();
        System.out.println("Please enter your password: ");
        String password=scan();
        boolean userExist=false;
        for (UserAccount user: accountList){
            if (user.getUserName().equals(username) && user.getPassword().equals(password)){
                userExist=true;
                System.out.println("Welcome " + user.getUserName());
            }
        }


    }
//creat method for Scanner for out work becouse scanner is not working well.
public static String scan(){
        Scanner scan= new Scanner(System.in);
        String input=scan.nextLine();
        return input;
    }

}