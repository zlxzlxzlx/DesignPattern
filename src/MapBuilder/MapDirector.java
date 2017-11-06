package MapBuilder;



public class MapDirector {
	 private MapBuilder mapBuilder;
	   public MapDirector(MapBuilder mapBuilder) {
		   this.mapBuilder=mapBuilder;
	    }
	   public void setMealBuilder(MapBuilder mapBuilder){
		   this.mapBuilder=mapBuilder;  
	   }
	   public Map construct(){
		   mapBuilder.BuildSky();
		   mapBuilder.BuildGround();
		   mapBuilder.BuildBackGround();
		return mapBuilder.getMap();
	   }
}
