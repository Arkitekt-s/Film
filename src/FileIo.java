import java.io.*;
import java.util.ArrayList;


public class FileIo {

    public static void fileSerialization(ArrayList<UserAccount> userAccountArrayList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("UserAccount.ser");
            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(userAccountArrayList);
            outputStream.close();
            fileOutputStream.close();
            System.out.println(userAccountArrayList.toString());}

        catch (Exception ignored){
            System.out.println("Exception ignored");
        }
    }



    public static ArrayList<UserAccount> userArrayDeserialization() {

        ArrayList<UserAccount> userArray = null;

        try {

            FileInputStream fileInputStream=new FileInputStream("UserAccount.ser");
            ObjectInputStream objInputStream= new ObjectInputStream(fileInputStream);

            userArray=(ArrayList<UserAccount>)objInputStream.readObject();
            fileInputStream.close();
            objInputStream.close();
        }
        catch (Exception ignored) {
            System.out.println("Erorr in Deserialization");
        }

        return userArray;
    }
    public static void fileSerializationMovies(ArrayList<MovieWithoutActors> userMoviesArrayList){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("MoviesAccount.ser");
            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(userMoviesArrayList);
            outputStream.close();
            fileOutputStream.close();
            System.out.println(userMoviesArrayList.toString());}

        catch (Exception ignored){
            System.out.println("Exception ignored");
        }
    }



    public static ArrayList<UserAccount> moviesArrayDeserialization() {

        ArrayList<UserAccount> userArray2 = null;

        try {

            FileInputStream fileInputStream=new FileInputStream("MoviesAccount.ser");
            ObjectInputStream objInputStream= new ObjectInputStream(fileInputStream);

            userArray2=(ArrayList<UserAccount>)objInputStream.readObject();
            fileInputStream.close();
            objInputStream.close();
        }
        catch (Exception ignored) {
            System.out.println("Erorr in Deserialization");
        }

        return userArray2;
    }

}

