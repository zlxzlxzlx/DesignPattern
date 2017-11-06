package MapBuilder;

import java.util.ArrayList;

public class MapP {
	private static ArrayList<String> maps = new ArrayList<>();

    public static void add(String map) {
    	maps.add(map);
    }

    public static void show(){
        for (String map : maps) {
            System.out.println("µØÍ¼"+map);
        }
    }
}
