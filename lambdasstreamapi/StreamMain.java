package lambdasstreamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {

	
    static List<String> places = new ArrayList<>();

    
    public static List getPlaces(){

        
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Karnataka");
        places.add("India, Bangalore");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main( String[] args ) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from India:");
        
       
        myPlaces.stream()
                .filter((p) -> p.startsWith("India"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
        
    }

}
