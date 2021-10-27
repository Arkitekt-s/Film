import java.io.Serializable;
import java.util.ArrayList;


public class UserAccount implements Serializable {

    private ArrayList<String> ArrayListUsers;
    private String User;
    private String password;


    public UserAccount(ArrayList<String> arrayListUsers, String user, String password) {
        ArrayListUsers = arrayListUsers;
        User = user;
        this.password = password;
    }

    public ArrayList<String> getArrayListUsers() {
        return ArrayListUsers;
    }

    public void setArrayListUsers(ArrayList<String> arrayListUsers) {
        ArrayListUsers = arrayListUsers;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "ArrayListUsers=" + ArrayListUsers +
                ", User='" + User + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static ArrayList userArrayList(String username, String password) {
        ArrayList<ArrayList<String>> allUsers1 = new ArrayList<>();

        ArrayList<String> userAccountArrayList = new ArrayList<>();
        userAccountArrayList.add(username);
        userAccountArrayList.add(password);
        allUsers1.add(userAccountArrayList);
        System.out.println(userAccountArrayList);
        System.out.println(allUsers1);

        return null;
    }
    public static void favouriteList(MovieWithoutActors number){
        ArrayList <String> arrayListF = new ArrayList<>();
        arrayListF.add(number.getTitle());
        System.out.println(arrayListF);
    }

}



