package MapBuilder;

import java.util.ArrayList;

    public class CharacterC {

      private static ArrayList<String> peoples = new ArrayList<>();

      public static void add(String people) {
    	  peoples.add(people);
      }

       public static void show(){
          for (String people : peoples) {
        System.out.println("»ÀŒÔ"+people);
        }
       }
}
