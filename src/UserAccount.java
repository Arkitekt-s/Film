import java.io.Serializable;
import java.util.ArrayList;


public class UserAccount implements Serializable {


    private String userName;
    private String password;
    private int history;
    private ArrayList<MovieWithoutActors> favoritList;

    public UserAccount(String user, String password) {
        this.userName = user;
        this.password = password;
    }

    public UserAccount(String user, String password, int history) {
        this.userName = user;
        this.password = password;
        this.history = history;
    }

    public UserAccount(ArrayList<MovieWithoutActors> favoritList) {
        this.favoritList = favoritList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }


    @Override
    public String toString() {
        return "UserAccount{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", history=" + history +
                ", favoritList=" + favoritList +
                '}';
    }

    public static void userArrayList(ArrayList<UserAccount> users ) {
        ArrayList<ArrayList<UserAccount>> allUsersGroups = new ArrayList<>();

        allUsersGroups.add(users);

        for (int i = 0; i <allUsersGroups.size(); i++)  {

            System.out.println(allUsersGroups.get(i).toString()+"");

        }

    }
    public static String favouriteList(int number){
        ArrayList<String> arrayListF = new ArrayList<>();
        arrayListF.add("movies number"+number+ "add to favouriteList");

        for(int i = 0; i < arrayListF.size(); i++) {
            System.out.println(arrayListF.get(i)+"");
            System.out.println(arrayListF);
        }

        return null;
    }


}








