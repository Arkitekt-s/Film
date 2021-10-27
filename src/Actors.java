import java.util.ArrayList;



public class Actors {
    String name;
    String role;

    public Actors(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
public static String arrayListOfActures(int numberofFilm){
    ArrayList<String> actorsList = new ArrayList<>();
        actorsList.add("Robert De Niro"+"-"+"Jack Nicholson"+"-"+"Marlon Brando"+"-"+"Denzel Washington"+"etc.");
        actorsList.add("Johnny Depp"+"-"+"Susan Sarandon"+"-"+"Katharine Hepburn"+"-"+"Meryl Streep"+"etc.");
        actorsList.add("James Cagney"+"-"+"Kirk Douglas"+"-"+"Sidney Poitier"+"-"+"Jeff Bridges"+"etc.");
        actorsList.add("Robert De Niro"+"-"+"Ingrid Bergman"+"-"+"Angelina Jolie"+"-"+"Tom Hanks"+"etc.");
        actorsList.add("Grace Kelly"+"-"+"Cary Grant"+"-"+"Marlon Brando"+"-"+"Elizabeth Taylor"+"etc.");
        actorsList.add("Steve McQueen"+"-"+"Will Smith"+"-"+"Charlton Heston"+"-"+"Bette Davis"+"etc.");
        actorsList.add("Morgan Freeman"+"-"+"Marilyn Monroe"+"-"+"Marlon Brando"+"-"+"Ava Gardner"+"etc.");
        actorsList.add("Joan Crawford"+"-"+"Jack Nicholson"+"-"+"Gary Cooper"+"-"+"Michelle Pfeiffer"+"etc.");
        actorsList.add("Isabelle Huppert"+"-"+"Spencer Tracy"+"-"+"Marlon Brando"+"-"+"Shirley MacLaine"+"etc.");
        actorsList.add("Hilary Swank"+"-"+"Halle Berry"+"-"+"Tom Cruise"+"-"+"Peter O'Toole"+"etc.");
        actorsList.add("Julia Roberts"+"-"+"Regina King"+"-"+"Natalie Portman"+"-"+"Penélope Cruz"+"etc.");
        actorsList.add("Judy Garland"+"-"+"Cate Blanchett"+"-"+"Leonardo DiCaprio"+"-"+"Jack Lemmon"+"etc.");
    System.out.println(actorsList.get(numberofFilm-1)+" "+"play in this movie");
        return null;
}

    public static Integer ArrayListofnewRate(int rate) {


        ArrayList rates1 = new ArrayList<Integer>();
        rates1.add(rate);
        return 0;
    }
}