import java.util.ArrayList;
import java.util.Date;

public class RateOfMovies {
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
   public  static int updateListOfrate(int rate, int newRate){
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
        System.out.println("update ListOfrate"+up);


        return 0;
    }
}
