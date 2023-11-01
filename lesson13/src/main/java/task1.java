import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        ArrayList <String> countries = new ArrayList<String>();
        countries.add("Belarus");
        countries.add("USA");
        countries.add("Sweden");
        System.out.println(countries);
        countries.set(1, "China");
        System.out.println(countries);
        countries.remove( 1);
        countries.remove( "Sweden");
        System.out.println(countries);
        countries.add("Russia");
        countries.add("Poland");
        countries.add("Italy");
        System.out.println(countries);
        int index = countries.indexOf("Poland");
        System.out.printf("Index of Poland is %d %n", index);
        System.out.println(countries.contains("Russia"));
    }
}
